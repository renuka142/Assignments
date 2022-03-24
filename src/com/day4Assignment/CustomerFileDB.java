package com.day4Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import com.day4.customer.Customer;
import com.day4Assignment.*;

public class CustomerFileDB {
	private static final String fileReader = null;
	String file="data\\customer.dat";
	public int saveCustomer(Customer customer) {
		int status =-1;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file,true);
			bufferedWriter = new BufferedWriter(fileWriter);
			String data = customer.getCustomerId()+":"+customer.getCustomerName()+"\n";
			bufferedWriter.write(data);
			bufferedWriter.flush();
			status =0;
		}catch (IOException ioException) {
			// TODO: handle exception
			status =-2;
			ioException.printStackTrace();
		}finally {
			if(null!=bufferedWriter) {
				try {
					bufferedWriter.close();
				}catch(IOException ioException) {
					ioException.printStackTrace();
				}
			}
			if(null!=fileWriter) {
				try {
					fileWriter.close();
				}catch(IOException ioException) {
					ioException.printStackTrace();
				}
			}
		}
		return status;
	}
	public Customer getCustomer(int customerId) {
		Customer customer = null;
		FileReader fileReader = null;
		BufferedReader
		bufferedReader = null;
		BufferedReader bufferedReader;
		try {
			fileReader = new FileWriter(file);
			bufferedReader = new BufferedReader(fileReader);
			String[] data = null;
			String input = bufferedReader.readLine();
			while(input!= null) {
				data = input.split(":");
				if(Integer.parseInt(data[0])==customerId) {
					customer = new Customer();
					customer.setCustomerId(Integer.parseInt(data[0]));
					customer.setCustomerName(data[1]);
					break;
				}
				input = bufferedReader.readLine();
			}
		}catch (IOException ioException) {
			// TODO: handle exception
			ioException.printStackTrace();
		}finally {
			if(null!=bufferedReader) {
				try {
					bufferedReader.close();
				}catch(IOException ioException) {
					ioException.printStackTrace();
				}
			}
			Object fileReader;
			if(null!=fileReader) {
				try {
					fileReader.close();
				}catch(IOException ioException) {
					ioException.printStackTrace();
				}
			}
		}
		return customer;
	}
}
