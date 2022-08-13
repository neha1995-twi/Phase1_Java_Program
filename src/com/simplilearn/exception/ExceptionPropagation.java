package com.simplilearn.exception;

import java.io.FileNotFoundException;

public class ExceptionPropagation {

	
	static void z() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	
	static void y() throws FileNotFoundException{
		z();
	}
	
	static void x() throws FileNotFoundException {
		y();
	}
	
	public static void main(String[] args) {
		try {
			x();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("INvoked..");
	}
}
