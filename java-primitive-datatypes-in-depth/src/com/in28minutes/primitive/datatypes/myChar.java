package com.in28minutes.primitive.datatypes;

// ´ë¹®ÀÚ 65 ~ 90

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
	

	public void isNumber(char isNum) {
		if(this.ch == isNum) {
			for(char i = 48; i <= 57; ++i ) {
			System.out.println(true);	
			}	
		}
		
		else
		System.out.println(false);
	}


}
