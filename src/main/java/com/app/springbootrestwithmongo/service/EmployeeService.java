package com.app.springbootrestwithmongo.service;

import java.util.List;

import com.app.springbootrestwithmongo.entity.Employee;

public interface EmployeeService {
	Employee save(Employee employee);

	Employee update(Employee employee);

	void deleteEmployee(String id);

	List<Employee> getAllEmployee();

	Employee getEmployee(String id);
}
