package com.in28minutes.oops;

public class RpgGameRunner {

	public static void main(String[] args) {
		
		RpgGame knight = new RpgGame();
		RpgGame wizard = new RpgGame();
		RpgGame archer = new RpgGame();
		
		
		System.out.println("basic");
		System.out.println(knight.getOffensePower());
		System.out.println(wizard.getOffensePower());
		System.out.println(archer.getOffensePower());
				
		knight.start();
		wizard.start();
		archer.start();
		
		System.out.println("");
		knight.setOffensePower(120);
		wizard.setOffensePower(100);
		archer.setOffensePower(80);
		
		System.out.println("");
		System.out.println(knight.getOffensePower());
		System.out.println(wizard.getOffensePower());
		System.out.println(archer.getOffensePower());
		
		
		knight.jobPower(20);
		wizard.jobPower(10);
		archer.jobPower(10);
		
		System.out.println("");
		System.out.println(knight.getOffensePower());
		System.out.println(wizard.getOffensePower());
		System.out.println(archer.getOffensePower());
		
		knight.Attack(10);
		knight.Attack(30);
		archer.Attack(20);
		
		System.out.println("");
		System.out.println(knight.getOffensePower());
		System.out.println(wizard.getOffensePower());
		System.out.println(archer.getOffensePower());

	}

}
