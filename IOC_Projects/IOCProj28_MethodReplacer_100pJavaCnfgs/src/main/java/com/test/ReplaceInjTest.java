package com.test;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.InterestCalc;
import com.config.ReplacerConfig;

public class ReplaceInjTest {

	public static void main(String[] args) {
		try (   Scanner sc = new Scanner(System.in);
				AnnotationConfigApplicationContext ax = new AnnotationConfigApplicationContext(ReplacerConfig.class);) {
			System.out.println("Enter principal amount- ");
			double p = sc.nextDouble();
			System.out.println("Enter rate - ");
			double r = sc.nextDouble();
			System.out.println("Enter time - ");
			double t = sc.nextDouble();
			InterestCalc ic = ax.getBean(InterestCalc.class);
			double result = ic.intCalc(p, r, t);
			System.out.println("Interest Amount- "+result);
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
