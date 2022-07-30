package com.simplilearn.constructor;

class EmpInfo {
	int id;
	String name;

	EmpInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public EmpInfo() {

	}

}

// java.lang.Object

class A {

	public A(int id) {
		System.out.println("A constructor called");
	}
	
	A() {
		
	}
}

class B extends A {

	public B() {
		System.out.println("B constructor called");
	}
}

public class ConstructorExample {

	public static void main(String[] args) {

		B b  = new B();
		
	}

}
