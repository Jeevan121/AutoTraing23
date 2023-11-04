package com.tests;

import java.util.Iterator;

public class ArrayDemoV2 {
	
	public static void main(String[] args) {
		ArrayDemoV2 obj = new ArrayDemoV2();
		
		int[] a = {1,2,3,9,11};
		int[] b= {4,5,6,8,11};
		
		//obj.addArray1(a,b);
		
		BaseTest baseTest = new BaseTest();
		
		int[] res=baseTest.addArray1(a,b);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		int[] aa = new int[1000];
		for(int i=0;i<aa.length;i++) {
			aa[i]=i;
			System.out.println(aa[i]);
		}
		
	}
	
	public void addArray() {
		
		int[] a = {1,2,3};
		int[] b= {4,5,6};
		int[] result = new int[3];
		
		result[0] = a[0]+b[0];
		result[1] = a[1]+b[1];
		result[2] = a[2]+b[2];
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	public void addArray(int[] a,int[] b) {
	
		int[] result = new int[a.length];
		
		result[0] = a[0]+b[0];
		result[1] = a[1]+b[1];
		result[2] = a[2]+b[2];
		result[3] = a[3]+b[3];
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	public void addArray1(int[] a,int[] b) {
		
		int[] result = new int[a.length];
		
		for(int i=0;i<result.length;i++) {
			
			result[i]=a[i]+b[i];
			
			System.out.println(result[i]);
		}
	}

}
