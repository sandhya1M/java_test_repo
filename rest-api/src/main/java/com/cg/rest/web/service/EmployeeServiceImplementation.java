package com.cg.rest.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.web.dao.EmployeeDao;
import com.cg.rest.web.dao.EmployeeDaoImplementation;
import com.cg.rest.web.model.Employee;


@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;


	@Override
	public Employee addEmployee(Employee employee) {

		return dao.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return dao.getEmployeeById(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {

		return dao.deleteEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}


}
