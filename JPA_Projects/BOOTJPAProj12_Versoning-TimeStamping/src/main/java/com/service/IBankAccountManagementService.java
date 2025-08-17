package com.service;

import com.entity.BankAccount;

public interface IBankAccountManagementService {
   public   String   createBankAccount(BankAccount account);
   public   String    updateAccountMobileNumber(Long acno , Long newMobileNo);
   public   BankAccount   getAccountDetailsByAcno(long acno);
}
