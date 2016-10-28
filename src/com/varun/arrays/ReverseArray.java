package com.varun.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(reverse(input)));
	}

	private static int[] reverse(int[] input) {

		if (input != null) {
			int startIndex = 0;
			int endIndex = input.length - 1;

			while (startIndex <= endIndex) {
				int temp = input[startIndex];
				input[startIndex] = input[endIndex];
				input[endIndex] = temp;
				startIndex++;
				endIndex--;
			}
		}
		return input;
	}
}
