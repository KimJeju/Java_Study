package com.in28minutes.primitive.datatypes;

// 대문자 65 ~ 90

public class myChar {

	private char ch;
	
	public myChar(char ch) {
		this.ch = ch;
	}
	
	
	public boolean isVowel() {
		// a e i o u or A E I O U
		if(ch == 'a' || ch == 'e' || ch == 'i' ||ch ==  'o' ||ch ==  'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		return true;
		
		else
		return false;
	}
	

	public boolean isNumber() {
			for(char i = 48; i <= 57; ++i ) {
				if(this.ch == i)
				return true;
			}	
		
			return false;
	}
	
	
	public boolean isAlphabet() {
		 for(char i = 65; i <= 90; ++i ) 
		 {
			if(this.ch == i + 32 || this.ch == i)
			return true; 
		 }
		 return false;
	}
	
	
	//대문자를 소문자로 변경
	public void printLowerCaseAlphabets() {
		for(char i = 65; i <= 90; ++i)
		{ 
			if(this.ch == i) {
				this.ch = (char)(this.ch + 32);
				System.out.println(ch);
				break;
			}
			
		}
	}
	
	
	//소문자 대문자로 변경
	public void printUpperCaseAlphabets() {
		for(char i = 97; i <= 122; ++i )
			if(this.ch == i) {
				this.ch = (char)(this.ch - 32);
				System.out.println(ch);
				break;
			}
	
	}


}
