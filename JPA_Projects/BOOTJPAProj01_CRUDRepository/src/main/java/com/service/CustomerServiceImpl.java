package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.CustomerRepo;

@Service("cust")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	CustomerRepo crud;

	@Override
	public String custService(Customer c) {
		System.out.println(crud.getClass());
		System.out.println("Before Save- " + c);
		Customer cust1 = crud.save(c);
		System.out.println("After Save- " + cust1);
		return "Customer record is inserted with Cust_ID- " + cust1.getCid();
	}

	@Override
	public String custServiceGroup(Iterable<Customer> cust) {
		if (cust != null) {
			System.out.println(crud.getClass());
			System.out.println("Before Save- " + (Collection<Customer>) cust);
			int size = ((Collection<Customer>) cust).size();
			Iterable<Customer> iter = crud.saveAll(cust);
			List<Integer> list = new ArrayList<>();
			iter.forEach(c -> {
				list.add(c.getCid());
			});
			System.out.println("After Save- " + (Collection<Customer>) iter);

			return "Size- " + size + " ID Values- " + list.toString();
		} else {
			throw new IllegalArgumentException("Invalid.Customer list is null.");
		}

	}

	@Override
	public String custServiceGroupImp(Iterable<Customer> cust) {
		if (cust != null) {
			System.out.println(crud.getClass());
			System.out.println("Before Save- " + (Collection<Customer>) cust);
			int size = ((Collection<Customer>) cust).size();
			Iterable<Customer> iter = crud.saveAll(cust);
			List<Integer> list = (List<Integer>) ((Collection<Customer>) iter).stream()
					.map(c -> ((Customer) c).getCid()).collect(Collectors.toList());
			System.out.println("After Save- " + (Collection<Customer>) iter);

			return "Size- " + size + " ID Values- " + list.toString();
		} else {
			throw new IllegalArgumentException("Invalid.Customer list is null.");
		}
	}

	@Override
	public Boolean custServiceExistId(Integer id) {
		return crud.existsById(id);
	}

	@Override
	public Iterable<Customer> custServiceFindAllId(Iterable<Integer> ids) {
		Iterable<Customer> cust = crud.findAllById(ids);
		return cust;
	}

	@Override
	public Iterable<Customer> custServiceFindAll() {
		Iterable<Customer> cust = crud.findAll();
		return cust;
	}

	@Override
	public long custServiceCount() {
		Long count = crud.count();
		return count;
	}

	@Override
	public String custServiceFindId(Integer id) {
		Optional<Customer> cust = crud.findById(id);
		if (cust.isPresent())
			return "Customer ID-" + id + " -->" + cust.get();
		else
			return "Customer ID-" + id + " not found";
	}

	@Override
	public Customer custServiceExtractId(Integer id) {
		Optional<Customer> cust = crud.findById(id);
		if (cust.isPresent())
			return cust.get();
		else
			throw new IllegalArgumentException("Customer ID- " + id + " not found");
	}

	@Override
	public Customer custServiceFetchId(Integer id) {
		Customer cust = crud.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Customer ID- " + id + " not found"));
		return cust;
	}

	@Override
	public Customer custServiceGetId(Integer id) {
		Customer cust = crud.findById(id).orElse(new Customer(2001, "Sam", "Hyderabad", 89000.0));
		return cust;
	}

	@Override
	public String custServiceDeleteId(Integer id) {
		Optional<Customer> cust = crud.findById(id);
		if (cust.isPresent()) {
			crud.deleteById(id);
			return "ID no.- " + id + " found and deleted";
		} else {
			return "ID no.- " + id + " does not exist";
		}
	}

	@Override
	public String custServiceDelete(Customer c) {
		Optional<Customer> cust = crud.findById(c.getCid());
		if (cust.isPresent()) {
			crud.delete(c);
			return "ID no.- " + c.getCid() + " found and deleted";
		} else {
			return "ID no.- " + c.getCid() + " does not exist";
		}
	}

	@Override
	public String custServiceDeleteAll() {
		Long count = crud.count();
		if(count>0) {
			crud.deleteAll();
			return count+" no. of records deleted";
		}else {
			return "No records present in the table";
		}
	}

	@Override
	public String custServiceDeleteAllId(List<Integer> l) {
		List<Customer> list = (List<Customer>) crud.findAllById(l);
		crud.deleteAllById(l);
		if(list.size()==l.size()) {
			return list.size()+" no. of records found and deleted";
		}else {
			return list.size()+" no. of records deleted (Not all given records)";
		}
	}

	@Override
	public String custServiceDeleteAll(List<Customer> c) {
		List<Integer> l = new ArrayList<>();
		for(Customer cust: c) {
			l.add(cust.getCid());
		}
		List<Customer> list = (List<Customer>) crud.findAllById(l);
		crud.deleteAll(c);
		if(list.size()==l.size()) {
			return list.size()+" no. of records found and deleted";
		}else {
			return list.size()+" no. of records deleted (Not all given records)";
		}
	}

	// If we want to update a particular column then we just have to set that column in the entity
	// class object and we can leave other properties values as null and if the id value is found
	// in the database then that particular property value will be updated
	@Override
	public String custServicePartialUpdate(Integer id, Double discountPercentage) {
		Optional<Customer> cust = crud.findById(id);
		if(cust.isPresent()) {
			Customer c = cust.get();
			double discount=c.getCbillamt()*(discountPercentage/100.0);
			c.setCbillamt(c.getCbillamt()-discount);
			crud.save(c);
			return "Customer ID-"+id+" updated";
		}else
			return "Customer ID-"+id+" not found";
	}

	// Its behaviour is a bit different from what natraj sir has taught in the video. With wrong id value 
	// i.e the value that does not exist in the table records, it throws exceptions. With null as id value 
	// it can store the records with sequence generated id values.
	@Override
	public String custServiceRegisterOrUpdate(Customer c) {
		if(c.getCid()!=null) {
			Optional<Customer> cust = crud.findById(c.getCid());
		  if(cust.isPresent()) {
			crud.save(c);
			return "Customer ID-"+c.getCid()+" details are updated";
		  }else {
			return "Customer not found database with Id- "+c.getCid();
		  }
		}else {
			int idval = crud.save(c).getCid();
			return "Customer registered in database with ID- "+idval;
	    }
		
	}
}
