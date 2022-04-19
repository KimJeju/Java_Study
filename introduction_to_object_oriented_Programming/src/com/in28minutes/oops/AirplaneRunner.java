package com.in28minutes.oops;

public class AirplaneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Airplane_test koreaAir = new Airplane_test();
		Airplane_test asiaAir = new Airplane_test();
		
		System.out.println(koreaAir.getPlane()); // 5
		System.out.println(asiaAir.getPlane()); // 10
		
		koreaAir.start();
		asiaAir.start();
		
		
		koreaAir.setPlane(12);
		 
		koreaAir.increace(5);
		asiaAir.decreace(0);
		
		System.out.println(koreaAir.getPlane()); // 17
		System.out.println(asiaAir.getPlane()); // 13
		
		
		
	}

}
