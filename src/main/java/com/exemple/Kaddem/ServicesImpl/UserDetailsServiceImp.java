package com.exemple.Kaddem.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exemple.Kaddem.Entity.Users;
import com.exemple.Kaddem.Repositories.UserRepository;


@Service
public class UserDetailsServiceImp implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		

		Users user = this.userRepo.findByUsername(username);		
		
		if(user == null) {
			System.out.println("User not found !");
			throw new UsernameNotFoundException("User not found");
		}
		
		
		
		return user;
	}

}
