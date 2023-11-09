package com.tests;

public class InterfaceDemo extends BaseTest implements TestInterface{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("i am in Interface demo class");
		
	}
	
	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.countDuplicateWords("Hi welcome Hi welcom");
		obj.show();
		TestInterface.show1();
		obj.display();
		
	}
	


}
