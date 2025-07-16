package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.CustController;
import com.model.CustModel;

public class CustRealtimeTest {

	public static void main(String[] args) {
		CustModel mod= new CustModel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer's name- ");
		mod.setCustname(sc.nextLine());
		System.out.println("Enter customer's address- ");
		mod.setCustaddr(sc.nextLine());
		System.out.println("Enter customer's payment- ");
		mod.setPayment(sc.nextFloat());
		System.out.println("Enter customer's deposit time period- ");
		mod.setTime(sc.nextFloat());
		System.out.println("Enter customer's rate- ");
		mod.setRate(sc.nextFloat());
		
		try {
		ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");	
		CustController cc = cpx.getBean(CustController.class);
		
		String result=cc.controlFlow(mod);
		System.out.println(result);
		} catch (SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
