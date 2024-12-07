package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	
	   @Id
	   @Column(name="sid")
	   private int id;
	   @Column(name="sname",nullable=false,length = 50)
	   private String name;
	   @Column(name="sgender",nullable=false,length = 20)
	   private String gender;
	   @Column(name="sdepartment",nullable=false,length = 50)
	   private String department;
	   @Column(name="syear",nullable=false)
	   private int year;
	   @Column(name="ssemester",nullable=false)
	   private double semester;
	   @Column(name="semail",nullable=false,unique = true,length = 50)
	   private String email;
	   @Column(name="scontact",nullable=false,unique = true,length = 20)
	   private String contact;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", year="
				+ year + ", semester=" + semester + ", email=" + email + ", contact=" + contact + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSemester() {
		return semester;
	}
	public void setSemester(double semester) {
		this.semester = semester;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}

