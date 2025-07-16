package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;
import com.view.ICustRepoView;
import com.view.IRepoView1;

import java.util.List;


public interface ICustRepoFinder extends JpaRepository<Customer, Integer> {

	public <T extends ICustRepoView> List<T> findByCnameStartingWithOrCbillamtBetween(String st, Double start, Double end,Class<T> clazz);
	
	public <T extends ICustRepoView> List<T> findByCnameEqualsOrCbillamtGreaterThan(String st, Double start, Class<T> clazz);

}
