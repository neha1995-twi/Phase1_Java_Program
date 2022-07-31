package com.simplilearn.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> list = new LinkedHashSet<>();

		list.add("Dhruvik");
		list.add("Neha");
		list.add("Pratima");
		list.add("Dhruvik");

		for (String data : list) {
			System.out.println(data);
		}

	}

}
