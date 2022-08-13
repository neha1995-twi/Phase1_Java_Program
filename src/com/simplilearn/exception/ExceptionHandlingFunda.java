package com.simplilearn.exception;

public class ExceptionHandlingFunda {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		
		try {
			int a = 1;
			int b= 5;
			int c = b/a;
		} catch(ArithmeticException e) {
			System.out.println("Arithmatic exc occurred");
		} catch(Exception e) {
			System.out.println("Exception occurred");
		} finally {
			System.out.println("Finally called");
		}
		
		
		
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
	}
	
	public static void test() {
		test();
	}

}
