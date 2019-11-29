package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.model.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmail(String email);
}
