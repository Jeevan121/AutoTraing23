package com.tests;

public class FinalDemo extends BaseTest{
	
	public static void main(String[] args) {
		
		final int a=10;
		System.out.println(a);
		//a=20;
		//System.out.println(a);
		FinalDemo obj = new FinalDemo();
		obj.disp();
	}
	
	@Override
	protected String selectEnv(String env) {
		// TODO Auto-generated method stub
		System.out.println("aasas");
		return super.selectEnv(env);
		
	}
	
	/*
	 * @Override public void disp() { // TODO Auto-generated method stub
	 * System.out.println("aasas"); return super.disp();
	 * 
	 * }
	 */
	
	
	

}
