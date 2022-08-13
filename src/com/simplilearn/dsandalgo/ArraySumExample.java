package com.simplilearn.dsandalgo;

public class ArraySumExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int l=1;
		int r = 3;
		int sum = 0;
		
		for(int i=l; i<=r; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}