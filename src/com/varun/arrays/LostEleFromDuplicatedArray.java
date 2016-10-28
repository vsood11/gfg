package com.varun.arrays;

public class LostEleFromDuplicatedArray {
	
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 5, 7, 9};
		int[] arr2 = {4, 5, 7, 9};
		
		System.out.println(lostEle(arr2, arr1));
	}

	private static int lostEle(int[] input1, int[] input2) {
		int res1 = 0;
		for(int value : input1) {
			res1 += value;
		}
		
		
		int res2 = 0;
		for(int value : input2) {
			res2 += value;
		}
		
		return Math.abs(res1 - res2);
	}
}
