package com.tests;

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
	
	

}
