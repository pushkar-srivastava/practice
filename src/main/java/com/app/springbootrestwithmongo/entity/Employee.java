package com.app.springbootrestwithmongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {
	@Id
	private String id;
	
	@Field(value = "employeeName")
	private String employeeName;
	
	@Field(value = "designation")
	private String designation;
}
