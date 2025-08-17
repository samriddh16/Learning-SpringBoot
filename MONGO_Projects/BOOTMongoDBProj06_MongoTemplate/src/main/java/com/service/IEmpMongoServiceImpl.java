package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.document.Employee;
import com.mongodb.client.result.UpdateResult;

@Service("mongoservice")
public class IEmpMongoServiceImpl implements IEmpMongoService {

	@Autowired
	MongoTemplate temp;

	// In save method we can also give a collection name if we want otherwise it will be stored in
	// collection name defined in the document class
	@Override
	public String registerEmployeeTemp(Employee e) {
        int idval = temp.save(e).getEmpNo();
		return "Employee with EmpNo- "+idval+" saved in db";
	}

	@Override
	public List<Employee> registerBatchEmployeeTemp(List<Employee> list) {
		return (List<Employee>) temp.insertAll(list);
	}
	
	public List<Employee> findEmpBySalaryRange(Double st, Double end) {
		Query q = new Query();
		q.addCriteria(Criteria.where("empSalary").gte(st).lte(end));
		return temp.find(q, Employee.class);
	}

	@Override
	public List<Employee> findEmpByAddr(Object... strings) {
        Query q = new Query();
        q.addCriteria(Criteria.where("empAddr").in(strings));
		return temp.find(q, Employee.class);
	}

	@Override
	public List<Employee> findEmpByAddrSalRange(Double d1, Double d2, Object st) {
		Query q = new Query();
        q.addCriteria(Criteria.where("empSalary").lte(d2).gte(d1).and("empAddr").is(st));
		return temp.find(q, Employee.class);
	}

	@Override
	public Employee findEmpById(String id) {
		temp.findById(id, Employee.class);
		return temp.findById(id, Employee.class);
	}

	@Override
	public List<Employee> findAllEmp() {
		return temp.findAll(Employee.class);
	}

	// This methods updates the first record found (if duplicates exist)
	// Also it returns the old document object before the updation
	@Override
	public Employee findAndUpdateEmpByEmpno(int eno, String eaddr, Double esal) {
		Query q = new Query();
		q.addCriteria(Criteria.where("empNo").is(eno));
		Update u = new Update();
		u.set("empAddr", eaddr);
		u.set("empSalary", esal);
		return temp.findAndModify(q, u, Employee.class);
	}
	
	// It updated multiple records
	// Modified Count <= Matched Count because if same data is already present in the collection document
	// that we want to change the mongodb will not perform the update operation
	@Override
	public String findAndUpdateMulitiEmpByEsal(Double st, Double end, String eaddr) {
		Query q = new Query();
		q.addCriteria(Criteria.where("empSalary").gte(st).lte(end));
		Update u = new Update();
		u.set("empAddr", eaddr);
		UpdateResult ur = temp.updateMulti(q, u, Employee.class);
		long modifiedcount = ur.getModifiedCount();
		long matchedcount = ur.getMatchedCount();
		return "Modified Count -> "+modifiedcount+", Matched Count -> "+matchedcount;
	}

	// Upsert method updates only first record (if found multiple)
	// Iff no record is found with the given details then a new record is inserted to db
	@Override
	public String findAndUpdateEmpByEno(int eno, String eaddr, Double esal) {
		Query q = new Query();
		q.addCriteria(Criteria.where("empNo").is(eno));
		Update u = new Update();
		u.set("empAddr", eaddr);
		u.set("empSalary", esal);
		u.setOnInsert("empName", "Bobby");
		UpdateResult ur = temp.upsert(q, u, Employee.class);
		if(ur.getModifiedCount()==0)
		  return "Doc is inserted";
	  else
		  return "Doc is Updated with modified count -> "+ur.getModifiedCount();
	}

	// It will delete only the first record (if multiple are found with the given condition)
	@Override
	public Employee findAndRemoveByEaddr(String eaddr) {
		Query q = new Query();
		q.addCriteria(Criteria.where("empAddr").is(eaddr));
		return temp.findAndRemove(q, Employee.class);
	}

	// It will delete all the records with the given condition 
	@Override
	public String findAndRemoveAllByEsal(Double d1, Double d2) {
		Query q = new Query();
		q.addCriteria(Criteria.where("empSalary").gte(d1).lte(d2));
		int length = temp.findAllAndRemove(q, Employee.class).size();
		return length+" no. of records deleted";
	}
	
}
