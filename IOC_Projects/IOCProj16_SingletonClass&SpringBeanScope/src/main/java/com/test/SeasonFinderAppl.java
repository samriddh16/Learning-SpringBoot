package com.test;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Printer;
import com.beans.SeasonFinder;

public class SeasonFinderAppl {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		SeasonFinder s1 = cpx.getBean(SeasonFinder.class);
		SeasonFinder s2 = cpx.getBean(SeasonFinder.class);	
		System.out.println("s1==s2?- "+(s1==s2));
		
		LocalDate l1= cpx.getBean(LocalDate.class);
		LocalDate l2= cpx.getBean(LocalDate.class);
		System.out.println("l1==l2?- "+(l1==l2));
		
		Printer p1= cpx.getBean("printer1",Printer.class);
		Printer p2= cpx.getBean("printer2",Printer.class);
		System.out.println("p1==p2?- "+(p1==p2));
	}

}
