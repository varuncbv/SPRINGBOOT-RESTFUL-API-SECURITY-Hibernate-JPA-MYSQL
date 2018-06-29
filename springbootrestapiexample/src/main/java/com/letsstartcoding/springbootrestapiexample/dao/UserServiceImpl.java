package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.letsstartcoding.springbootrestapiexample.model.Role;
import com.letsstartcoding.springbootrestapiexample.model.User;
import com.letsstartcoding.springbootrestapiexample.repository.RoleRepository;
import com.letsstartcoding.springbootrestapiexample.repository.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<Role>(roleRepository.findAll()));
		userRepository.save(user);
		
	}

	
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

}
