package com.in28minutes.oops;

public class starbucsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		starbucks iceamericano = new starbucks();
		starbucks CafeLatte = new starbucks();
		starbucks ballinaLatte = new starbucks();
		
		
		System.out.println(iceamericano.getStarBucks());
		System.out.println(CafeLatte.getStarBucks());
		System.out.println(ballinaLatte.getStarBucks());
		
		iceamericano.start();

		
		iceamericano.increace(5);
		CafeLatte.increace(7);
		ballinaLatte.decreace(5);
		
		System.out.println("");
		System.out.println(iceamericano.getStarBucks());
		System.out.println(CafeLatte.getStarBucks());
		System.out.println(ballinaLatte.getStarBucks());
		
		
	
		
		

	}

}
