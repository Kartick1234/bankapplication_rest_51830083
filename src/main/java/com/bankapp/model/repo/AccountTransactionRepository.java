package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.model.entities.AccountTransaction;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long>{

}
