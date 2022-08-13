package com.simplilearn.dsandalgo;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the value of k:");
			int k = sc.nextInt();

			printArray(arr);
			int[] temp = rotateArray(arr, k);
			printArray(temp);
		}
		

	}

	private static int[] rotateArray(int[] arr, int k) {
		int n = arr.length;
		int[] temp = new int[n];

		for (int i = 0; i < arr.length; i++) {
			temp[(i + k) % n] = arr[i];
		}
		return temp;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}

}
