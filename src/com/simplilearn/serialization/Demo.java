package com.simplilearn.serialization;

import java.io.Serializable;

public class Demo implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	public int a1;
	public String b1;

	public Demo(int a, String b) {
		this.a1 = a;
		this.b1 = b;
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	
	
}
