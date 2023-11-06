package com.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemoV2 {
	
	public static void main(String[] args) {
		
		BaseTest baseTest = new BaseTest();
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(2);
		
		//lst.add("Jeevan");
		
		List resLst = baseTest.listDemo(lst);
		
		for(int i=0;i<resLst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		Set<Integer> st = new HashSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(1);
		st.add(3);
		st.add(2);
		
		System.out.println(st);
		Object[] a = st.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		Set<String> st1 = new HashSet<String>();
		st1.add("A");
		st1.add("A");
		st1.add("B");
		st1.add("C");
		
		System.out.println(st1);
		Object[] a1 = st1.toArray();
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
	}

}
