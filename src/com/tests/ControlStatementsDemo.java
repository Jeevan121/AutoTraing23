package com.tests;

public class ControlStatementsDemo {
	
	public static void main(String[] args) {
		
		int a=10;
		
		if(a==100) {
			System.out.println("i am in if block");
		}else {
			System.out.println("else block");
		}
		
		String data="dubai12312";
		if(data.equals("dubai")) {
			System.out.println("i am in dubai");
		}else {
			System.out.println("sharajha");
		}
		
		String env="dev";
		
		if(env.equals("dev")) {
			System.out.println("i am in cmcm dev env");
		}else if(env.equals("qa")) {
			System.out.println("i am in cmcm qa env");
		}else if(env.equals("prod")) {
			System.out.println("i am in prod env");
		}else {
			System.out.println("i am in  UAT");
		}
		
	}
	
	

}
