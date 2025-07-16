package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.repository.ICustRepoHQL;

@Component("runnerhql")
public class CustRunnerHQLNonSelectQ implements CommandLineRunner {

	@Autowired
	ICustRepoHQL repo;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*int count = repo.updateCustomerByCaddrs(9, "Mumbai", "Chennai");
			System.out.println(count+" no. of rows are updated");*/
			
			int count = repo.deleteCustomerByCaddrs("Chennai");
            System.out.println(count+" no. of rows are deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
