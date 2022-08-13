package com.simplilearn.dsandalgo;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		
		int[] arr = {62,1,3,67,89,54,45};
		int k = 2;
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);

	}

}
