package com.simplilearn.datastructure;

import java.util.Scanner;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("Please enter element to be searched for:");
			int elem = sc.nextInt();

			if (isElementFound(arr, elem)) {
				System.out.println(elem + " Element found in array");
			} else {
				System.out.println(elem + " Element not found in array");
			}
		}
		
	}

	static boolean isElementFound(int[] arr, int elem) {
		
		int start = 0;
		int end = arr.length-1;
		
		int mid = (start+end)/2;
		
		while(start <= end ) {
			if(arr[mid] < elem) {
				start= mid+1;
			} else if(arr[mid] == elem) {
				return true;
			} else {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		return false;
	}

}
