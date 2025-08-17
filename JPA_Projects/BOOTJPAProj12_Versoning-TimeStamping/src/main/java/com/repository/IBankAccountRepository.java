package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.BankAccount;

public interface IBankAccountRepository extends JpaRepository<BankAccount, Long> {

}
