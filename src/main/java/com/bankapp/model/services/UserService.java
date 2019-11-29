package com.bankapp.model.services;

import com.bankapp.model.entities.User;

public interface UserService {
	public User findByEmail(String email);
}
