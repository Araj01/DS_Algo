package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array);
	}

	public static void sort(Integer[] array) {

		for (int i = 0; i < array.length-1; i++) {

			for (int j = i + 1; j > 0 && array[j] < array[j-1]; j--) {

				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;

			}
		}

		System.out.println(Arrays.asList(array));
	}

}
