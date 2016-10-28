package com.varun.arrays;

public class SearchEleInRotatedArray {
	
	public static void main(String[] args) {
		int[] ele = {3,4,5,1,2};
		System.out.println(search(ele, 1));
		System.out.println(search(ele, 6));
	}
	
	private static boolean search(int[] input, int key) {
		boolean isELePresent = false;
		if(input != null) {
			for(int value : input) {
				if(value == key) {
					return true;
				}
			}
			return false;
		}
		return isELePresent;
	}
	
	private static int searchBs(int[] input, int key) {
		if(input != null) {
			int pivotIndex = findPivot(input, 0, input.length - 1);
			if(key >= input[0] && key <= input[pivotIndex]) {
				return bs(input, 0, pivotIndex, key);
			} else {
				return bs(input, pivotIndex, input.length-1, key);
			}
		}
		return -1;
	}
	
	private static int bs(int[] input, int start, int end, int key) {
		int mid = (start+end)/2;
		int midEle = input[mid];
		
		if(start == end && key != midEle) {
			return -1;
		} else if(key == midEle) {
			return mid;
		} else if(key > midEle) {
			return bs(input, mid+1, end, key);
		} else {
			return bs(input, start, mid-1, key);
		} 
	}
	
	private static int findPivot(int[] input, int start, int end) {

	}
}
