package com.example.model;

import lombok.ToString;

@ToString
public class Student {

	private long id;
	private String firstName;
	private String lastName;
	private String courseOfStudies;
	
	public Student(long id, String firstName, String lastName, String courseOfStudies) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseOfStudies = courseOfStudies;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseOfStudies() {
		return courseOfStudies;
	}

	public void setCourseOfStudies(String courseOfStudies) {
		this.courseOfStudies = courseOfStudies;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", courseOfStudies="
				+ courseOfStudies + "]";
	}
	
	
	
	

}
