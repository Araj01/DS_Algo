package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class RecursiveBubbleSort {

	public static void main(String[] args) {

		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array, array.length);
		System.out.println(Arrays.asList(array));

	}

	public static void sort(Integer[] array, int n) {

		if (n == 1)
			return;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		sort(array, --n);
	}

}
