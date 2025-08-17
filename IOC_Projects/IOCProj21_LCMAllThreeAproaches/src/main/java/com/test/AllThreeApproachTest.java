package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Voter;

public class AllThreeApproachTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		Voter v1 = cpx.getBean(Voter.class);
		System.out.println(v1);
		cpx.close();
   }

}
