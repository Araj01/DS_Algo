package com.ab.ds.array;

import java.util.Arrays;
import java.util.Scanner;

/* Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
 *  For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
 *  it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. 
 *  The order of all other elements should be same.
 *  Expected time complexity is O(n) and extra space is O(1).
 *  Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 *  Output : arr[] = {1, 2, 4, 3, 5, 0, 0};
 *  Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
 *  Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 */

public class RearrangeArray_2 {
    
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	    
	    int t = sc.nextInt();
	    while(t-->=0){
	        int[] arr = getArray();
	        System.out.print(Arrays.toString(re_arrangeArray(arr)));
	        System.out.print(" ");
	    }
	    sc.close();
	    return;
	}

	static int[] getArray() {

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int k = 0; k < n; k++)
			arr[k] = sc.nextInt();

		return arr;

	}

	static int[] re_arrangeArray(int[] arr) {

		int zero_element_index = 0;

		int non_zero_element_index = 0;

		while (non_zero_element_index < arr.length) {

			while (zero_element_index < arr.length && arr[zero_element_index] != 0)
				zero_element_index++;

			non_zero_element_index = zero_element_index + 1;

			while (non_zero_element_index < arr.length && arr[non_zero_element_index] == 0)
				non_zero_element_index++;

			if (non_zero_element_index < arr.length) {
				arr[zero_element_index] = arr[non_zero_element_index];
				arr[non_zero_element_index] = 0;
			}
		}

		return arr;

	}


}
