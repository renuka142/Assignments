package com.day5Assignment;

public class JaggedArray {
	public static void main(String[] args) {
		String arr[][] = new String[][] {
			new String[] {"TONY","JAVA","C","C++"},
			new String[] {"THOMAS","JAVA","UNIX"},
			new String[] {"DINIL","LINUX","ORACLE"},
			new String[] {"DELVIN","RDBMS","C#","ORACLE"}
		};
		for(int i=0;i<arr[3].length;i++)
			System.out.println(arr[3][i]);
		
		
		
	}
}
