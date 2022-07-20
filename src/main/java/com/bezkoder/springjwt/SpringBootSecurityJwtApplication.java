package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.*;

import com.bezkoder.springjwt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.List;

@SpringBootApplication
@Slf4j
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			List<Role> lst = userService.getRoles();
			if(lst.size() == 0){
				userService.saveRole(new Role(ERole.ROLE_ADMIN));
				userService.saveRole(new Role(ERole.ROLE_USER));
				userService.saveRole(new Role(ERole.ROLE_MODERATOR));
			}

		};
	}



}
