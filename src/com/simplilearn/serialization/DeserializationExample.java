package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Demo d = (Demo) ois.readObject();

		System.out.println("Object successfully deserialized");
		System.out.println(d.a1);
		System.out.println(d.b1);

	}

}
