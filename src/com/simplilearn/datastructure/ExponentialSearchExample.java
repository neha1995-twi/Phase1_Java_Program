package com.simplilearn.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearchExample {

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

		if (arr[0] == elem) {
			return true;
		}

		int i = 1;
		int n = arr.length;
		while (i < n && arr[i] <= elem) {
			i *= 2;
		}

		// Range : i/2 upto min(i, n)
		int val = Arrays.binarySearch(arr, i / 2, Math.min(i, n), elem);
		if (val >= 0)
			return true;

		return false;
	}
}