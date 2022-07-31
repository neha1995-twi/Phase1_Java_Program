package com.simplilearn.innerclass;

interface AbstractClass {
	static String msg = "Hello";

	public void hello();
}

public class AnnonymousInnerClassExample {
	public static void main(String[] args) {
		AbstractClass outer = new AbstractClass() {
			@Override
			public void hello() {
				System.out.println("Hello Simplilearn!");
			}
		};
		outer.hello();
		System.out.println(AbstractClass.msg);
	}
}
