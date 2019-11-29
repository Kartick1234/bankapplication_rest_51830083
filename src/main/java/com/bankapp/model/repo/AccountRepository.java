package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.model.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
