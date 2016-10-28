package com.varun.arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] input = {1, 2, 4,	6, 3, 7, 8};
		int lastNum = 8;
		System.out.println(missingNum(input, lastNum));
	}
	
	private static int missingNum(int[] input, int lastNum) {
		
		if(lastNum < 1 || input == null) {
			return -1;
		}
		
		int expectedSum = ((1+lastNum)*lastNum)/2;
		int actualSum = 0;
		
		for(int num : input) {
			actualSum += num;
		}
		
		return expectedSum - actualSum;
	}
}
