package com.simplilearn.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();

		map.put(1, "Amit");
		map.put(10, "Rahul");
		map.put(5, "Shubham");
		map.put(6, "Dhruvik");
		//map.put(6, "Goswami");
		//map.put(null, "ananth");
		map.put(11, "Dhruvik");

		//System.out.println(map.get(null));

		Set<Integer> keys = map.keySet();
		for(Integer d : keys) {
			System.out.println(d +"- "+map.get(d));
		}
		System.out.println("==========================");
		
		Set<Entry<Integer, String>> vals = map.entrySet();
		for (Entry<Integer, String> entry : vals) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}

}
