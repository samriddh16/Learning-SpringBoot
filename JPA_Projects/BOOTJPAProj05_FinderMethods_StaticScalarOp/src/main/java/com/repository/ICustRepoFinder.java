package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;
import com.view.ICustRepoView;

import java.util.List;


public interface ICustRepoFinder extends JpaRepository<Customer, Integer> {

	public List<ICustRepoView> findByCnameStartingWithOrCbillamtBetween(String st, Double start, Double end);
	
	public List<ICustRepoView> findByCnameEqualsOrCbillamtGreaterThan(String st, Double start);

	public List<ICustRepoView> findByCaddrsStartingWithOrCbillamtBetween(String st, Double start, Double end);

}
