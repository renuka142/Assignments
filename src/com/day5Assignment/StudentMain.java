package com.day5Assignment;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setsType('F');
		s.setFname("renuka");
		s.setLname("bhure");
		System.out.println(s.getId()+" "+s.getsType()+" "+s.getFname());
		
		Student s1 = new Student(1, 'F', "Renuka", "Bhure");
	}
}
