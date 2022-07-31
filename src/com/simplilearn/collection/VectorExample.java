package com.simplilearn.collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Dhruvik");
		v.add("Neha");
		v.add("Pratima");
		v.add("Dhruvik");

		for (String data : v) {
			System.out.println(data);
		}

	}

}
