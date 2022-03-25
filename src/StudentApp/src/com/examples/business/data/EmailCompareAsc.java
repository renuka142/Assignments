package com.examples.business.data;

public class EmailCompareAsc implements java.util.Comparator<Student> {
	public int compare(Student s1, Student s2)
	{
		return s1.getEmail().compareTo(s2.getEmail());
	}
}
