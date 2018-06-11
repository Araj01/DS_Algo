package com.ab.ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    
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
