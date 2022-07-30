package com.simplilearn.access_specifier1;

import com.simplilearn.access_specifier.DefaultAccessSpecifierExample;

public class ProtectedAccess1 extends DefaultAccessSpecifierExample {

	public static void main(String[] args) {

		ProtectedAccess1 a = new ProtectedAccess1();

		// Display method won't be accesible, because parent class is in different
		// package and declared default access specifier method
		 a.display();
	}

}
