package com.simplilearn.memory_management;

class A {
	void test() {
		System.out.println("A Test method invoked");
	}
}

class B {

	void test() {
		A a = new A();
		a.test();
	}
}

class C {
	int a ;
	
	void test() {
		
		B b = new B();
		b.test();
	}
}

public class MemoryManagementExample {

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
	}
}