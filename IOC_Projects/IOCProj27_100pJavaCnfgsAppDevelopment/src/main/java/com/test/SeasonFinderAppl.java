package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.SeasonFinder;
import com.config.AppConfig;

public class SeasonFinderAppl {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext afx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("-------------PreInstantiation Stage Completed--------------");
		SeasonFinder season = afx.getBean(SeasonFinder.class);
		System.out.println("----------Getting bean object------------");
		String msg=season.findSeasonName("Samriddh");
		System.out.println("------------------Calling business method in bean class-----------------");
	    System.out.println(msg);
	    System.out.println("------------Printing result=------------");
	    afx.close();
	}

}
