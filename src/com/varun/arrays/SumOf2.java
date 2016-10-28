package com.varun.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOf2 {

	public static void main(String[] args) {
		int[] input = { 5, 2, -1, 3, 10 };
		int sum = 6;
		System.out.println(sumOf2(input, sum));

		int[] input1 = { 5, 2, 1, 3, 10 };
		sum = 6;
		System.out.println(sumOf2(input1, sum));

		int[] input2 = null;
		sum = 6;
		System.out.println(sumOf2(input2, sum));
		
		int[] input3 = {5,1,5};
		sum = 10;
		System.out.println(sumOf2(input3, sum));
	}

	private static boolean sumOf2(int[] input, int sum) {
		boolean isSumPresent = false;
		Set<Integer> values = new HashSet<Integer>();
		if (input != null) {
			values.add(input[0]);
			for (int index = 1; index < input.length; index++) {
				if (values.contains(sum - input[index])) {
					return true;
				}
				values.add(input[index]);
			}
		}
		return isSumPresent;
	}
}
