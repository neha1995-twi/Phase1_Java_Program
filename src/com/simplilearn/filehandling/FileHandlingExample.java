package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		createFileFileWriter();
		createFileFileOutputStream();

		fileHandlingUsingNIO();

	}

	private static void fileHandlingUsingNIO() throws IOException {
		String data = "This is from NIO pacakge implementation!";
		Files.write(Paths.get("c://temp//simplilearn3.txt"), data.getBytes());

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		Files.write(Paths.get("c://temp//simplilearn4.txt"), list, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

	private static void createFileFileOutputStream() throws FileNotFoundException, IOException {
		String data = "Hello Simplilearn! This is FileOutputStream example!";
		FileOutputStream fos = new FileOutputStream("c://temp//simplilearn1.txt");
		fos.write(data.getBytes());
	}

	private static void createFileFileWriter() throws IOException {
		File file = new File("c://temp//simplilearn.txt");

		if (file.createNewFile()) {
			System.out.println("Created new file");
		} else {
			System.out.println("File already exist!");
		}

		FileWriter fw = new FileWriter(file);
		fw.write("Hello Simplilearn!");
		fw.close();
		
		//file.delete();
	}

}
