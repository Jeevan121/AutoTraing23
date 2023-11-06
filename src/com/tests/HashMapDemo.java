package com.tests;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1month", 200);
		map.put("2month", 300);
		map.put("6month", 600);
		map.put("12month", 900);
		
		System.out.println(map);
		
		map.put("2month", 250);
		
		System.out.println(map);
		
		TreeMap<Integer, String> treemap = new TreeMap<>();
		treemap.put(11, "John");
		treemap.put(8, "Bob");
		treemap.put(22, "James");
		
		System.out.println(treemap);
	}

}
