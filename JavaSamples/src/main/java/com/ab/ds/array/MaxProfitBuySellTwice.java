package com.ab.ds.array;

public class MaxProfitBuySellTwice {

	static int maxProfit(int[] arr) {

		int n = arr.length;
		int[] profit = new int[n];
		int min = arr[0];
		int max = arr[n - 1];

		for (int i = 1; i < n; i++) {

			if (min > arr[i])
				min = arr[i];
			profit[i] = Math.max(profit[i - 1], arr[i] - min);
		}

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > max)
				max = arr[i];
			profit[i] = Math.max(profit[i], profit[i] + max - arr[i]);
		}

		int max_profit = profit[0];
		for (int i : profit)
			if (max_profit < i)
				max_profit = i;
		return max_profit;

	}

	public static void main(String[] args) {
		int[] arr = { 90, 80, 70, 60, 50 };
		System.out.println(maxProfit(arr));
	}

}
