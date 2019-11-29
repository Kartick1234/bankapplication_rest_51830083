package com.bankapp.model.services;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountTransactionRepository accountTransactionRepository;
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void createAccount(Account account) {
		accountRepository.save(account);
		customerRepository.save(account.getCustomer());

	}

	@Override
	public void deposit(Long accountNumber, double amount) {
		Account account=accountRepository.findById(accountNumber).orElseThrow(com.bankapp.model.service.exceptions.AccountNotFoundException::new);
		account.setBalance(account.getBalance()+amount);
		AccountTransaction accountTransaction=new AccountTransaction("deposit", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
	}

	@Override
	public void withdraw(Long accountNumber, double amount) {
		Account account=accountRepository.findById(accountNumber).orElseThrow(com.bankapp.model.service.exceptions.AccountNotFoundException::new);
		account.setBalance(account.getBalance()-amount);
		AccountTransaction accountTransaction=new AccountTransaction("withdraw", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
		
	}

	@Override
	public void transfer(Long fromAccountNumber, Long toAccountNumber, double amount) {
		this.withdraw(fromAccountNumber, amount);
		this.deposit(toAccountNumber, amount);
		
	}

	@Override
	public Optional<Account> findAllById(Long accountNumber) {
		return accountRepository.findById(accountNumber);
		
	}

}
