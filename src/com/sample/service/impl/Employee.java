package com.sample.service.impl;

public class Employee {
	String name;
	long id;
	long salary;
	long phoneNum;
	
	
	public Employee(String name, long id, long salary, long phoneNum) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

}
