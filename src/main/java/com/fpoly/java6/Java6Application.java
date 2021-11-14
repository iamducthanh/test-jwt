package com.fpoly.java6;

import com.fpoly.java6.domain.Role;
import com.fpoly.java6.domain.User;
import com.fpoly.java6.service.IUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Java6Application {
	public static void main(String[] args) {
		SpringApplication.run(Java6Application.class, args);
	}

//	@Bean
//	CommandLineRunner run(IUserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "Nguyen Duc Thanh", "thanh", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Le Hong Phong", "phong", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Nguyen Duyen Vinh", "vinh", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Truong Duc Huy", "huy", "1234", new ArrayList<>()));
//
//			userService.addRoleToUser("thanh", "ROLE_USER");
//			userService.addRoleToUser("thanh", "ROLE_MANAGER");
//			userService.addRoleToUser("thanh", "ROLE_ADMIN");
//			userService.addRoleToUser("phong", "ROLE_MANAGER");
//			userService.addRoleToUser("vinh", "ROLE_ADMIN");
//			userService.addRoleToUser("huy", "ROLE_SUPER_ADMIN");
//		};
//	}
}
