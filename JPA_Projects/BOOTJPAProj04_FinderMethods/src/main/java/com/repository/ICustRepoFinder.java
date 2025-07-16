package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;
import java.util.List;


public interface ICustRepoFinder extends JpaRepository<Customer, Integer> {

	public List<Customer> findByCnameEquals(String cname);
	
	public List<Customer> findByCnameIn(List<String> cnamelist); // we can also pass vargs here
	
	public List<Customer> findByCnameEqualsAndCaddrs(String cname, String caddrs);
	
	public List<Customer> findByCnameEqualsOrCaddrs(String cname, String caddrs);
	
	public List<Customer> findByCbillamtBetween(Double start, Double end);
	
	public List<Customer> findByCnameStartingWith(String st);
	
	public List<Customer> findByCnameEndingWith(String st);
	
	public List<Customer> findByCnameContaining(String st);
	
	public List<Customer> findByCnameStartingWithIgnoreCaseAndCbillamtGreaterThanEqual(String st, Double bill);
	
	public List<Customer> findByCaddrsInIgnoreCaseAndCbillamtLessThanEqual(List<String> stl, Double bill);
	
}
