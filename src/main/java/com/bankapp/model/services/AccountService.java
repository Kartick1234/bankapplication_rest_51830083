package com.bankapp.model.services;

import java.util.Optional;

import com.bankapp.model.entities.Account;

public interface AccountService {
void createAccount(Account account);
void deposit(Long accountNumber, double amount);
void withdraw(Long accountNumber, double amount);
void transfer(Long fromAccountNumber, Long toAccountNumber,double amount);
public Optional<Account> findAllById(Long accountNumber);
}
