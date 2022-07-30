package com.simplilearn.memory_management;



class A1 {
	int a = 5;
}


class Calculator {

	// Java supports copy by Value . meaning, when you pass any agrument in method,
	// it will be copied to method parameters
	int add(int a, int b) {
		b=10;
		return a + b;
	}
	
	
	void test(A1 a1) {
		a1.a = 10;
	}
}

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int a= 5;
		int b = 5;
		
		int res = c.add(a,b);
		System.out.println(res);
		System.out.println(b);
	
	
		A1 a1 = new A1();
		
		System.out.println(a1.a);
		c.test(a1);
		System.out.println(a1.a);
		
	
	}

}
