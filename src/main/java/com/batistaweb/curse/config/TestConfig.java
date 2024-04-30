package com.batistaweb.curse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.batistaweb.curse.entities.User;
import com.batistaweb.curse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777"); 
		User u3 = new User(null,"Joao Da silva" , "Jbatysta@gmail.com", "87654444");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));

		
	}

}
