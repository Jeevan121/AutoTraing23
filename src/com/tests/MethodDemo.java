package com.tests;

public class MethodDemo {
	
	//a+b
	int a=20,b=30;// global variables
	
	public static void main(String[] args) {
		
		System.out.println("i am in main method");
		MethodDemo obj = new MethodDemo();
		obj.add();
		obj.add(40, 10);
		
		  int sum=obj.add1(1, 2); 
		  System.out.println("sumin main method::"+sum); 
		  int result = sum -5; 
		  System.out.println("after minus ::"+result); 
		  String res=obj.displayName1("Jeevan", "Borale");
		  System.out.println("returned string::"+res);
		 
		obj.add();
		
	
	}
	
	public void add() {
		int a=10;
		int b=20; //local variables
		int res=a+b;
		System.out.println("addition of 2 numbers::"+res);
	}
	
	public void add(int a,int b) {
		int res = a+b;
		System.out.println("the sum of ::"+res);
	}
	
	public int add1(int a,int b) {
		int res = a+b;
		return res;
	}
	
	public void displayName(String fname,String lName) {
		String res = fname+" "+lName;
		System.out.println(res);
	}
	
	public String displayName1(String fname,String lName) {
		String res = fname+" "+lName;
		//System.out.println(res);
		return res;
	}
	
	

}
