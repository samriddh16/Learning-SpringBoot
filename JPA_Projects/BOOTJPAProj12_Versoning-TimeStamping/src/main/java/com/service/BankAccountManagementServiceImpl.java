package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.BankAccount;
import com.repository.IBankAccountRepository;

@Service("BankService")
public class BankAccountManagementServiceImpl implements IBankAccountManagementService {
	@Autowired
	private IBankAccountRepository bankRepo;

	@Override
	public String createBankAccount(BankAccount account) {
		  long acno=bankRepo.save(account).getAcno();
		return "Bank Account is opened having the account number ::"+acno;
	}

	@Override
	public String updateAccountMobileNumber(Long acno, Long newMobileNo) {
		  //Load the object
		   Optional<BankAccount> opt=bankRepo.findById(acno);
		   if(opt.isPresent()) {
			   BankAccount account=opt.get();
			   //update the object
			   account.setMobileNo(newMobileNo);
			    bankRepo.save(account);
			    return  acno+" Bank Account is found and updated";
		   }
		   else {
			   return   acno+" Bank Account not found";
		   }
	}

	@Override
	public BankAccount getAccountDetailsByAcno(long acno) {
		return  bankRepo.getReferenceById(acno); 
	}

}
