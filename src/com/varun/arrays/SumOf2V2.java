package com.varun.arrays;

import java.util.Arrays;

public class SumOf2V2 {

	public static void main(String[] args) {
		int[] input = { 5, 2, -1, 3, 10 };
		int sum = 6;
		System.out.println(isSumPresent(input, sum));

		int[] input1 = { 5, 2, 1, 3, 10 };
		sum = 6;
		System.out.println(isSumPresent(input1, sum));

		int[] input2 = null;
		sum = 6;
		System.out.println(isSumPresent(input2, sum));
		
		int[] input3 = {5,1,5};
		sum = 10;
		System.out.println(isSumPresent(input3, sum));
	}
	
	private static boolean isSumPresent(int[] input, int sum) {
		boolean isSumPresnet = false;
		
		if(input != null) {
			Arrays.sort(input);
			int startIndex = 0;
			int lastIndex = input.length - 1;
			while(startIndex < lastIndex) {
				if( (input[startIndex] + input[lastIndex]) == sum) {
					return true;
				} else if( (input[startIndex] + input[lastIndex]) < sum) {
					startIndex++;
				} else {
					lastIndex--;
				}
			}
		}
		
		return isSumPresnet;
	}
}
