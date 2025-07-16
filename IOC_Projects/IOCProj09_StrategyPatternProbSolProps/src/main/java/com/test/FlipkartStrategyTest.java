package com.test;

import com.comps.Flipkart;
import com.factory.FlipkartFactory;

public class FlipkartStrategyTest {
         
	public static void main(String args[]) {
			Flipkart fp=FlipkartFactory.getInstance();
			System.out.println(fp);
	}
}
