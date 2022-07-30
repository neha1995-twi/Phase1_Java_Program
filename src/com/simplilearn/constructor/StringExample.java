package com.simplilearn.constructor;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "abc"; // 1 CP, 1 Ref, 0 Heap
		String s2 = new String("bcd"); // 2 CP, 2 Ref, 1 Heap
		s1 = "bcd"; // 2 CP, 2 Ref, 1 Heap
		s2 = "cde"; // 3 CP, 2 Ref,1 Heap
		String s3 = new String("cde"); // 3 CP, 3 Ref, 2 Heap
		// ------------------------------

		String s11 = new String("Hello World");
		System.out.println(s11.length());

		String sub = new String("Welcome");
		System.out.println(sub.substring(2));

		String s12 = "Hello";
		String s13 = "Heldo";
		System.out.println(s12.equals(s13));

		System.out.println(s12.toUpperCase());

		// StrinbBuider - Non Synchronized - Good Performance
		int marks = 90;
		StringBuilder sb = new StringBuilder();
		sb.append("Dhruvik is");

		if (marks > 80) {
			sb.append(" a good programmer ");
		} else {
			sb.append(" a bad programmer ");
		}

		System.out.println(sb.toString());

		 // Synchronized construct - Performance low
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("Dhruvik is");

		if (marks > 80) {
			sbuffer.append(" a good programmer ");
		} else {
			sbuffer.append(" a bad programmer ");
		}
		System.out.println(sb.toString());

	}
}