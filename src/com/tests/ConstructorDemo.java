package com.tests;

public class ConstructorDemo {
	
	int x,y;
	int a,b;
	public ConstructorDemo() {
		System.out.println("i am in constructor");
		int x=10;
		int y=20;
		System.out.println(x+y);
	}
	
	public ConstructorDemo(int x) {
		System.out.println(x);
	}
	public ConstructorDemo(int x,int y) {
		this.x=x;
		this.y=y;
		/*
		 * a=x; b=y;
		 */
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(60);
		ConstructorDemo obj2 = new ConstructorDemo(6,4);
		//System.out.println(x+y);
	}
	
	
}
