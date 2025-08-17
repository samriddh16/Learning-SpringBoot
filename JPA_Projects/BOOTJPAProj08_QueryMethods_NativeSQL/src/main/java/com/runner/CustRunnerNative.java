package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.repository.ICustRepoNative;

@Component("runnerhql")
public class CustRunnerNative implements CommandLineRunner {

	@Autowired
	ICustRepoNative repo;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*int count = repo.insertCustomer("Patna", "Sam", 78393.0);
			repo.insertCustomer("Patna", "Sam", 78393.0);
			repo.insertCustomer("Hyd", "Ayush", 63483.0);
			repo.insertCustomer("Delhi", "Rahul", 58593.0);
			repo.insertCustomer("Patna", "Kesari", 34903.0);*/
			int count = repo.insertCustomer(123, "Hyd", "Sundar", 32478.0);
		    if(count==0)
		    	System.out.println("No records inserted");
		    else
		    	System.out.println(count+" no. of records inserted");
		    
		    int count1=repo.createTempTable();
			System.out.println("table created");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
