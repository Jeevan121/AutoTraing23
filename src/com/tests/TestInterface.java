package com.tests;

public interface TestInterface {
	
	public void show();
	
	public static void show1() {
		System.out.println("i am in show1 method");
	}
	
	public default void display() {
		System.out.println("i am in display");
	}

}
