package com.day8;

public class assignment6 {
	protected int sId;
	protected String sName;
	protected char sType;
	public void setsId(int sId) {
		this.sId = sId;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setsType(char sType) {
		this.sType = sType;
	}
	public void getDetails() {
		System.out.println("student ID:" + sId);
		System.out.println("Student Type "+sType);
	}
	
}
