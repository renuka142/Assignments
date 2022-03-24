package com.day2;

public class passByVal {
	public static void main(String[] args) {
		int sId = 25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("sId "+sId);
	}
	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("sId "+sId);
	}
}
