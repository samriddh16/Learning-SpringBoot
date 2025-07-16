package com.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.repository.ICustRepoHQL;

// Insert queries are possible in HQL in hibernate but not in Spring Data JPA
@Component("runner")
public class CustRunnerHQLSelectQ implements CommandLineRunner {
	
	@Autowired
	ICustRepoHQL repo;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*repo.getAllRecords().forEach(System.out::println);
			repo.getAllRecords1("Delhi", 30000.0).forEach(System.out::println);
			repo.getAllRecords2("Sam", 40000.0).forEach(System.out::println);*/
			
			/*List<Object[]> list=repo.getCustomerData("Sam","Ram");
			list.forEach(row->{
				for(Object val:row) {
					System.out.print(val+"  ");
				 }
				 System.out.println();
			  });
			
			List<String> list1=repo.findCustomerAddrsByNameChars("S%");
			list1.forEach(addrs->{
				System.out.println(addrs);
			});
			
			Customer cust=repo.findCustomerDataByAddrs("Hyd");
			System.out.println(cust);
			
			Object  object=repo.fetchCustomerDetailsByAddrs("Hyd");
			Object  data[]=(Object[])object;
			System.out.println("Customer details ::"+Arrays.toString(data));
			
			System.out.println(" custome name ::"+repo.fetchCustomerNameByAddrs("Mumbai"));
			
			System.out.println("Customers count::"+repo.fetchAllCustmerCountByAddrs());
			
			Object obj = repo.fetchCustomerAggregateData();
			Object[] output = (Object[]) obj;
			System.out.println("Aggregated Data- "+Arrays.toString(output));*/
		    
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
