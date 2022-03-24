package com.day5Assignment;

public class Student {
	private int id;
	private char sType;
	private String fname;
	private String lname;
	private String sname;
	
	public Student(int id, char sType, String fname, String lname) {
		super();
		this.id = id;
		this.sType = sType;
		this.sname = fname.concat(lname);
	}

	public Student() {
		super();
		this.id=10;
		this.sType='F';
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sType=" + sType + ", fname=" + fname + ", lname=" + lname + ", sname=" + sname
				+ "]";
	}

	public String setStudentName(String fname,String lname) {
		String fullname = fname.concat(lname);
		return fullname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getsType() {
		return sType;
	}

	public void setsType(char sType) {
		this.sType = sType;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
