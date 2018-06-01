package com.ab.ds.array;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of positive and negative numbers, arrange them 
such that all negative integers appear before all the positive integers in the array
without using any additional data structure like hash table, arrays, etc. 
The order of appearance should be maintained.
Examples:

Input :  arr[] = [12 11 -13 -5 6 -7 5 -3 -6]
Output : arr[] = [-13 -5 -7 -3 -6 12 11 6 5]

Input :  arr[] = [-12 11 0 -5 6 -7 5 -3 -6]
Output : arr[] =  [-12 -5 -7 -3 -6 11 0 6 5]*/

public class RearrangePositiveAndNegativeNumbers {

	static Scanner sc = new Scanner(System.in);
	static int n, k;

	public static void main(String[] args) {
		int[] arr = getArray();
		System.out.print(Arrays.toString(rearrange_array(arr)));
		sc.close();
		return;
	}

	static int[] getArray() {
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < n; j++)
			arr[j] = sc.nextInt();

		return arr;
	}

	static int[] rearrange_array(int[] arr) {

		int start = 0, end = 1;
		while (start < end && end < arr.length) {
			while (end < arr.length && arr[end] >= 0) {
				end++;
			}
			if(end < arr.length) {
			int temp = arr[end];
			for (int i = end; i > start; i--) {
				arr[i] = arr[i - 1];
			}
			arr[start] = temp;
			start++;
			}
		}

		return arr;

	}

}
