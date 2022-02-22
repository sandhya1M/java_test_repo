package com.cg.rest.web.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private float salary;
	private LocalDate joinedDate;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String firstName, String lastName, String email, float salary,
			LocalDate joinedDate) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.joinedDate = joinedDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", joinedDate=" + joinedDate + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public LocalDate getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(LocalDate joinedDate) {
		this.joinedDate = joinedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, employeeId, firstName, joinedDate, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && employeeId == other.employeeId
				&& Objects.equals(firstName, other.firstName) && Objects.equals(joinedDate, other.joinedDate)
				&& Objects.equals(lastName, other.lastName)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	

}
