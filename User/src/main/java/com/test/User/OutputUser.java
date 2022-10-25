package com.test.User;

public class OutputUser {
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getSubmitted() {
		return submitted;
	}

	public void setSubmitted(Integer submitted) {
		this.submitted = submitted;
	}

	public Integer getSubmission_count() {
		return submission_count;
	}

	public void setSubmission_count(Integer submission_count) {
		this.submission_count = submission_count;
	}

	public Double getApproval_rate_perc() {
		return approval_rate_perc;
	}

	public void setApproval_rate_perc(Double approval_rate_perc) {
		this.approval_rate_perc = approval_rate_perc;
	}

	String username;//": "epaga",

	Integer submitted;

	Integer submission_count;

	Double approval_rate_perc;
}
