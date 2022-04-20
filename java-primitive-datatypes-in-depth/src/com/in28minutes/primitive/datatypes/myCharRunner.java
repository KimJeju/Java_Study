package com.in28minutes.primitive.datatypes;

public class myCharRunner {

	public static void main(String[] args) {
	  myChar myChar = new myChar('c');
	  System.out.println(myChar.isVowel());
	  
	  System.out.println(myChar.isNumber());
	  System.out.println(myChar.isAlphabet());
	  
	  
	  System.out.println("");
	  //myChar.printLowerCaseAlphabets();
	  myChar.printUpperCaseAlphabets();
	}

}
