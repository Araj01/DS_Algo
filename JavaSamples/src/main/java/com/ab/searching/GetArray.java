package com.ab.searching;

public class GetArray {
	
	public static int[] getArray() {
		int[] array = new int[20];
		int j = 0;
		while (j < 20) {
			array[j] = (j * 10) + Double.valueOf((Math.random() * 10)).intValue();
			j++;
		}
		
		return array;
	}
	
	public static int getElement() {
		return Double.valueOf((Math.random() * 10)).intValue()*Double.valueOf((Math.random() * 10)).intValue();
	}
	


}
