package com.rumti.basiclab2;

import java.util.Arrays;

public class ArryListjava {
	private Object[] elementData = new Object[1];
	private int size = 0;
	
	public void add(Object x){
		add(size,x);
	}

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		elementData[i]=e;
		size++;
	}

	private Object[] ensureCapacity(int capacity){
		if(capacity>elementData.length){
			Object[] arr = new Object[elementData.length*5];
			//for (int i = size - 1; i >= i; i--);
			elementData = arr;
		}
		return elementData;
	}
	public static void main(String[] args) {
		ArryListjava al = new ArryListjava();
		al.add("1");
		al.add("2");
		System.out.println(al);
	}

}
