package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Doctor;
import com.entity.Patient;
import com.repository.IDocRepo;
import com.repository.IPatRepo;

@Service("docpatservice")
public class IDocPatImpl implements IDocPatService {
	
	@Autowired
	IDocRepo drepo;
	
	@Autowired
	IPatRepo prepo;

	// We have to use saveAll method here. With save method some problem is there
	@Override
	public void saveDataDoctor(List<Doctor> doclist) {
		/*drepo.saveAll(doclist).forEach(doc->{
			System.out.println("Doctor-> "+doc);
			doc.getPatients().forEach(System.out::println);
			System.out.println("-----------------------------------------------");
		});*/
		
		// Do not use this
		/*System.out.println(drepo.save(doclist.get(1)));
		System.out.println("-------------------------------------------");
		System.out.println(drepo.save(doclist.get(2)));*/
		
	}

	@Override
	public void saveDataPatient(List<Patient> patlist) {
	    prepo.saveAll(patlist).forEach(pat->{
	    	System.out.println("Patient-> "+pat);
	    	pat.getDoctors().forEach(System.out::println);
	    	System.out.println("-----------------------------------------------");
	    });
	}
	
	@Override
	public void loadDataUsingDoctor() {
		List<Doctor> list=drepo.findAll();
		list.forEach(doc->{
			System.out.println("parent:"+doc);
			//get patients of a Doctor
			List<Patient> patients=doc.getPatients();
			patients.forEach(pat1->{
				System.out.println("child::"+pat1);
			});
			System.out.println("__________________________");
		});		
	}
	
	@Override
	public void loadDataUsingPatient() {
		List<Patient> list=prepo.findAll();
		list.forEach(pat->{
			System.out.println("child:"+pat);
			//get Doctors of each Patient
			List<Doctor> doctors=pat.getDoctors();
			doctors.forEach(doc1->{
				System.out.println("parent::"+doc1);
			});
			System.out.println("__________________________");
		});
		
	}

}
