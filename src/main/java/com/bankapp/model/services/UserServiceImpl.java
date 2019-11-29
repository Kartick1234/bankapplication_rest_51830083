package com.bankapp.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.User;
import com.bankapp.model.repo.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
private UserRepository userRepository;
	@Override
	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}

}
