package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
			
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
		BigDecimal totalValue = calculator.calculatorTotalVelue(5);
		
		System.out.println(totalValue);
	}

}
