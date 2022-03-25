package com.examples.business.data;

public class CityCompareAsc implements java.util.Comparator<Student> {
	public int compare(Student s1, Student s2)
	{
		return s1.getCity().compareTo(s2.getCity());
	}

}
