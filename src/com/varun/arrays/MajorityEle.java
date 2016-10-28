package com.varun.arrays;

import java.util.Arrays;

public class MajorityEle {

	public static void main(String[] args) {
		int[] input1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int[] input2 = {3, 3, 4, 2, 4, 4, 2, 4};
		int[] input3 = null;
		System.out.println(majorityEle(input1));
		System.out.println(majorityEle(input2));
		System.out.println(majorityEle(input3));
	}
	
	private static boolean majorityEle(int[] input) {
		
		boolean isMajorityEle = false;
		
		if(input != null) {
			Arrays.sort(input);
			
			int numOfEle = 1;
			
			for(int index = 1; index < input.length; index++) {
				
				if(input[index] == input[index-1]) {
					numOfEle++;
				} else {
					numOfEle = 1;
				}
				
				if(numOfEle > input.length/2) {
					return true;
				}
			}
			
		}
		
		return isMajorityEle; 
	}
}
