package com.cts.model;

import java.sql.Date;

public class StudentDetails {
	private int id;
	private float quater1;
	private float quater2;
	private float quater3;
	private float quater4;
	private String status;
	private String name;
	private String gender;
	private Date dob;
	private String contact;
	private String email;
	private String branch;
	private int year;
	private String result;
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(int id, float quater1, float quater2, float quater3, float quater4, String status,
			String name, String gender, Date dob, String contact, String email, String branch, int year,
			String result) {
		super();
		this.id = id;
		this.quater1 = quater1;
		this.quater2 = quater2;
		this.quater3 = quater3;
		this.quater4 = quater4;
		this.status = status;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contact = contact;
		this.email = email;
		this.branch = branch;
		this.year = year;
		this.result = result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getQuater1() {
		return quater1;
	}
	public void setQuater1(float quater1) {
		this.quater1 = quater1;
	}
	public float getQuater2() {
		return quater2;
	}
	public void setQuater2(float quater2) {
		this.quater2 = quater2;
	}
	public float getQuater3() {
		return quater3;
	}
	public void setQuater3(float quater3) {
		this.quater3 = quater3;
	}
	public float getQuater4() {
		return quater4;
	}
	public void setQuater4(float quater4) {
		this.quater4 = quater4;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
