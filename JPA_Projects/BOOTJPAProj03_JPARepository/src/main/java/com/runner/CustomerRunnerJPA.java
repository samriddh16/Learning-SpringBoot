package com.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.ICustomerService;

@Component("runner")
public class CustomerRunnerJPA implements CommandLineRunner {

    @Autowired
    ICustomerService service;

	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			String msg = service.custServiceDeleteIDBatch(Arrays.asList(1055,1058,null));
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Customer cust = service.custServiceGetRefId(1057);
			System.out.println(cust.getClass());
			System.out.println(cust.getCid());
			System.out.println(cust.getCname());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			service.custServiceFindAll(new Customer(null,"Sam,","Hyderabad",null), true, "cbillamt","cname").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			service.custServiceSaveFlush(List.of(new Customer(734,"Sam","Patna",54893.0),new Customer(789,"Ram","Delhi",78232.0))).forEach(System.out::println);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
