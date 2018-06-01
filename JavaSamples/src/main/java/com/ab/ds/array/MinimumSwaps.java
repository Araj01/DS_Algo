package com.ab.ds.array;

import java.util.Scanner;

/*
 * You are given an array of N numbers and a number K.
 * Find the minimum number of swaps required to bring
 * all the numbers greater than or equal to K together.
 */

public class MinimumSwaps {

	static Scanner sc = new Scanner(System.in);
	static int n, k;

	public static void main(String[] args) {
		int[] arr = getArray();
		System.out.print(count_min_swap(arr));
		sc.close();
		return;
	}

	static int[] getArray() {
		n = sc.nextInt();
		k = sc.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < n; j++)
			arr[j] = sc.nextInt();

		return arr;
	}

	static int count_min_swap(int[] arr) {

		int num_of_elements = 0;

		for (int i : arr)
			if (i >= k)
				num_of_elements++;
		
		int close_elements = 0;
		
		for (int i = 0; i < num_of_elements; i++) {
			if (arr[i] >= k)
				close_elements++;
		}

		int min_elements = close_elements;

		for (int i = 0, j = num_of_elements; i < arr.length - num_of_elements; j++, i++) {

			if (arr[i] >= k)
				close_elements--;
			if (arr[j] >= k)
				close_elements++;
			if (close_elements > min_elements)
				min_elements = close_elements;

		}

		return num_of_elements - min_elements;
	}

}
