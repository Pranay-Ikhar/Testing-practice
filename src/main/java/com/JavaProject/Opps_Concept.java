package com.JavaProject;

public class Opps_Concept {
	public Opps_Concept()
	{
		System.out.println("This is the First/ Default Constructer");
		
	}

	public Opps_Concept(int a) {
		System.out.println("This is a parametric constructor");
	}
	public static void name() {
		System.out.println("Static method Executes first");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opps_Concept.name();
		System.out.println("this is the main method ");
		Opps_Concept oc =new Opps_Concept(20);
		Opps_Concept oc1 =new Opps_Concept();
	

	}
}



