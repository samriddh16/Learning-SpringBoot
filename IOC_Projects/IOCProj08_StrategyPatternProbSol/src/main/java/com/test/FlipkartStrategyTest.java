package com.test;

import com.comps.Flipkart;
import com.factory.FlipkartFactory;

public class FlipkartStrategyTest {
         
	public static void main(String args[]) {
		try {
			Flipkart fp=FlipkartFactory.getInstance("blue");
			System.out.println(fp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
