package com.simplilearn.access_specifier;



class A {
	
	private void display() {
		System.out.println("Display called");
	}
}



public class PrivateAccessSpecifierExample {

	public static void main(String[] args) {
			A a  = new A();
			//a.display();
			
	}

}
