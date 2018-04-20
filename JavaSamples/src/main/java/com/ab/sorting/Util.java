package com.ab.sorting;

public interface Util {
	
	static Integer[] swap(Integer[] array, int j) {
		int temp = array[j];
		array[j] = array[j - 1];
		array[j - 1] = temp;
		return array;
	}

}
