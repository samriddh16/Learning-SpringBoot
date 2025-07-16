package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.ICustomerJPA;

@Service("custservice")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerJPA jpa;

	// deleteAllByIdInBatch method runs internally only delete query and not any select query which I think is also
	// applicable to other repositories delete methods too and also only one delete query unlike the delete methods
	// in crud repo. We can also pass invalid ids or null value in place of ids. It will not throw any exception.
	@Override
	public String custServiceDeleteIDBatch(Iterable<Integer> list) {
		List<Customer> l = jpa.findAllById(list);
		if(l.size()>0) {
			jpa.deleteAllByIdInBatch(list);
			return l.size()+" no. of records are found and deleted";
		}
		return "Records not found in the database";
	}

	// Works on lazy loading, i.e when neccessary then only the record will be fetched from the database
	// otherwise not and also if entity not found then exception will be thrown.
	@Override
	public Customer custServiceGetRefId(Integer id) {
		Customer cust = jpa.getReferenceById(id);
		return cust;
	}

	// It perform 'and' clause operation on the non-null fields of the customer object and then find the records
	// Performs one select query only
	@Override
	public List<Customer> custServiceFindAll(Customer cust, Boolean order, String... strings) {
		Example<Customer> ex = Example.of(cust);
		Sort sort = Sort.by(order?Direction.ASC:Direction.DESC,strings);
		List<Customer> list = jpa.findAll(ex, sort);
		return list;
	}

	// This save method also works like save method of crud repo as for id values not present in the database
	// it throws exceptions and for null id value it generated id value through the sequence configured
	@Override
	public List<Customer> custServiceSaveFlush(List<Customer> cust) {
		List<Customer> c = jpa.saveAllAndFlush(cust);
		return c;
	}

}
