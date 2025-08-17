package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

// PL/SQL Procedure in Oracle
/*CREATE OR REPLACE PROCEDURE P_CUSTOMERS_BY_BILLAMT_RANGE 
(
  STARTAMOUNT IN FLOAT 
, ENDAMOUNT IN FLOAT 
, DETAILS OUT SYS_REFCURSOR 
) AS 
BEGIN
   OPEN DETAILS FOR
        SELECT * FROM JPA_CUSTOMER_INFO WHERE CUST_BILLAMT>=STARTAMOUNT AND CUST_BILLAMT<=ENDAMOUNT;
END P_CUSTOMERS_BY_BILLAMT_RANGE;*/

@Service("custservice")
public class CustServicePLSQLImpl implements ICustServicePlSQL {

	@Autowired
	EntityManager em;
	
	@Override
	public List<Customer> callingPlSqlProd(Double st, Double end) {
	
		StoredProcedureQuery query = em.createStoredProcedureQuery("P_CUSTOMERS_BY_BILLAMT_RANGE", Customer.class);
		query.registerStoredProcedureParameter(1, Float.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Void.class, ParameterMode.REF_CURSOR);
		
		query.setParameter(1, st);
		query.setParameter(2, end);
		
		List<Customer> list=query.getResultList();
		return list;
	}

}
