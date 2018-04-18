package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class BubbleSort {

	public static void main(String[] args) {

		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array);
		System.out.println(Arrays.asList(array));
	}
	
	public static void sort(Integer[] array) {
		
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
	}

}
