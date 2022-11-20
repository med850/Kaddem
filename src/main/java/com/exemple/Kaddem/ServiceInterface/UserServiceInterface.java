package com.exemple.Kaddem.ServiceInterface;

import com.exemple.Kaddem.Entity.Users;

import java.util.Set;

import com.exemple.Kaddem.Entity.UserRole;

public interface UserServiceInterface extends BaseServiceInterface<Users, Integer>{
	
	
	public Users register(Users user, Set<UserRole>userRole) throws Exception;


	//Get users by username
	public Users getUserByUsername(String username);




}
