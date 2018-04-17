package com.ab.searching;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LinearSearch {

	public static void main(String[] args) {

		List<Integer> arrayList = Arrays.asList(GetArray.getArray());
		int x = GetArray.getElement();
		System.out.println(search(arrayList, x));

	}

	private static Optional<Integer> search(List<Integer> arrayList, int element) {

		// System.out.println(Arrays.asList(arrayList) + "x : " + element);

		return arrayList.stream().filter(e -> e.equals(element)).findFirst();

	}

}
