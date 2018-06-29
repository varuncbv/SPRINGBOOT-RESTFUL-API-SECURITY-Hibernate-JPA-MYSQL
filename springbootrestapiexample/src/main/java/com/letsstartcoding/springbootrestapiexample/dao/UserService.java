package com.letsstartcoding.springbootrestapiexample.dao;

import com.letsstartcoding.springbootrestapiexample.model.User;

public interface UserService {
	
	void save(User user);
	User findByUsername(String username);

}
