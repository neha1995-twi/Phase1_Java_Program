package com.simplilearn.exception;

public class CustomExceptionExample {

	public static void validteAge(int age) throws InvalidAgeException{
		
		if(age <18) {
			throw new InvalidAgeException();
		}
		
		System.out.println("Adult");
	}
	
	public static void main(String[] args) {
	
		try {
			validteAge(13);
		} catch (InvalidAgeException e) {
			System.out.println("You are not allowed to vote, age is less than 18!!");
			e.printStackTrace();
		}
		
		System.out.println("Main completed");

	}

}
