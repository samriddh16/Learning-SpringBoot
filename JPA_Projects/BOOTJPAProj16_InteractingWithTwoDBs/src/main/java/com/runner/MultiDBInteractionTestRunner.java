package com.runner;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.offers.Offers;
import com.entity.product.Product;
import com.service.IProductMgmtService;



@Component
public class MultiDBInteractionTestRunner implements CommandLineRunner {
	@Autowired
	private  IProductMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		/*//save products
		List<Product> prodList=List.of(new Product("table", 90000.0, 10.0, true, LocalDateTime.of(2090, 10,20,12,11,33)), 
				                                             new Product("chair", 9000.0, 10.0, true, LocalDateTime.of(2090, 10,20,12,11,33)));
		service.registerProducts(prodList);
		System.out.println("-----------------------------------");
		//save offers
		List<Offers> offersList=List.of(new Offers("MonsoonOffer", 40.0f,LocalDateTime.now(),LocalDateTime.of(2023, 10,20,12,11,33)), 
				                                           new Offers("GreatIndianSale", 40.0f,LocalDateTime.now(),LocalDateTime.of(2023, 9,20,12,11,33)));
		service.registerOffers(offersList);*/
		
		service.showAllProducts().forEach(System.out::println);
		System.out.println("____________________");
		service.showAllOffers().forEach(System.out::println);


	}

}
