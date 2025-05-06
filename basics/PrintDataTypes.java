package com.sangita.basics;

public class PrintDataTypes {

	private int intNum;
	private double doubleNum;
	private char charCh;
	private boolean boolVal;
	private String str;
	
	PrintDataTypes(int intNum, double doubleNum, char charCh, boolean boolVal, String str)
	{
		
		this.intNum = intNum;
		this.doubleNum = doubleNum;
		this.charCh = charCh;
		this.boolVal = boolVal;
		this.str = str;
	}
	
	public void printValues() {
		
		
		System.out.println( "Integer: "+ intNum +"\n"
							+"Double: "+ doubleNum +"\n"
							+"Character: "+ charCh +"\n"
							+"Boolean: "+ boolVal +"\n"
							+"String: "+ str +"\n"
						   ); 
	}


}
