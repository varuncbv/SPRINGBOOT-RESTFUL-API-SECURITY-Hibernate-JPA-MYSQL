package com.letsstartcoding.springbootrestapiexample.dao;

public interface SecurityService {
	
	String findLoggedInUsername();
	
	void autoLogin(String username,String passsword);

}
