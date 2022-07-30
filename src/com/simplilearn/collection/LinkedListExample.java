package com.simplilearn.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Dhruvik");
		list.add("Neha");
		list.add("Pratima");
		list.add("Dhruvik");
		list.add(3, "Pratima");

		for (String data : list) {
			System.out.println(data);
		}

	}

}
