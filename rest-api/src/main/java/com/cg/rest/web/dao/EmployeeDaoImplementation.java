package com.cg.rest.web.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cg.rest.web.model.Employee;


@Repository
public class EmployeeDaoImplementation implements EmployeeDao {
	

	Map<Integer, Employee> employees;
	
	@PostConstruct
	public void init() {
		employees=new HashMap();
		
		Employee e1,e2,e3,e4,e5;
		e1=new Employee(1001, "Mohit", "Sharma", "sharmamohit@yahoo.com", 42000, LocalDate.of(2000, 2, 21));
		e2= new Employee(1002, "Anil", "Reddy", "anil@yahoo.com", 52000,LocalDate.of(2015, 5, 21));
		e3= new Employee(1005, "Rajesh", "Dutta", "drajesh@yahoo.com", 58000,LocalDate.of(2010, 2, 15));
		e4= new Employee(1003, "Rishitha", "Sharma", "sharmarishitha@yahoo.com", 48000,LocalDate.of(2016, 2, 6));
		e5= new Employee(1004, "Tushar", "Mishra", "mtushar@yahoo.com", 35000, LocalDate.of(2005, 4, 16));

		employees.put(e1.getEmployeeId(), e1);
		employees.put(e2.getEmployeeId(), e2);
		employees.put(e3.getEmployeeId(), e3);
		employees.put(e4.getEmployeeId(), e4);
		employees.put(e5.getEmployeeId(), e5);
	}
	
	
	
	@Override
	public Employee addEmployee(Employee employee) {

		employees.put(employee.getEmployeeId(), employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {

		return employees.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {

		employees.remove(employeeId);

		return !employees.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		 return employees.put(employee.getEmployeeId(), employee);

	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> emps=new ArrayList<>(employees.values());
		return emps;

	}
	
	

}
