package com.java;

public class Prcatice01 {
	
    public static int a=67; // instance variable
    
    public void method() {
		// TODO Auto-generated method stub

    	a=200;
    	System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prcatice01 method = new Prcatice01();
		method=null;
		System.out.println(method.a);
		
		
		}

}
