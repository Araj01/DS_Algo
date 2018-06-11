package com.ab.ds.array;

public class MinimumDistanceBetweenTwoNumbers {

	public static void main(String[] args) {
		int[] arr = {3, 4, 5};
		int x = 3;
		int y = 5;
		System.out.println(minDistanceBetweenTwoNumbers(arr, x, y));
	}

	static int minDistanceBetweenTwoNumbers(int[] arr, int x, int y) {

		int mindistance = arr.length;
		int left = -1;
		int leftNum = arr[0];
		for (int z = 0; z < arr.length; z++) {

			if (arr[z] == x) {
				if (leftNum == y) {
					if (z - left < mindistance) {
						mindistance = z - left;
					}

				}
				left = z;
				leftNum = x;

			} else if (arr[z] == y) {

				if (leftNum == x) {
					if (z - left < mindistance) {
						mindistance = z - left;

					}

				}
				left = z;
				leftNum = y;
			}

		}

		return mindistance;

	}

}
