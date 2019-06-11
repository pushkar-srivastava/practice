package com.app.springbootrestwithmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.app.springbootrestwithmongo.dao")
public class SpringBootMongoApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(SpringBootMongoApplication.class);
	}
}
