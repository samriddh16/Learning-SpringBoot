package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.BankAccount;
import com.service.IBankAccountManagementService;

@Component
public class VersoningAndTimeStampTestRunner implements CommandLineRunner {
	@Autowired
	private IBankAccountManagementService  bankService;

	@Override
	public void run(String... args) throws Exception {
		
		/*//save the object
		try {
			BankAccount account=new BankAccount("raja1",80000.0,986644699L);   // We put here L for Long data type
			String msg=bankService.createBankAccount(account);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		// Load and update the object
		// If the record is already up to date then if will not run the update query for it. If not 
		// only then the update query is executed for it.
		try {
			/* String msg=bankService.updateAccountMobileNumber(10000000L, 9818989989L);
			 System.out.println(msg);*/
			 BankAccount account=bankService.getAccountDetailsByAcno(10000000L);
			 System.out.println("account created on "+account.getCreationTime()+
				                             " lastly updated on::"+account.getLastUpdationTime()+" updated for:: "+account.getUpdateCount()+" times");
		}
		catch(Exception e) {
		   e.printStackTrace();
		}

	}//main

}//class
