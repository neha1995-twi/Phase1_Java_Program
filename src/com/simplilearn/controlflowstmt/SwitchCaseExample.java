package com.simplilearn.controlflowstmt;

public class SwitchCaseExample {

	public static void main(String[] args) {
		int n = 10;

		switch (n) {
		case 10:
			System.out.println("10");
			break;

		case 20:
			System.out.println("20");
			break;

		default:
			System.out.println("Default case");
		}
	}
}
