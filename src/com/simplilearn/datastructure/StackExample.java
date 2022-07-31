package com.simplilearn.datastructure;

public class StackExample {
	int max = 1000;
	int top = -1;
	int[] arr = new int[1000];

	boolean isEmpty() {
		return (top < 0);
	}

	void push(int x) {
		if (top >= (max - 1)) {
			System.out.println("Stack overflow");
		} else {
			arr[++top] = x;
			System.out.println(x + " Pushed into stack");
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			arr[top] = 0;
			return arr[top--];
		}
	}

	void print() {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		StackExample stack = new StackExample();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
		System.out.println();
		System.out.println("Popped element : " + stack.pop());
		System.out.println("Popped element : " + stack.pop());
		System.out.println();
		stack.print();
	}

}
