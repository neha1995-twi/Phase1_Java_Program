package com.simplilearn.datastructure;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };


		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter element to be searched for:");
			int elem = sc.nextInt();

			if (isElementFound(arr, elem)) {
				System.out.println(elem + " Element found in array");
			} else {
				System.out.println(elem + " Element not found in array");
			}
			sc.close();

		}
		
	}

	static boolean isElementFound(int[] arr, int elem) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elem) {
				return true;
			}
		}
		return false;
	}

}
