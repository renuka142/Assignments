package com.day8;

public class a6DayScholar extends assignment6{
	private String resAdd;

	public void setResAdd(String resAdd) {
		this.resAdd = resAdd;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("student name"+sName);
		System.out.println("resedential address"+resAdd);
	}
	

}
