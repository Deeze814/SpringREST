package com.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.rest.service.UserService;
import com.sample.repo.UserRepository;

@Configuration
@ComponentScan(basePackages = {"com.rest.controller"})
@EnableWebMvc
public class AppConfig {
	
	@Bean
	public UserService getUserService(){
		return new UserService();
	}
	
	@Bean
	public UserRepository getUserRepository(){
		return new UserRepository();
	}
	
}
