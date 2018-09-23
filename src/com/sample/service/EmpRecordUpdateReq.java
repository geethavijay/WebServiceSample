package com.sample.service;

public class EmpRecordUpdateReq {

	private long id;
	private long salary;
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
		
	public long getSalary(){
		return this.salary;
	}
	
	public void setSalary(long salary){
		this.salary = salary;
	}
	
}
