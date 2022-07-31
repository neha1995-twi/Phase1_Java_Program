package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> list = new HashSet<>();

		list.add("Dhruvik");
		list.add("Neha");
		list.add("Pratima");
		list.add("Dhruvik");

		// Enhanced for loop - JDK 8
		for (String data : list) {
			System.out.println(data);
		}

	}

}
