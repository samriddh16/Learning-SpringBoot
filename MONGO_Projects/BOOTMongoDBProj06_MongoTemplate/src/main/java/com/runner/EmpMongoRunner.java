package com.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.document.Employee;
import com.service.IEmpMongoService;

@Component("mongorunner")
public class EmpMongoRunner implements CommandLineRunner {
	
	@Autowired
	IEmpMongoService empService;

	@Override
	public void run(String... args) throws Exception {
		
		Employee e1 = new Employee(1046,"Ada","NewYork",167843.0);
		Employee e2 = new Employee(1047,"Ishan","Pune",87843.0);
		Employee e3 = new Employee(1048,"Hritik","Jammu",147843.0);
		try {
			/*System.out.println(empService.registerEmployeeTemp(e));*/
			/*empService.registerBatchEmployeeTemp(List.of(e1,e2,e3)).forEach(System.out::println);*/
			/*empService.findEmpBySalaryRange(50000.0, 99000.0).forEach(System.out::println);*/
			/*empService.findEmpByAddr("Raipur","Pune","Patna").forEach(System.out::println);*/
			/*empService.findEmpByAddrSalRange(40000.0,130000.0,"Raipur").forEach(System.out::println);*/
			/*System.out.println(empService.findEmpById("68751c9f40affa62f8c1d8a4"));*/
			/*empService.findAllEmp().forEach(System.out::println);*/
			/*System.out.println(empService.findAndUpdateEmpByEmpno(1001, "Tripura", 85000.0));*/
			/*System.out.println(empService.findAndUpdateMulitiEmpByEsal(86000.0, 90000.0, "Tamil Nadu"));*/
			/*System.out.println(empService.findAndUpdateEmpByEno(1090, "Hyderabad",60000.0));*/
			/*System.out.println(empService.findAndRemoveByEaddr("Tamil Nadu"));*/
			System.out.println(empService.findAndRemoveAllByEsal(50000.0, 60000.0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

}
