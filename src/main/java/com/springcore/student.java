package com.springcore;

public class student {
	private int sid;
	private String sN;
	private String sA;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("student ID");
		this.sid = sid;
	}
	public String getsN() {
		return sN;
	}
	public void setsN(String sN) {
		this.sN = sN;
	}
	public String getsA() {
		return sA;
	}
	public void setsA(String sA) {
		this.sA = sA;
	}
	public student(int sid, String sN, String sA) {
		super();
		this.sid = sid;
		this.sN = sN;
		this.sA = sA;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sN=" + sN + ", sA=" + sA + "]";
	}
	
	
	
	
}
