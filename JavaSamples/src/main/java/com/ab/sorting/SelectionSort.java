package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array);
	}

	public static void sort(Integer[] array) {

		for (int i = 0; i < array.length; i++) {
			int minimum_index = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minimum_index])
					minimum_index = j;

			}

			int min = array[minimum_index];
			array[minimum_index] = array[i];
			array[i] = min;
		}

		System.out.println(Arrays.asList(array));
	}

}
