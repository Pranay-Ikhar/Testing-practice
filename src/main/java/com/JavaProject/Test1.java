package com.JavaProject;

public class Test1 extends Text {
	int a;
	
	public Test1() {
		this.a=10;
		System.out.println("Default Constructor");
		
	}
	
	public Test1(int a) {
		
		System.out.println("'Integer' Parametric constructor");
		
	}
	
	public Test1(Double a) {
		
		System.out.println("'Double' Parametric Constructor");
	}
	
	public void overLoad() {
		
		System.out.println("Overide Method ");
	}
   public static void main(String args []) {
	 
   	}
	
}
