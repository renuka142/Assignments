package com.examples.business.data;

public class EmailCompareDesc implements java.util.Comparator<Student>{
	public int compare(Student s1, Student s2)
	{
		return s2.getEmail().compareTo(s1.getEmail());
	}


}
