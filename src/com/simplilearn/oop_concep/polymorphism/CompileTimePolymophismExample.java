package com.simplilearn.oop_concep.polymorphism;


class Calcuator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
}


public class CompileTimePolymophismExample {

	public static void main(String[] args) {
		Calcuator c = new Calcuator();
		int res = c.add(1, 2);
		System.out.println(res);
		
		int res1 =  c.add(1, 2, 3);
		System.out.println(res1);
	}

}
