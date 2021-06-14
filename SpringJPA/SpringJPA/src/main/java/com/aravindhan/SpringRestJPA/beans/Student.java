package com.aravindhan.SpringRestJPA.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int student_rollNumber;
	private String student_name;
	private String student_department;
	private String student_dateOfBirth;
	
	public Student() {
		super();
	}

	public int getStudent_rollNumber() {
		return student_rollNumber;
	}

	public void setStudent_rollNumber(int student_rollNumber) {
		this.student_rollNumber = student_rollNumber;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_department() {
		return student_department;
	}

	public void setStudent_department(String student_department) {
		this.student_department = student_department;
	}

	public String getStudent_dateOfBirth() {
		return student_dateOfBirth;
	}

	public void setStudent_dateOfBirth(String student_dateOfBirth) {
		this.student_dateOfBirth = student_dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [student_rollNumber=" + student_rollNumber + ", student_name=" + student_name
				+ ", student_department=" + student_department + ", student_dateOfBirth=" + student_dateOfBirth + "]";
	}
}
