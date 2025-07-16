package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.repository.ICustRepoFinder;

@Component("runner")
public class CustRunnerFinder implements CommandLineRunner {

	@Autowired
	ICustRepoFinder repo;
	
    // Here we have to use view1.getCname() and not like System.out::println because we are returning
	// out custom interface implementation class object which does not have toString method.
	@Override
	public void run(String... args) throws Exception {
		try {
			    repo.findByCaddrsStartingWithOrCbillamtBetween("D", 50000.0, 65000.0).forEach(view1->{
				System.out.println(view1.getCname()+"    "+view1.getCaddrs());});
				System.out.println("-------------------------------------------------");
				repo.findByCnameEqualsOrCbillamtGreaterThan("Ayush",40000.0).forEach(view2->{
				System.out.println(view2.getCname()+"    "+view2.getCaddrs());});
				System.out.println("-------------------------------------------------");
			    repo.findByCnameStartingWithOrCbillamtBetween("R", 50000.0, 65000.0).forEach(view3->{
				System.out.println(view3.getCname()+"    "+view3.getCaddrs());});
                System.out.println("-------------------------------------------------");
	  
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
