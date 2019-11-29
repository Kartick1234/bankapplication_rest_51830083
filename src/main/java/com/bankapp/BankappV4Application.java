package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.User;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.services.AccountService;

@SpringBootApplication
public class BankappV4Application implements CommandLineRunner{
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BankappV4Application.class, args);
	}
	@Autowired
	private AccountService accountService;
	@Override
	public void run(String... args) throws Exception {
		/*accountService.deposit(1L, 5000);
		
		User user1=new User("raj", "raj123", "r@r.com", "1234", "delhi", new 
					String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true);
		User user2=new User("ekta", "ekta123", "e@r.com", "12345", "delhi", new 
				String[]{"ROLE_MGR","ROLE_CLERK"}, true);
		User user3=new User("gunika", "gunika123", "g@r.com", "123456", "delhi", new 
				String[]{"ROLE_CLERK"}, true);
		
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
		Customer customer1=new Customer("prethy", "guru@gmail.com", "8870", "tce", "madurai", "india");
		Customer customer2=new Customer("gupta", "gaja@gmail.com", "9870", "tce", "dindigul", "india");
	
	Account account1=new Account(2000.00, customer1, false);
	Account account2=new Account(1500.00, customer2, false);
	
	customer1.setAccount(account1);
	customer2.setAccount(account2);
	
	accountRepository.save(account1);
	accountRepository.save(account2);*/
	}

}
