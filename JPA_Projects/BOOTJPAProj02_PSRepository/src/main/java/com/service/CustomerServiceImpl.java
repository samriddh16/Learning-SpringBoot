package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.ICustomerPageSort;

@Service("custservice")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerPageSort ps;
	
	@Override
	public Iterable<Customer> custServiceSortedCustomer(Boolean b, String... args) {
		Sort sort = Sort.by(b?Direction.ASC:Direction.DESC, args);
		Iterable<Customer> it=ps.findAll(sort);
		return it;
	}

	@Override
	public Iterable<Customer> custServiceSortedCustomer(Order... orders) {
		Sort sort = Sort.by(orders);
		Iterable<Customer> it=ps.findAll(sort);
		return it;
	}

	@Override
	public Page<Customer> custServiceGetPages(int pageno, int pagesize) {
		Pageable pageable = PageRequest.of(pageno, pagesize);
		Page<Customer> page = ps.findAll(pageable);
		return page;
	}

	// First sorting will be performed then paging is done
	@Override
	public Page<Customer> custServiceGetSortedPages(int pageno, int pagesize, boolean b, String... args) {
		Sort sort = Sort.by(b?Direction.ASC:Direction.DESC,args);
		Pageable pageable = PageRequest.of(pageno, pagesize, sort);
		Page<Customer> page = ps.findAll(pageable);
		return page;
	}

	@Override
	public void custServiceGetPageByPage(int pageSize) {
		//get total records count
	    long count=ps.count();
	    // get pages count
	    long pagesCount=count/pageSize;
	    pagesCount=(count%pageSize==0)?pagesCount:++pagesCount;
	     
	    for(int i=0;i<pagesCount;++i) {
	       //prepare the Pageable object
	       Pageable pageable=PageRequest.of(i,pageSize);
	       Page<Customer> page=ps.findAll(pageable);
	       page.forEach(System.out::println);
	       System.out.println("--------------  "+(page.getNumber()+1)+"/"+page.getTotalPages()+"------------------");
	     }
	}

}
