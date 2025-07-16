package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
       
	@Autowired
	@Qualifier("py")
	CourseMaterial cm;

	@Override
	public String toString() {
		return "Student learing from " + cm ;
	}
	
}
