package com.day2;

public class Constructors {
	private int studentId;
	private char studentType;
	public Constructors(int studentId, char studentType) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
	}
	@Override
	public String toString() {
		return "Constructors [studentId=" + studentId + ", studentType=" + studentType + "]";
	}
	
}
