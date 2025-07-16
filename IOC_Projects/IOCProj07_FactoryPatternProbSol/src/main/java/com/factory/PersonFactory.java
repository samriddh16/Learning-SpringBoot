package com.factory;

import com.comps.Address;
import com.comps.Customer;
import com.comps.Employee;
import com.comps.Person;
import com.comps.Student;

public class PersonFactory {
         
         public static Person getInstance(String st) {
        	 Person per=null;
        	 System.out.println("FactoryPattenTest.main()");
        	 Address adr = new Address(23, "Patna", "India");
        	 if (st.equalsIgnoreCase("emp"))
        		 per = new Employee("Samriddh", adr, 50000, "SWE-1");
        	 else if (st.equalsIgnoreCase("std"))
        		 per = new Student("Samriddh", adr, "SpringBoot", 307);
        	 else if (st.equalsIgnoreCase("cust"))
        		 per = new Customer("Samriddh", adr, 10001, 5500);
        	 else
        		 throw new IllegalArgumentException("Illegal argument. Choose from [emp,std,cust]");
        	 
        	 return per;
         }
}
