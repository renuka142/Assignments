package com.day2;

public class CourseManagement {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudentId(19);
		stu.setStudentType('L');
		System.out.println("Student Id : " +stu.getStudentId()+" "+"Student Type : "+stu.getStudentType());
	}
}
