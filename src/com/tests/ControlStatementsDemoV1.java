package com.tests;

public class ControlStatementsDemoV1 {
	
	public static void main(String[] args) {
		BaseTest baseTest = new BaseTest();
		String url = baseTest.selectEnv("qa");
		System.out.println("Launch url::"+url);
		
	}
	
}
