package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricketer;

public class TraditionalDLTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		Cricketer cric = cpx.getBean(Cricketer.class);
		cric.fielding();
		cric.balling(cpx);
		cric.batting(cpx);
		cpx.close();
	}

}
