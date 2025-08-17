package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Customer;


public interface ICustRepoNative extends JpaRepository<Customer, Integer> {

	// Giving cid here also works
	@Query(value="INSERT INTO JPA_CUSTOMER_INFO(CUST_ID,CUST_ADDR,CUST_BILLAMT,CUST_NAME) VALUES(:cid,:addrs,:bill,:cname)",
	         nativeQuery = true)
    @Modifying
    @Transactional
    public int insertCustomer(int cid, String addrs,String cname,double bill);

	// It also works like this unlike natraj sir's query
	/*@Query(value="INSERT INTO JPA_CUSTOMER_INFO VALUES(CUST_SEQ.NEXTVAL,:addrs,:bill,:cname)",
	         nativeQuery = true)
	@Modifying
	@Transactional
	public int insertCustomer(String addrs,String cname,double bill);*/


    @Query(value="CREATE TABLE TEMP1(Col1 NUMBER(10),COL2 NUMBER(20))", nativeQuery = true)
    @Modifying
    @Transactional
    public int createTempTable();
    
}
