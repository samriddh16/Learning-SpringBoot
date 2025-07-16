package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Customer;


public interface ICustRepoHQL extends JpaRepository<Customer, Integer> {

	// Entity class name or its properties name should have same case(upper or lower) as original
	// Select from Customer --> Invalid
	@Query("select cust from Customer cust")
	public List<Customer> getAllRecords();
	
	// Positional parameters will always start from 1 and increase in continous manner(no gap)
	@Query("from Customer where caddrs=?1 and cbillamt>=?2")
	public List<Customer> getAllRecords1(String st, Double bill);
	
	// We cannot take mixture of named and positional parameters
	@Query("from Customer where cname=:name1 and cbillamt>=:bill1 ")
	public List<Customer> getAllRecords2(@Param("name1") String name, @Param("bill1") Double bill);
	
	@Query("from Customer where cname=:name and cbillamt>=:bill ")
	public List<Customer> getAllRecords3(String name, Double bill);
	
	@Query("select cid,cname,cbillamt from Customer where cname in(:name1,:name2) ")  // scalar -projection (selecting specific multiple col values)
	public List<Object[]> getCustomerData(String name1,String name2);
	
	@Query("select caddrs from Customer where cname like :initChars ")  // scalar -projection (selecting specific single col values)
	public  List<String>  findCustomerAddrsByNameChars(String  initChars);
	
	// If more than 1 record is returned from the database then it will throw exception
	@Query(" from Customer where caddrs=:addrs ")
	public  Customer  findCustomerDataByAddrs(String addrs);
	
	// If more than 1 record is returned from the database then it will throw exception
	@Query("select cid,cname,cbillamt from Customer where caddrs=:addrs")
	public  Object  fetchCustomerDetailsByAddrs(String addrs);
	
	// If more than 1 record is returned from the database then it will throw exception
	@Query("select cname from Customer where caddrs=:addrs")
	public  String  fetchCustomerNameByAddrs(String addrs);
	
	@Query("select count(distinct caddrs) from Customer")
	public  int fetchAllCustmerCountByAddrs();
	
	@Query("select count(*), max(cbillamt), min(cbillamt),avg(cbillamt), sum(cbillamt) from Customer")
	public  Object fetchCustomerAggregateData();
	
	// It is important to include @Transactional here as it is an update operation, so if any
	// failure happens in between then whole update will be rolledback and if not then committed
	// Update and delete HQL queries return the no. of rows updated or deleted
	@Query("update Customer set cbillamt=cbillamt-(cbillamt*:percentage/100) where caddrs in(:city1,:city2)")
	@Transactional
	@Modifying
	public int updateCustomerByCaddrs(int percentage, String city1, String city2);
	
	// It is important to include @Transactional here as it is an update operation, so if any
    // failure happens in between then whole update will be rolledback and if not then committed
	// Update and delete HQL queries return the no. of rows updated or deleted
	@Query("delete from Customer where caddrs in(:city1)")
	@Transactional
	@Modifying
	public int deleteCustomerByCaddrs(String city1);
}
