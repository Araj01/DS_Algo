package com.ab.ds.array;

import java.util.Scanner;

public class Util {

	public static int[] getArray() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int k = 0; k < n; k++)
			arr[k] = sc.nextInt();

		sc.close();

		return arr;

	}

}
