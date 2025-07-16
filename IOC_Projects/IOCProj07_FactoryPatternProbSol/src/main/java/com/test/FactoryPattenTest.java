package com.test;

import com.comps.Person;
import com.factory.PersonFactory;

public class FactoryPattenTest {
           
	public static void main(String args[]) {
		Person per=null;
		try {
			per=PersonFactory.getInstance("emp");
			System.out.println(per);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
  }
}
