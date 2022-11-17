package com.exemple.Kaddem.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.Kaddem.Entity.Role;
import com.exemple.Kaddem.Entity.UserRole;
import com.exemple.Kaddem.Entity.Users;
import com.exemple.Kaddem.ServiceInterface.UserServiceInterface;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<Users, Integer>{

	
	@Autowired
	private UserServiceInterface userService;
	
	
	@PostMapping("/")
	public Users register(@RequestBody Users user) throws Exception {
		
		Set<UserRole>roles = new HashSet<>();
		
		Role role = new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		
		return this.userService.register(user, roles);
		
		
		
		
	}
	
	
	
	
}
