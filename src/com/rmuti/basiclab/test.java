package com.rmuti.basiclab;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		AaronRamsey x = new AaronRamsey();
		System.out.println("Name : "+x.getName());
		System.out.println("Position : "+x.getPosition());
		System.out.println("Friends : "+Arrays.toString(x.getFriend()));
	}

}
