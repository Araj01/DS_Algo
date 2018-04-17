package com.ab.searching;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] array = new int[20];
		int j = 0;
		while (j < 20) {
			array[j] = (j * 10) + Double.valueOf((Math.random() * 10)).intValue();
			j++;
		}
		int x = Double.valueOf((Math.random() * 10)).intValue()*Double.valueOf((Math.random() * 10)).intValue();
		search(array, x);
	}
	
	private static void search(int[] array, int x){
		
		if(x>array[array.length-1] || x<array[0])
			System.out.println(x+ " is not present in the given array.");
		
		int start =0;
		
		while(start<array.length && x<=array[start]) {
			start *= 2;
		}
		
		BinarySearch.binarySearch(array, start/2, start, x);
		
		
		
	}
	
}
