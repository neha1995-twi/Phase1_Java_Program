package com.simplilearn.oop_concep;

public class Pen {

	String refill = "Red";

	public void write() {
		System.out.println("Writing using refil " + refill);
	}
	
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.write();
	}
}