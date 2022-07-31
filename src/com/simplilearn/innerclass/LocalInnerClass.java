package com.simplilearn.innerclass;

public class LocalInnerClass {

	private String msg = "Simplilearn!";

	public void hello() {
		class Inner {
			void hello() {
				System.out.println("Hello world " + msg);
			}
		}

		Inner inner = new Inner();
		inner.hello();
	}

	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.hello();

	}

}
