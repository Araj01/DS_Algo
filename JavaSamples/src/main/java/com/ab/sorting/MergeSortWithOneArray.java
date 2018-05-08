/*package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class MergeSortWithOneArray {

	public static void main(String[] args) {

		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array, new Integer[array.length], 0, array.length-1);
		System.out.println(Arrays.asList(array));
	}

	public static void sort(Integer[] array, Integer[] temp, int leftStart, int rightEnd) {

		if (leftStart >= rightEnd)
			return;

		int mid = array.length / 2;

		//Integer[] left = new Integer[mid];
		//Integer[] right = new Integer[array.length - mid];

		int leftEnd = mid;
		int rightStart = mid+1;
		
		for (int i = 0; i < leftEnd; i++) {
			temp[i] = array[i];
		}
		for (int j = rightStart; j < rightEnd; j++) {
			temp[j] = array[mid + j];
		}
		
		sort(array, temp, leftStart, mid);
		sort(array, temp, rightStart, rightEnd);
		merge(temp,leftStart, mid, rightEnd );
	}

	public static void merge(Integer[] array, int leftStart, int mid, int rightEnd) {

		// Integer[] newArray = new Integer[left.length+right.length];

		int j = 0, k = 0, i = 0;

		while (j < mid && k < rightEnd) {

			if (array[j] > array[k]) {
				int temp = array[j];
				array[j] = array[k];
			}
		

		}

		while (j < left.length) {
			array[i++] = left[j++];
		}
		while (k < right.length) {
			array[i++] = right[k++];
		}

	}

}
*/