package com.sample.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.service.api.IEmployeeDB;

public class EmployeeDBImpl implements IEmployeeDB {
	
	List<Employee> empList;
	
	EmployeeDBImpl(){
		empList = new ArrayList<Employee>();
		Employee emp1 = new Employee("Geetha",83l,5000l,9945528696l);
		Employee emp2 = new Employee("Surya",84l,5000l,9945528699l);
		empList.add(emp1);
		empList.add(emp2);
	}
	
	public List<Employee> getEmployees(){
		return empList;		
	}
	
	private List<Employee> getEmployee(long empId){
		return  empList.stream().filter(x->(x.getId() == empId)).collect(Collectors.toList());
	}
	
	public boolean updateEmployee(long empId,long salary){		
		List<Employee> emp= getEmployee(empId);
		if( emp!=null && emp.size() >=1){
			emp.get(0).setSalary(salary);
			System.out.println("Record with the emp id  "+empId +"is updated successfully with the salary "+salary);
			return true;
		}				
		return false;
	}
}
