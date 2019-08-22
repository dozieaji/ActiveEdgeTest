package com.example.dozie;

public class Solution {
	
	//Given arrayValues = [1, 3, 6, 4, 1, 2], the function should return 5.
	//Given arrayValues = [5, −1, -3], the function should return 1.
	
	public static int solution(int[] arrayValues) {

	    int N = arrayValues.length;

	    int[] C = new int[N];

	 
	    for (int i = 0; i < N; i++) {

	        // Need an absolute value for the duplicates
	       
	        int j = Math.abs(arrayValues[i]) - 1;

	        if (j >= 0 && j < N && arrayValues[j] > 0) {
	            C[j] = -arrayValues[j];
	        }
	    }

	    for (int i = 0; i < N; i++) {

	        if (C[i] == 0) {
	            return i + 1;
	        }
	    }

	    return N + 1;
	}

}
