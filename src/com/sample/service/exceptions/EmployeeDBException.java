package com.sample.service.exceptions;

// Exception handlers to be enhanced
public class EmployeeDBException extends Throwable{
	 
        Throwable th;	 
    	EmployeeDBException(Throwable t){
    		this.th = t;
    	}
    	
    	public void printException(){
    		if(this.th != null){
    			System.out.println("There was an exception while processing Employee DB   :: "+ th.getMessage());
    		}
    	}
}
