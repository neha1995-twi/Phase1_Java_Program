package com.simplilearn.collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Dhruvik");
		list.add("Neha");
		list.add("Pratima");
		list.add("Dhruvik");
		
		for(String data : list) {
			System.out.println(data);
		}
		

	}

}
