package com.tests;

public class StaticInstanceDemo extends BaseTest{
	
	//static members
	static int b=20;
	public static void show() {
		System.out.println("i am show method");
	}
	//instance members
	int a =10;
	/*
	 * public void disp() { System.out.println("i am in disp method"); }
	 */
	
	static {
		System.out.println("i am in static block");
	}
	
	{
	 System.out.println("i am instance block");
	}
	
	public static void main(String[] args) {
		StaticInstanceDemo obj = new StaticInstanceDemo();
		int x=obj.a;
		System.out.println("instance ::"+x);
		obj.disp();
		
		int xx=StaticInstanceDemo.b;
		System.out.println("static ::"+xx);
		StaticInstanceDemo.show();
	}
	
	@Override
	public  void show121() {
		
	}

}
