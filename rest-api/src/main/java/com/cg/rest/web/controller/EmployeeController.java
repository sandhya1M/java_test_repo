package com.cg.rest.web.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.web.model.Employee;
import com.cg.rest.web.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService serviceObj;
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		
		Employee emp = new Employee(1001, "Harsh", "Verma", "harsh@yahoo.com", 67000, LocalDate.of(2019, 2, 10));
		
		return emp;
		
		
	}

	@RequestMapping(method= {RequestMethod.POST}, value="/employee")
	
	public Employee saveEmployee(@RequestBody Employee employee) {
		return serviceObj.addEmployee(employee);
	}

	@RequestMapping("/employees")
	
	public List<Employee> getAllEmployees(){
		
		return serviceObj.getAllEmployees();
	}


}



//@ResponseBody
//@RequestMapping("/api/employee")
//public Employee registerEmployeeApi(@ModelAttribute Employee emp) {
//	
//	return emp;
//}
