package com.tests;

import java.util.ArrayList;
import java.util.List;

public class ListDemoV1 {
	
	public static void main(String[] args) {
		ListDemoV1 lst = new ListDemoV1();
		lst.listDemo();
		
		ArrayList<Integer> arrLst = new ArrayList<>();
		arrLst.add(100);
		arrLst.add(200);
		arrLst.add(300);
		lst.listDemo(arrLst);
		
		if(arrLst.contains(300)) {
			System.out.println("found value in the list");
		}else {
			System.out.println(" not found value in the list");
		}
		
		
	}
	
	public void listDemo() {

		ArrayList<Integer> lst =  new ArrayList<Integer>();
		lst.add(11);
		lst.add(22);
		lst.add(33);
		
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		lst.remove(0);
		//System.out.println(lst);
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
	
	public void listDemo(List lst1) {


		
		for(int i=0;i<lst1.size();i++) {
			System.out.println(lst1.get(i));
		}
		
		lst1.remove(0);
		//System.out.println(lst);
		
		for(int i=0;i<lst1.size();i++) {
			System.out.println(lst1.get(i));
		}
	}

}
