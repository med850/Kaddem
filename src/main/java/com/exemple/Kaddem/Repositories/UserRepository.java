package com.exemple.Kaddem.Repositories;


import com.exemple.Kaddem.Entity.Users;

public interface UserRepository extends  BaseRepository<Users, Integer>  {

	public Users findByUsername(String username);
	
	
	
}
