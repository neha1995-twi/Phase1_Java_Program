package com.simplilearn.oop_concep.encapsulation;

class Pen {
	private String refill = "Red";

	void write() {
		System.out.println("Writing using " + refill);
	}

	void setRefill(String r) {
		this.refill = r;
	}

	String getRefill() {
		return this.refill;
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {

		Pen p = new Pen();
		p.write();

		p.setRefill("Blue");
		p.write();
		
		System.out.println(p.getRefill());
	}

}
