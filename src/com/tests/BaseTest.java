package com.tests;

import java.util.List;

public class BaseTest {
	
	public String selectEnv(String env) {
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


		
		/*
		 * for(int i=0;i<lst1.size();i++) { System.out.println(lst1.get(i)); }
		 */
		
		//lst1.remove(0);
		//System.out.println(lst);
		
		/*
		 * for(int i=0;i<lst1.size();i++) { System.out.println(lst1.get(i)); }
		 */
		return lst1;
	}
	

}
