package com.tests;

import java.util.HashMap;

public class ReaptinGWordCountDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		String data="Hi welcome to Bangalore Hi welcome to mumbai Hi welcome to Bangalore Hi welcome to mumbai";
		String[] arr=data.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
			if(map.containsKey(arr[i])) {
				int cnt = map.get(arr[i]);
				map.put(arr[i], cnt+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map);
		
	}

}
