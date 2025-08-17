package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricketer;

public class TraditionalDLTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		Cricketer cric = cpx.getBean(Cricketer.class);
		System.out.println(cric.getClass());
		System.out.println(cric.getClass().getSuperclass());
		cric.fielding();
		cric.balling();
		cric.batting();
		cpx.close();
	}

}
