package com.test.User;

public class User {

	 public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Integer getSubmitted() {
		return submitted;
	}
	public void setSubmitted(Integer submitted) {
		this.submitted = submitted;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String udpated_at) {
		this.updated_at = udpated_at;
	}
	public Integer getSubmission_count() {
		return submission_count;
	}
	public void setSubmission_count(Integer submission_count) {
		this.submission_count = submission_count;
	}
	public String getComment_count() {
		return comment_count;
	}
	public void setComment_count(String comment_count) {
		this.comment_count = comment_count;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	Integer id;
	 String username;
	 String about;
	 Integer submitted;
	 String updated_at;
	 Integer submission_count;
	 String comment_count;
	 String created_at;
}
