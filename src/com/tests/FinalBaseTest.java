package com.tests;

import java.util.HashMap;
import java.util.List;

final public class FinalBaseTest {
	
	protected String selectEnv(String env) {
		//String env="qa";
		String url;
		if(env.equals("dev")) {
			System.out.println("i am in cmcm dev env");
			url = "https://www.cbcmdev.com";
			
		}else if(env.equals("qa")) {
			System.out.println("i am in cmcm qa env");
			url = "https://www.cbcmqa.com";
		}else if(env.equals("prod")) {
			System.out.println("i am in prod env");
			url = "https://www.cbcmprod.com";
		}else {
			System.out.println("i am in  UAT");
			url = "https://www.cbcmuat.com";
		}
		return url;
	}
	
	public int[] addArray1(int[] a,int[] b) {
		
		int[] result = new int[a.length];
		
		for(int i=0;i<result.length;i++) {
			
			result[i]=a[i]+b[i];
			
			//System.out.println(result[i]);
		}
		return result;
	}

	public List listDemo(List lst1) {

		return lst1;
	}
	
	public HashMap<String, Integer> countDuplicateWords(String data) {
		String[] arr = data.split(" ");
		HashMap<String, Integer> map= new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
			if(map.containsKey(arr[i])) {
				int cnt = map.get(arr[i]);
				map.put(arr[i], cnt+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}
	

}
