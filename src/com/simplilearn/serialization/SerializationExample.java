package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException {

		Demo d = new Demo(1, "Simplilearn");

		String fileName = "file.ser";

		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		oos.close();
		fos.close();

		System.out.println("Object has been serialized successfully!");
	}

}
