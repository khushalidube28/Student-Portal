package com.cts.model;

public class Course {
	private int id;
	private String branch;
	private int year;
	private String result;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String branch, int year, String result) {
		super();
		this.id = id;
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
