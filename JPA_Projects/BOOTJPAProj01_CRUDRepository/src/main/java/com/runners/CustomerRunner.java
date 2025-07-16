package com.runners;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.repository.CustomerRepo;
import com.service.CustomerServiceImpl;
import com.service.ICustomerService;

@Component("runner")
public class CustomerRunner implements CommandLineRunner {

    private final CustomerRepo customerRepo;

    private final CustomerServiceImpl cust;
	
	@Autowired
	ICustomerService service;

    CustomerRunner(CustomerServiceImpl cust, CustomerRepo customerRepo) {
        this.cust = cust;
        this.customerRepo = customerRepo;
    }

	@Override
	public void run(String... args) throws Exception {
		/*Scanner sc = new Scanner(System.in);
		Customer cust = new Customer();
		System.out.println("Enter customer name- ");
		cust.setCname(sc.next());
		System.out.println("Enter customer addrs- ");
		cust.setCaddrs(sc.next());
		System.out.println("Enter customer bill amount- ");
		cust.setCbillamt(sc.nextDouble());*/
		
		/*List<Customer> list = List.of(new Customer("Samriddh","Patna",89000.0),new Customer("Neelay","Raipur",85000.0));
		
		String msg = service.custServiceGroupImp(list);
		System.out.println("Message- "+msg);*/
		
		/*try {
			System.out.println("Enter customer ID- ");
			int id = sc.nextInt();
			Boolean b = service.custServiceExistId(id);
			if(b)
			    System.out.println("Customer with ID-"+id+" exists");
			else
				System.out.println("Customer with ID-"+id+" does not exists");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Iterable<Customer> cust = service.custServiceFindAllId(List.of(1001, 1002, 1004, 1005, 2001, 2002, 2005));
			cust.forEach(c->System.out.println(c));  //1
			cust.forEach(System.out::println);       //2
			Iterator<Customer> iter = cust.iterator();
			while(iter.hasNext())
				System.out.println(iter.next());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Iterable<Customer> cust = service.custServiceFindAll();
			cust.forEach(c->System.out.println(c));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println("Count of customers- "+service.custServiceCount());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceFindId(1004));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceExtractId(13004));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceFetchId(1004));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceGetId(13004));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceDeleteId(1007));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceDelete(new Customer(10006,"Delhi","Rahul",45000.0)));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceDeleteAll());
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceDeleteAllId(List.of(1022, 1027, 1035)));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServiceDeleteAll(List.of(new Customer(1029,"Delhi","Rahul",89000.0),new Customer(1038,"Delhi","Vikas",83000.0))));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(service.custServicePartialUpdate(10330, 10.0));
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(service.custServiceRegisterOrUpdate(new Customer("Hyderabad","Ayush",56000.0)));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
