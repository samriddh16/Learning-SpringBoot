package com.test;

import java.util.Arrays;

class Test{


	public void display() {
		String st="Consistency is hardwork";
		System.out.println("Hello");
	}
	
}

public class ClassPropertyTest {

	public static void main(String[] args) {
		Class<Test> c = Test.class;
		System.out.println(c.getClass());
		System.out.println(c.getSuperclass());
		System.out.println(Arrays.toString(c.getDeclaredMethods()));
		System.out.println(c.getName());
		System.out.println(c.getPackageName());
		System.out.println(c.toString());
	}

}
