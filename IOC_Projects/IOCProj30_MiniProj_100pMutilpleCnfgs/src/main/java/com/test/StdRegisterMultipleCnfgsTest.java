package com.test;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;
import com.controller.StdController;
import com.model.StdModel;

public class StdRegisterMultipleCnfgsTest {

	public static void main(String[] args) {
		StdModel mod= new StdModel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's name- ");
		mod.setStdname(sc.nextLine());
		System.out.println("Enter student's course- ");
		mod.setStdcourse(sc.nextLine());
		System.out.println("Enter student's marks1- ");
		mod.setMarks1(sc.nextFloat());
		System.out.println("Enter student's marks2- ");
		mod.setMarks2(sc.nextFloat());
		System.out.println("Enter student's marks3");
		mod.setMarks3(sc.nextFloat());
		
		try {
		AnnotationConfigApplicationContext ax= new AnnotationConfigApplicationContext(AppConfig.class);	
		StdController cc = ax.getBean(StdController.class);		
		String result=cc.controlFlow(mod);
		System.out.println(result);
		
		} catch (SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
