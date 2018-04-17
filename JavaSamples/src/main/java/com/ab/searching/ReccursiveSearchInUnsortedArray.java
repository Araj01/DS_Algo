package com.ab.searching;

/*
 * Recursive program to linearly search an element in a given array.
 * 
 * Given an unsorted array and an element x, search x in given array. 
 * 
 * If element is not present, return -1. 
 */

public class ReccursiveSearchInUnsortedArray {

	public static void main(String[] args) {

		int[] array = GetArray.getArray();
		int x = GetArray.getElement();
		search(array, x, 0);

	}

	public static int search(int[] array, int x, int index) {

		if (x == array[index]) {
			return index;
		}
		if (++index < array.length)
			search(array, x, index);

		return -1;

	}

}
