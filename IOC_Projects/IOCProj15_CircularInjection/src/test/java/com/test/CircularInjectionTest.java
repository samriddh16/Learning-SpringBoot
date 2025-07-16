package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.ClassA;

public class CircularInjectionTest {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		ClassA res= cpx.getBean(ClassA.class);
		
		System.out.println(res);       
	}
}
