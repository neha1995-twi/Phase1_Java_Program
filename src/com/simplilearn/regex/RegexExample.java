package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	// Validation rules:
	// @ - onetime - which should be in between
	// Before @ - any number of characters [a-z,A-Z,_,.-]
	// After @ - any number of characters
	
	public static void main(String[] args) {

		//String pattern = "^(.+)@(.+)$";
		String pattern = "geek";
		String input = "geeksforgeeksgeek";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);

		int counter = 0;
		while(m.find()) {
			counter++;
		}
		System.out.println(counter);
		// m.results().count;
		
		String regex1 = "";
		String input1 = "Hello, World123!";
		
		//System.out.println(input1.replaceAll(regex1, "#"));
		
		System.out.println(input1.indexOf(regex1));
		
		
 		
	}

}
