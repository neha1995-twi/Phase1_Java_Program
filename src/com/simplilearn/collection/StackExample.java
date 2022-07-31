package com.simplilearn.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Dhruvik");
		stack.push("Niraj");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
