package com.sample.service.publisher;

import javax.xml.ws.Endpoint;

import com.sample.service.impl.EmployeeRecUpdatorImpl;

public class EmployeeUpdatePublisher {
	
	public static void main(String[] args) {
		System.out.println("Publishing Employee Record Updator at 9999....");
		Endpoint.publish("http://127.0.0.1:9999/updateEmpRecord", new EmployeeRecUpdatorImpl());
	}
}
