package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

// PL/SQL Procedure in Mysql
/*CREATE DEFINER=`root`@`localhost` PROCEDURE `p_get_CustomerDetailsByBillamt`(IN startamt float,
												   IN endamt float)
BEGIN
select * from jpa_customer_info where cust_billamt>=startamt and cust_billamt<=endamt;
END*/

// We don't have cursors in mysql. It returns records in form of resultset object by itself
@Service("custservice")
public class CustServicePLSQLImpl implements ICustServicePlSQL {

	@Autowired
	EntityManager em;
	
	@Override
	public List<Customer> callingPlSqlProd(Double st, Double end) {
	
		StoredProcedureQuery query = em.createStoredProcedureQuery("p_get_CustomerDetailsByBillamt", Customer.class);
		query.registerStoredProcedureParameter(1, Float.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
		
		query.setParameter(1, st);
		query.setParameter(2, end);
		
		List<Customer> list=query.getResultList();
		return list;
	}

}
