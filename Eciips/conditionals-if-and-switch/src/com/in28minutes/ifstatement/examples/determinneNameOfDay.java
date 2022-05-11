package com.in28minutes.ifstatement.examples;

public class determinneNameOfDay {

	public static void main(String[] args) {

		System.out.println(determinneNameOfday(1));

	}

	public static String determinneNameOfday(int Day) {

		switch (Day) {
		case 0:
			return "Monday";
		case 1:
			return "Monday";
		case 2:
			return "Wednesday";
			
		case 3:
			return"thursday";
			
		case 4:
			return "Friday";
			
		case 5:
			return "Saturday";
			
		case 6:
			return "Sunday";	
		}

		return "Result";

	}

}
