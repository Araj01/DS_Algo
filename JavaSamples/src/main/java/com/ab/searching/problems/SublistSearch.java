/**
 * 
 */
package com.ab.searching.problems;

import java.util.Arrays;

import com.ab.searching.GetArray;

/*
 *Search a linked list in another list.
 *Given two linked lists, the task is to check whether the first list is present in 2nd list or not.
 */

public class SublistSearch {

	public static void main(String[] args) {
		Integer[] a = GetArray.getArray();
		Integer[] b = GetArray.getArray();
		//Integer[] b1 = new Integer[5];
		/*for (int i = 0; i < 5; i++) {
			b1[i] = a[i];
		}*/
		boolean isPresent = search(b, a);
		System.out.println(isPresent);
	}

	private static boolean search(Integer[] a, Integer[] b) {

		int i = 0, j = 0;
		boolean present = false;

		while (j < b.length && i < a.length) {

			if (b.length - j < a.length - i) {
				break;
			}

			if (b[j] == a[i]) {
				present = true;
				;
				i++;
				j++;
				continue;
			} else {
				i = 0;
				j++;
				present = false;
			}
		}
		return present;
	}
}
