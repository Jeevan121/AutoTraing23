package com.tests;

public class ArrayDemoV1 {
	
	public static void main(String[] args) {
		
		int[] a =new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		int[] a1= {1,2,4};
		
		ArrayDemoV1 obj = new ArrayDemoV1();
		obj.printArray(a1);
		
		String[] names = new String[5];
		names[0]="Ravi";
		names[1]="Ram";
		names[2]="John";
		names[3]="William";
		names[4]="Jacob";
		
		String[] names1= {"apple","mango"};
		
		obj.printArray(names1);
		
	}
	
	public void printArray() {
		
		int[] b= new int[100];
		
		for(int i=0;i<100;i++) {
			b[i]=i+1;
			System.out.println(b[i]);
		}
	}
	
	public void printArray(int[] arry) {
		
		System.out.println("array length::"+arry.length);
		
		for(int i=0;i<arry.length;i++) {
			arry[i]=i+1;
			System.out.println(arry[i]);
		}
	}
	
	public void printArray(String[] arry) {
		
		System.out.println("array length::"+arry.length);
		
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}
