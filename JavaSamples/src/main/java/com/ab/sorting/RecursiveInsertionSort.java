package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class RecursiveInsertionSort {

	public static void main(String[] args) {
		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array, 1);
		System.out.println(Arrays.asList(array));
	}

	public static void sort(Integer[] array, int n) {

		if (n == array.length)
			return;

		for (int i = n; i > 0 && array[i] < array[i - 1]; i--) {
			Util.swap(array, i);
		}

		sort(array, ++n);
	}

}
