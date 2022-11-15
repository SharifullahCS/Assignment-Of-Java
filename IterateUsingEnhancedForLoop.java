package AdvancedJava;

//Java Program to demonstrate iterate
//an iterable using for-each loop

import java.io.*;
import java.util.*;

class IterateUsingEnhancedForLoop {
	public static void main (String[] args) {
		
	// create a list
	ArrayList<String> list = new ArrayList<String>();

	// add elements
	list.add("Amin");
	list.add("Rohith");
	list.add("Imarat");

	// Iterate through the list
	for( String element : list ){
		System.out.println( element );
	}
	}
}

//public class IterateUsingEnhancedForLoop {

//}
