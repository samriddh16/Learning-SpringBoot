package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbeans.Student;

public class StudentTest {
        
	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		Student std = cpx.getBean(Student.class);
		System.out.println(std);
	}
}
