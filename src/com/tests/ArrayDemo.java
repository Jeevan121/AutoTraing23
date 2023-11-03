package com.tests;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] a =new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		System.out.println("1 step ::"+a[1]);
		a[1]=222;
		System.out.println("2 step ::"+a[1]);
	}

}
