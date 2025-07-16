package com.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.document.DrivingLicense;
import com.document.Person;
import com.service.IOneToOneAssociationMgmtService;

@Component("runner")
public class OTOPersonDrivingRunner implements CommandLineRunner {
	
	@Autowired
	IOneToOneAssociationMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		// Remember one thing if we are using the inbuilt id generator of mongodb then for the nested
		// entity object in the database the id value will not be generated
		/* //saving data using parent
		try {
		Person per=new Person("raja", "hyd", 40);
		DrivingLicense license=new DrivingLicense("LMV",LocalDate.now(),LocalDate.of(2024, 10, 24));
		//add child to the parent 
		per.setLicenseDetails(license);
		 //use service
		System.out.println(service.saveDataUsingPerson(per));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	 //saving data using child
		try {
			Person per=new Person("raja1", "hyd1", 41);
			DrivingLicense license=new DrivingLicense("LMV",LocalDate.now(),LocalDate.of(2024, 11, 25));
			//add parent to the child 
			license.setPersonDetails(per);
		 //use service
			System.out.println(service.saveDataUsingDrivingLicense(license));
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		//showing data using parent
		   service.showDataUsingPerson().forEach(per->{
			   System.out.println("parent::"+per);
			   DrivingLicense license=per.getLicenseDetails();
			   System.out.println("Child::"+license);
		   });
		 //showing  data using child
		   service.showDataUsingDrivingLicense().forEach(lic->{
			   System.out.println("child ::"+lic);
			   Person per=lic.getPersonDetails();
			   System.out.println("parent::"+per);
		   });

	}

}
