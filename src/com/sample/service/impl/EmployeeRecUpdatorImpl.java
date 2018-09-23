package com.sample.service.impl;

import javax.jws.WebService;

import com.sample.service.EmpRecordUpdateReq;
import com.sample.service.EmpRecordUpdateRes;
import com.sample.service.EmpRecordUpdateRes.RecordUpdateStatus;
import com.sample.service.api.IEmployeeDB;
import com.sample.service.api.IEmployeeUpdator;

@WebService(endpointInterface="com.sample.service.api.IEmployeeUpdator")
public class EmployeeRecUpdatorImpl implements IEmployeeUpdator{

	@Override
	public EmpRecordUpdateRes updateEmployeeRecord(EmpRecordUpdateReq req) {
		
		EmpRecordUpdateRes res = new EmpRecordUpdateRes();
		EmpRecordUpdateRes.RecordUpdateStatus successStatus = EmpRecordUpdateRes.RecordUpdateStatus.SUCCESS;
		EmpRecordUpdateRes.RecordUpdateStatus retryStatus = EmpRecordUpdateRes.RecordUpdateStatus.RETRY;
		EmpRecordUpdateRes.RecordUpdateStatus failureStatus = EmpRecordUpdateRes.RecordUpdateStatus.FAILURE;
		
		long empId = req.getId();
		long salary = req.getSalary();
		EmpRecordUpdateRes.RecordUpdateStatus status = null;
		if(req !=null &&  empId != 0 && salary != 0){
			IEmployeeDB empDB  = new EmployeeDBImpl();
			status = empDB.updateEmployee(empId, salary) ? successStatus:failureStatus;
		} else {
			status = retryStatus;
		}	
		res.setId(empId);
		res.setUpdateStatus(status);			
		return res ;
	}
	
}
