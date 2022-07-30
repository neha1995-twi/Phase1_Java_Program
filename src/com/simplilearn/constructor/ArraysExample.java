package com.simplilearn.constructor;

public class ArraysExample {

	public static void main(String[] args) {

		OneDArrayExample();

		int[][] arr = {

				{ 1, 2 }, { 3, 4, 5 } };

		for (int i = 0; i < arr.length; i++) {
			int[] innerArr = arr[i];
			for (int j = 0; j < innerArr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		
		System.out.println(arr[1][1000]);
		
	}

	private static void OneDArrayExample() {
		int[] arr = new int[5];

		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;

		System.out.println(arr[0]);

		int[] arr1 = { 21, 22, 23, 24, 25 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
