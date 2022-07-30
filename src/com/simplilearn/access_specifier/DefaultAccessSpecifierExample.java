package com.simplilearn.access_specifier;



class B {
	int a;
	
	void display() {
		System.out.println("Display of B");
	}
}



public class DefaultAccessSpecifierExample {

	
	protected void display() {
		System.out.println("Default of Main");
	}
	
	public static void main(String[] args) {

		int a = 5;
		
		
		B b  = new B();
		b.display();

	}

}
