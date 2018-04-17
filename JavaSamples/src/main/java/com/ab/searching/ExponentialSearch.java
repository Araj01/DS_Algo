package com.ab.searching;

public class ExponentialSearch {

	public static void main(String[] args) {
		Integer[] array = GetArray.getArray();
		int x = GetArray.getElement();
		search(array, x);
	}
	
	private static void search(Integer[] array, int x){
		
		if(x>array[array.length-1] || x<array[0])
			System.out.println(x+ " is not present in the given array.");
		
		int start =0;
		
		while(start<array.length && x<=array[start]) {
			start *= 2;
		}
		
		BinarySearch.binarySearch(array, start/2, start, x);
		
		
		
	}
	
}
