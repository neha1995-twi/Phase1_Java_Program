package com.simplilearn.oop_concep.inheritance;


class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	
	void bark() {
		System.out.println("Barking..");
	}
}


public class AnimalExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}