package com.sample.service.api;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.sample.service.EmpRecordUpdateReq;
import com.sample.service.EmpRecordUpdateRes;

import javax.jws.WebMethod;
import javax.jws.WebResult;

@WebService
@SOAPBinding(style=Style.DOCUMENT) // No need of this, as default is Document
public interface IEmployeeUpdator {	

	@WebMethod
	@WebResult(partName="updateEmployeeRecordResponse")
	EmpRecordUpdateRes updateEmployeeRecord(EmpRecordUpdateReq req);		
	
}
