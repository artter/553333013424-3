package com.rmuti.basiclab;

public class AaronRamsey {
	public String name;
	public String position;
	public String friend[];
	
	public AaronRamsey(){
		name = "Aaron Ramsey";
		position = "Center";
		friend = new String[] {"Bacary Sagna","Per Mertesacker","Thomas Vermaelen"}; 
	}
	
	public String getName(){
		return name;
	}
	
	public String getPosition(){
		return position;
	}
	public String[] getFriend(){
		return friend;
	}
}
