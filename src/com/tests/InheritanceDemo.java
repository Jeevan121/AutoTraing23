package com.tests;

import java.util.HashMap;

public class InheritanceDemo extends BaseTest{
	
	public static void main(String[] args) {
		//BaseTest obj = new BaseTest();
		//obj.addArray1(", null)
		InheritanceDemo obj = new InheritanceDemo();
		HashMap<String, Integer> resMap= obj.countDuplicateWords("Hi welcome to Hi welcome to");
		System.out.println(resMap);
		
		String url=obj.selectEnv("dev");
		System.out.println(url);
		
		
	}
	
	@Override
	protected String selectEnv(String env) {
		// TODO Auto-generated method stub
		System.out.println("aasas");
		return super.selectEnv(env);
		
	}
	
	

}
