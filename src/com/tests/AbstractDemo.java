package com.tests;

public class AbstractDemo extends BaseTest2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am display method");
		
	}

	
	
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo();
		obj.display();
		
		BaseTest bs1 = new BaseTest();
		
		//BaseTest2  bs = new BaseTest2();
		
		BaseTest2 test = new AbstractDemo();//super class referance variablescan refers to the child class
		test.display();
	}



	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("i am in show mehtod");
		
	}



	

}
