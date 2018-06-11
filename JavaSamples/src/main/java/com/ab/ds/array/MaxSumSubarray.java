package com.ab.ds.array;

public class MaxSumSubarray {
	
	static void maxSumSubArrary(int[] arr){
		int max = arr[0];
		int maxTillHere = arr[0];
		for(int i = 1; i < arr.length; i++) {
			maxTillHere += arr[i];
			if(maxTillHere < 0)
				maxTillHere = 0;
			if(max < maxTillHere)
				max = maxTillHere;
			
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		maxSumSubArrary(arr);

	}

}
