package com.examples.business.rules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.examples.business.data.StudentDAO;

public class StudentInsertMain {
	public static void main(String[] args) throws NumberFormatException, SQLException, ClassNotFoundException {
		StudentDAO ob = new StudentDAO();
		String data = "Insert into student_master(student_roll_no,student_name,student_gender,maths_marks,physics_marks,chemistry_marks,computer_science_marks,email,city)values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst1 = ob.conn.prepareStatement(data);
		pst1.setInt(1, Integer.parseInt(args[0]));//selecting values at run time
		pst1.setString(2, args[1]);
		pst1.setString(3, args[2]);
		pst1.setInt(4, Integer.parseInt(args[3]));
		pst1.setInt(5, Integer.parseInt(args[4]));
		pst1.setInt(6, Integer.parseInt(args[5]));
		pst1.setInt(7, Integer.parseInt(args[6]));
		pst1.setString(8, args[7]);
		pst1.setString(9, args[8]);
		pst1.executeUpdate();
		System.out.println("user added");
	}
}
