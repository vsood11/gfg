package com.varun.arrays;

public class LeadersOfAnArray {
	
	public static void main(String[] args) {
		leaders(new int[] {16, 17, 4, 3, 5, 2});
	}
	
	private static void leaders(int[] input) {
		
		if(input != null) {
			int max = input[input.length - 1];
			System.out.println(max);
			int index = input.length - 2;
			
			for(int i = index; i >= 0 ; i--) {
				if(input[i] > input[i+1] && input[i] > max) {
					System.out.println(input[i]);
					max = input[i];
				}
			}
		}
	}

}
