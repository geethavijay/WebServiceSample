package com.sample.service;


public class EmpRecordUpdateRes {

	public enum RecordUpdateStatus{
		SUCCESS,RETRY,FAILURE;
	}
	
	private long id;
	private  RecordUpdateStatus updateStatus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RecordUpdateStatus getUpdateStatus() {
		return updateStatus;
	}
	public void setUpdateStatus(RecordUpdateStatus updateStatus) {
		this.updateStatus = updateStatus;
	}
	
}
