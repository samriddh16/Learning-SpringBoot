package com.service;

import java.util.List;

import com.entity.Doctor;
import com.entity.Patient;

public interface IDocPatService {

	public void saveDataDoctor(List<Doctor> doclist);
	
	public void saveDataPatient(List<Patient> patlist);

	void loadDataUsingDoctor();

	void loadDataUsingPatient();
}
