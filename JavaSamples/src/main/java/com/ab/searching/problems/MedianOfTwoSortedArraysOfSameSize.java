/**
 * 
 */
package com.ab.searching.problems;

import com.ab.searching.GetArray;

/**
 * @author abraj
 *
 */
public class MedianOfTwoSortedArraysOfSameSize {

	/*
	 * There are 2 sorted arrays A and B of size n each. Write an algorithm to find
	 * the median of the array obtained after merging the above 2 arrays(i.e. array
	 * of length 2n). The complexity should be O(log(n)).
	 * 
	 * Integer[] a = {1,3,4,5,7}; 
	 * Integer[] b = {2,8,9,12,15}; 
	 * Integer[] mergedArray = {1,2,3,4,5,7,8,9,12,15}; // Merge till n elements only.
	 * Integer median = (5+7)/2 = 6;
	 */
	
	public static void main(String[] args) {
		Integer[] a = GetArray.getArray();
		Integer[] b = GetArray.getArray();
		int mean = merge(a, b);
		System.out.println(mean);
	}

	public static int merge(Integer[] a, Integer[] b) {

		int a_length = a.length;
		int b_length = b.length;
		Integer[] mergedArray = new Integer[a_length + 1]; 
		int i = 0, j = 0, pos = 0;

		while (i < a_length && j < b_length && pos < mergedArray.length) {
			
			if(a[i] < b[j]) {
				mergedArray[pos++] = a[i++];
			}else {
				mergedArray[pos++] = b[j++];
			}
		}
		
		if(i< a_length && pos < mergedArray.length) {
			mergedArray[pos++] = a[i++];
		}
		
		if(j< b_length && pos < mergedArray.length) {
			mergedArray[pos++] = b[j++];
		}
		
		int mean = (mergedArray[a_length] + mergedArray[a_length - 1]) / 2;
		return mean;

	}

}
