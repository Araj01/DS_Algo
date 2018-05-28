package com.ab.sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
	
	    int arr[] = {121, 10, 130, 57, 36, 17};
	    int n = arr.length;
	    sort(arr, n);
	    System.out.println(Arrays.toString(arr));	    
	}
	
	public static void sort(int[] arr, int n) {
		
		for(int i = n/2-1; i>=0; i--) {			
			heapify(arr,n, i);					
		}
		
	    for (int i=n-1; i>=0; i--) {	        
	    	swap(arr, 0, i);
	        heapify(arr, i, 0);
	    }
		
	}
	
	public static void heapify(int[] arr, int n, int i) {
		
		int left = 2*i+1;
		int right = 2*i+2;
		int maxIndex = i;
		
		if(left < n && arr[left] > arr[maxIndex])
			maxIndex = left;
		
		if(right < n && arr[right] > arr[maxIndex])
			maxIndex = right;
		
		if(maxIndex != i) {
			swap(arr, i, maxIndex);
			heapify(arr, n, i);
		}
	}
	
	public static void swap(int[] arr, int l, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

}
