/**
 * 
 */
package com.ab.ds.array;

import java.util.Arrays;

import com.ab.searching.GetArray;

/**
 * @author abraj
 *
 */
public class ProgramForArrayRotation {

	public static void main(String[] args) {

		Integer[] array = GetArray.getArray();
		int x = GetArray.getElement() / 10 + 1;
		System.out.println(Arrays.asList(array));
		rotate(array, 8);
		System.out.println(Arrays.asList(array));
	}

	public static void rotate(Integer[] array, int x) {

		int j = 0;
		for (int i = x; i < array.length; i++) {

			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
			j++;
			System.out.println(Arrays.asList(array));
			
		}

	}

}
