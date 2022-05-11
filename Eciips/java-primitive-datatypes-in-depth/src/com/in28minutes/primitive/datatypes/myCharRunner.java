package com.in28minutes.primitive.datatypes;

public class myCharRunner {

	public static void main(String[] args) {
		
	  myChar myChar = new myChar('c');
	  System.out.println(myChar.isVowel());
	  
	  
	  // myChar에서 받은 레터럴값이 숫자인지 알파벳인지 boolean 값으로 출력
	  System.out.println(myChar.isNumber());
	  System.out.println(myChar.isAlphabet());
	  
	  // 반환되는 레터럴값이 소문자거나 대문자일 경우 엮으로 바꿔주고 출력
	  System.out.println("");
	  myChar.printLowerCaseAlphabets();
	  myChar.printUpperCaseAlphabets();
	}

}
