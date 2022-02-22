package com.cg.rest.web.service;

import java.util.List;

import com.cg.rest.web.model.Employee;



public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);

	public Employee getEmployeeById(int employeeId);

	public boolean deleteEmployeeById(int employeeId);

	public Employee updateEmployee(Employee employee);

	public List<Employee> getAllEmployees();

}
