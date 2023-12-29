package com.cts.model;

public class Fees {
	private int id;
	private float quater1;
	private float quater2;
	private float quater3;
	private float quater4;
	private String status;
	public Fees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fees(int id, float quater1, float quater2, float quater3, float quater4, String status) {
		super();
		this.id = id;
		this.quater1 = quater1;
		this.quater2 = quater2;
		this.quater3 = quater3;
		this.quater4 = quater4;
		this.status = status;
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
	
	

}
