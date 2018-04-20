package com.ab.sorting;

import java.util.Arrays;

import com.ab.searching.GetArray;

public class MergeSort {

	public static void main(String[] args) {

		Integer[] array = GetArray.getUnsortedArray();
		System.out.println(Arrays.asList(array));
		sort(array, array.length);
		System.out.println(Arrays.asList(array));
	}

	public static void sort(Integer[] array, int length) {

		if (length < 2)
			return;

		int mid = array.length / 2;

		Integer[] left = new Integer[mid];
		Integer[] right = new Integer[array.length - mid];

		for (int i = 0; i < left.length; i++) {
			left[i] = array[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = array[mid + j];
		}
		sort(left, left.length);
		sort(right, right.length);
		merge(left, right, array);
	}

	public static void merge(Integer[] left, Integer[] right, Integer[] array) {

		// Integer[] newArray = new Integer[left.length+right.length];

		int j = 0, k = 0, i = 0;

		while (j < left.length && k < right.length) {

			if (left[j] < right[k])
				array[i++] = left[j++];
			else
				array[i++] = right[k++];

		}

		while (j < left.length) {
			array[i++] = left[j++];
		}
		while (k < right.length) {
			array[i++] = right[k++];
		}

	}

}
