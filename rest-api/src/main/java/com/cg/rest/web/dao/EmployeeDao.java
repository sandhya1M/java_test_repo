package com.cg.rest.web.dao;

import java.util.List;

import com.cg.rest.web.model.Employee;



public interface EmployeeDao {
	
	public Employee addEmployee(Employee employee);

	public Employee getEmployeeById(int employeeId);

	public boolean deleteEmployeeById(int employeeId);


	public Employee updateEmployee(Employee employee);

	public List<Employee> getAllEmployees();
	

}
