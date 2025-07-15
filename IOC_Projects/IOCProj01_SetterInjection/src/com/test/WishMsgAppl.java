package com.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.WishMessageGenerator;

public class WishMsgAppl {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext fsx=new FileSystemXmlApplicationContext("src/com/cnfgs/applicationContext.xml");
		Object obj=fsx.getBean("wmg");
		WishMessageGenerator wsg=(WishMessageGenerator)obj;
		String msg=wsg.generateMessage("Sam");
	    System.out.println(msg);
	    fsx.close();
	}

}
