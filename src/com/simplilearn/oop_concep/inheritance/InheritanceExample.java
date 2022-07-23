package com.simplilearn.oop_concep.inheritance;

class A {
	int a = 5;
	
	void test() {
		System.out.println("This is parent class");
	}
}

class B extends A {
	
}


public class InheritanceExample {

	public static void main(String[] args) {
		B b =new B();
		System.out.println(b.a);
		b.test();

	}

}
