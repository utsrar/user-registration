package com.cassandra.users.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cassandra.users.config")
@EnableAutoConfiguration
public class UserRegistrationConfiguration {

	public static void main(String[] args) {
		SpringApplication userRegistration = new SpringApplication(UserRegistrationConfiguration.class);
		userRegistration.run(args);
		userRegistration.setShowBanner(false);
		userRegistration.setWebEnvironment(true);
	}

}
