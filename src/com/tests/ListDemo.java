package com.tests;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
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
	

}
