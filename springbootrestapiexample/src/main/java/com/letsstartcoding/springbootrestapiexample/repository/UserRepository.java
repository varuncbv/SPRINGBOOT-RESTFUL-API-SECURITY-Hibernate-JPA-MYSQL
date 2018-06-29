package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springbootrestapiexample.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByUsername(String username);

}
