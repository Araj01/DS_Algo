package com.ab.ds.array;

import java.util.Arrays;

/*
 * Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] 
 * if i is odd and j < i. Given an array of n elements. 
 * Our task is to write a program to rearrange the array such that 
 * elements at even positions are greater than all elements before it 
 * and elements at odd positions are less than all elements before it.
 * 
 * Examples:
 * Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output : 4 5 3 6 2 7 1
 * Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
 * Output : 4 5 2 6 1 8 1 8
 *  
 */

public class ReArrangeArray {

	public static void main(String[] args) {
		int[] arr = Util.getArray();
		System.out.println(Arrays.toString(re_arrangeArray(arr)));
	}

	static int[] re_arrangeArray(int[] arr) {

		int[] a = new int[arr.length];

		int j = 0;
		for (int k = arr.length - 1 - arr.length / 2; k >= 0; k--) {
			a[j] = arr[k];
			j = j + 2;
		}

		j = 1;
		for (int k = arr.length - arr.length / 2; k < arr.length; k++) {
			a[j] = arr[k];
			j = j + 2;
		}

		return a;

	}

	static void sort(int[] arr) {

		for (int i = arr.length / 2 - 1; i >= 0; i--)
			heapify(arr, i, arr.length);

		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, 0, arr.length);
		}

	}

	static void heapify(int[] arr, int i, int n) {
		
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int maxIndex = i;

		if (left < n && arr[left] > arr[maxIndex])
			maxIndex = left;

		if (right < n && arr[right] > arr[maxIndex])
			maxIndex = right;

		if (maxIndex != i) {
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			heapify(arr, maxIndex, n);
		}

	}
}
