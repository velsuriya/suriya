package com.java;

public class Method2 extends Method1 {
	
	@Override
	public void savings() {
     System.out.println("3");
     super.savings();

	}
	
	@Override
	public void deposite() {
    System.out.println("6");
	super.deposite();
	}
	
	public static void main(String[] args) {
		
		Method2 a = new Method2();
		a.savings();
		a.deposite();
		
		
		
	}
	
	
	

}
