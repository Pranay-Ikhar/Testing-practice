package com.JavaProject;

public class Text {
	
	public void overLoad(String a) {
		
		System.out.println(a);
		
	} 
	public void overLoad(int a) {
		
		System.out.println(a);
		
	}
	public void overLoad() {
		
		System.out.println("Without Prameter");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Text t=new Text();
			Test1 t1= new Test1(24.45);
			Test1 t1a= new Test1(100);
			Test1 t1b = new Test1();
			Test2 t2=new Test2();
			t.overLoad();
			t1.overLoad();
			t.overLoad(20);
			t.overLoad("Hexaware");
			t1.overLoad(20);
			t2.overLoad();
			t2.hier();
	}

	
}
  