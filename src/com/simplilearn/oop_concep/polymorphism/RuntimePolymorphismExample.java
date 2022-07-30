package com.simplilearn.oop_concep.polymorphism;


class A {
	
	void test() {
		System.out.println("Parent class test method");
	}
}

class B extends A {
	
	void test() {
		System.out.println("Child class test method");
	}
}

abstract class Vehicle {
	
	abstract void drive();
	
	void petrol() {
		System.out.println("");
	}
}

class Baleno extends Vehicle{
	void drive() {
		System.out.println("Baleno - Child class");
	}
}




public class RuntimePolymorphismExample {

	public static void main(String[] args) {

		
		B b = new B();
		b.test();
		
		
		A a = new A();
		a.test();
		
		
		A a1 = new B();
		a1.test();
		
		
		//Vehicle v = new Vehicle();
		
		
		Vehicle v = new Baleno();
		v.drive();
		
	}
}