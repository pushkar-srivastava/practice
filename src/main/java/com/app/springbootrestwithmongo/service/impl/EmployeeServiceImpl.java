package com.app.springbootrestwithmongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootrestwithmongo.dao.EmployeeDao;
import com.app.springbootrestwithmongo.entity.Employee;
import com.app.springbootrestwithmongo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(String employeeId) {
		// TODO Auto-generated method stub
		employeeDao.delete(employeeId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findOne(employeeId);
	}

}
