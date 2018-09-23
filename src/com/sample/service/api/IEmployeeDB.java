package com.sample.service.api;

import java.util.List;

import com.sample.service.impl.Employee;

public interface IEmployeeDB {
	
	List<Employee> getEmployees();
	boolean updateEmployee(long empId,long salary);
}
