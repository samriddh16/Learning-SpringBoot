package com.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.SeasonFinder;

public class SeasonFinderAppl {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext fsx=new FileSystemXmlApplicationContext("src/com/cnfgs/applicationContext.xml");
		Object obj=fsx.getBean("sf");
		SeasonFinder wsg=(SeasonFinder)obj;
		String msg=wsg.generateMessage();
	    System.out.println(msg);
	    fsx.close();
	}

}
