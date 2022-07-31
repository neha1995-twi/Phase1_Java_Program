package com.simplilearn.innerclass;

public class StaticInnerClass {

	private static String msg = "Simplilearn!";

	static class Inner {
		void hello() {
			System.out.println("This is from member inner class " + msg);
		}
	}

	public static void main(String[] args) {
		StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
		obj.hello();
	}

}
