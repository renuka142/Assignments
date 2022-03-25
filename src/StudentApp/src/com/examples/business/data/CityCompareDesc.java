package com.examples.business.data;

public class CityCompareDesc implements java.util.Comparator<Student> {
	public int compare(Student s1, Student s2)
	{
		return s2.getCity().compareTo(s1.getCity());
	}
}
