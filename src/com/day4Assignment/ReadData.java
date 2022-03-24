package com.day4Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

//import jdk.internal.org.jline.utils.InputStreamReader;

public class ReadData {
	public static String acceptString() {
		String stringData =null;
		BufferedReader input = null;
		try {
			input= new BufferedReader(new InputStreamReader(System.in));
			stringData = input.readLine();
		}
		catch(IOException ioExecption) {
			System.out.println("Error in accepting the data");
		}
		finally {
			if(input!=null) {
				input=null;
			}
		}
		return stringData;
	}

	private static void BufferedReader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated method stub
		
	}
}
