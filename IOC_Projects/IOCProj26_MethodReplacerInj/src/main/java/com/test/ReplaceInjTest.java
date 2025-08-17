package com.test;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.InterestCalc;

public class ReplaceInjTest {

	public static void main(String[] args) {
		try (   Scanner sc = new Scanner(System.in);
				ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml")) {
			System.out.println("Enter principal amount- ");
			double p = sc.nextDouble();
			System.out.println("Enter rate - ");
			double r = sc.nextDouble();
			System.out.println("Enter time - ");
			double t = sc.nextDouble();
			InterestCalc ic = cpx.getBean(InterestCalc.class);
			double result = ic.intCalc(p, r, t);
			System.out.println("Interest Amount- "+result);
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
