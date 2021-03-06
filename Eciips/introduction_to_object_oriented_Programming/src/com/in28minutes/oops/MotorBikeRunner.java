package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike(50);
		MotorBike anything = new MotorBike();


		System.out.println(ducati.getSpeed()); // 100
		
		System.out.println(honda.getSpeed()); // 200
		
		System.out.println(suzuki.getSpeed()); // 50
		
		System.out.println(anything.getSpeed()); //5

		
		ducati.start();
		honda.start();
		suzuki.start();
		
		
		ducati.setSpeed(70);
		//System.out.println(ducati.getSpeed());
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		suzuki.increaseSpeed(50);
		
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(0);
		suzuki.decreaseSpeed(30);
		
		
		//honda.setSpeed(80);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(suzuki.getSpeed());

	}

}
