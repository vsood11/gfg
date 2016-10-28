package com.varun.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOccuringOddTime {
	
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 2, 3, 1, 3};
		//System.out.println(numberOccuringOddTime(input));
		System.out.println(oddXOR(input));
		
		
		int[] input1 = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		//System.out.println(numberOccuringOddTime(input1));
		System.out.println(oddXOR(input1));
		
	}
	
	private static boolean numberOccuringOddTime(int[] input) {
		Map<Integer, Integer> numberCount = new HashMap<Integer, Integer>();
		
		if(input != null) {
			for(int key : input) {
				numberCount.put(
						key,
						numberCount.get(key) == null ? 0 + 1 
								: numberCount.get(key) + 1
								);
			}
		}
		
		for(Map.Entry<Integer, Integer> keySet : numberCount.entrySet()) {
			if(keySet.getValue() %2 == 1) {
				System.out.println(keySet.getKey());
				return true;
			}
		}
		
		return false;
	}
	
	private static int oddXOR(int[] input) {
		int result = 0;
		
		if(input != null) {
			for(int i = 0; i < input.length; i++) {
				result = result ^ input[i];
			}
		}
		return result;
	}
}
