package com.day8;

public class DayScholar extends PostGrad{
	protected String resAddress;

	public DayScholar(String sId, String sName, char sType, int pcId, String pcName, int pcfess, String resAddress) {
		super(sId, sName, sType, pcId, pcName, pcfess);
		this.resAddress = resAddress;
	}
	

}
