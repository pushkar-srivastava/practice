package com.app.springbootrestwithmongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.springbootrestwithmongo.entity.Employee;

@Repository
public interface EmployeeDao extends MongoRepository<Employee, String> {

}
