package com.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.Doctor;
import com.entity.Patient;
import com.service.IDocPatService;

@Component("runner")
public class DocPatRunner implements CommandLineRunner {
	
	@Autowired
	IDocPatService service;

	@Override
	public void run(String... args) throws Exception {
		
		Doctor doc1 = new Doctor("Samriddh","Neurosurgeon");
		Doctor doc2 = new Doctor("Rahul","Dentist");
		Doctor doc3 = new Doctor("Ayush","Gas");
		
		Patient pat1 = new Patient("Aditya",30,"Heart");
		Patient pat2 = new Patient("Kamlesh",45,"Gas");
		Patient pat3 = new Patient("Ram",50,"Calcium");
		Patient pat4 = new Patient("Shyam",30,"Liver");
		Patient pat5 = new Patient("Susheel",40,"Cavity");
		
		/*// Linking only one side works here
		doc1.setPatients(List.of(pat1,pat2,pat4));
		doc2.setPatients(List.of(pat3,pat5));
		doc3.setPatients(List.of(pat2,pat5));
		
		try {
			service.saveDataDoctor(List.of(doc1,doc2,doc3));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*pat1.setDoctors(List.of(doc1));
		pat2.setDoctors(List.of(doc1,doc3));
		pat3.setDoctors(List.of(doc2));
		pat4.setDoctors(List.of(doc1));
		pat5.setDoctors(List.of(doc2,doc3));
		
		try {
			service.saveDataPatient(List.of(pat1,pat2,pat3,pat4,pat5));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			/*service.loadDataUsingDoctor();*/
			service.loadDataUsingPatient();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
