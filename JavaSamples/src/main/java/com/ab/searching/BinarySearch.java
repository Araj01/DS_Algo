/**
 * 
 */
package com.ab.searching;

/**
 * @author abraj
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int length = array.length;
		int x = 0;
		binarySearch(array, 0, length - 1, x);
	}

	private static void binarySearch(int[] array, int start, int end, int x) {
		if (start == end && x != array[end]) {
			System.out.println("Binary search result: Value " + x + " doesn't exist in the sorted array.");
			return;
		}
		int mid = (start + end) / 2;
		if (x == array[mid]) {
			System.out.println(
					"Binary search result: Value " + x + " is found at index: " + mid + " in the sorted array.");
			return;
		} else if (x > array[mid]) {
			binarySearch(array, mid + 1, end, x);
		} else if (x < array[mid]) {
			binarySearch(array, start, mid - 1, x);
		}
	}
}
