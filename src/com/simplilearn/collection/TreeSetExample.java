package com.simplilearn.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> list = new TreeSet<>();

		list.add("Dhruvik");
		list.add("Neha");
		list.add("Pratima");
		list.add("Dhruvik");
		list.add("Ananth");
		list.add("11a");
		// list.add(null);

		for (String data : list) {
			System.out.println(data);
		}

	}

}
