package com.test.User;

import java.util.List;

public class OutPut {
	
	Integer thresholdperc ;
	
	public Integer getThresholdperc() {
		return thresholdperc;
	}

	public void setThresholdperc(Integer thresholdperc) {
		this.thresholdperc = thresholdperc;
	}

	public List<OutputUser> getUsers() {
		return users;
	}

	public void setUsers(List<OutputUser> users) {
		this.users = users;
	}

	List<OutputUser> users;
	

}
