package com.day8;

public class PostGrad extends Student{
	protected int pcId;
	protected String pcName;
	protected int pcfess;
	public PostGrad(String sId, String sName, char sType, int pcId, String pcName, int pcfess) {
		super(sId, sName, sType);
		this.pcId = pcId;
		this.pcName = pcName;
		this.pcfess = pcfess;
	}
	
}
