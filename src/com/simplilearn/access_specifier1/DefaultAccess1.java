package com.simplilearn.access_specifier1;

import com.simplilearn.access_specifier.DefaultAccessSpecifierExample;

public class DefaultAccess1 {

	public static void main(String[] args) {

		// B b = new B();

		DefaultAccessSpecifierExample e = new DefaultAccessSpecifierExample();
		// Compilation issue - Display method has only package level access
		//e.display();

	}

}
