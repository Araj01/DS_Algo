package com.ab.searching;

public class InterPolationSearch {

	public static void main(String[] args) {

		int[] array = GetArray.getArray();
		int x = GetArray.getElement();
		//System.out.println(Arrays.toString(array));
		System.out.println(x + " is found in array at index: "+search(array, x));

	}

	private static int search(int[] array, int element) {

		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			if (array == null || element < array[start] || element > array[end])
				return -1;
			int pos = getPosition(array, start, end, element);
			if (element == array[pos]) {
				return pos;
			} else if (element > array[pos]) {
				start = ++pos;
			} else if (element < array[pos]) {
				end = --pos;
			}
		}
		return -1;
	}

	private static int getPosition(int[] array, int start, int end, int element) {
		return start + Double.valueOf((Integer.valueOf((end - start)).doubleValue()
				/ Integer.valueOf((array[end] - array[start])).doubleValue()
				* Integer.valueOf((element - array[start])).doubleValue())).intValue();
	}

}
