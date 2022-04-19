package com.in28minutes.primitive.datatypes;

public class BiNumber {

	private int Number1;
	private int Number2;
	
	public BiNumber(int Number1, int Number2) {
		// TODO Auto-generated constructor stub
		this.Number1 = Number1;
		this.Number2 = Number2;
	}
	
	
	
	
	public int getNumber1() {
		return Number1;
	}

	public void setNumber1(int number1) {
		Number1 = number1;
	}




	public int getNumber2() {
		return Number2;
	}


	public void setNumber2(int number2) {
		Number2 = number2;
	}

	public int add() {
		
		return Number1 + Number2;
	}

	
	public int Multiply() {
		return Number1 * Number2;
	}
	
	public void doubleValue() {
		this.Number1 *= 2;
		this.Number2 *= 2;
	}
	

}
