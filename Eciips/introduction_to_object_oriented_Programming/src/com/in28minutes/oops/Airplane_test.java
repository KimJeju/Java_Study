package com.in28minutes.oops;

public class Airplane_test {

	private int plane;

	Airplane_test(int plane) {
		if(plane > 0)
		this.plane = 0;
		
		else
		this.plane = plane;
	}
	
	Airplane_test() {
		this(1);
	}

	public int getPlane() {
		return plane;
	}

	public void setPlane(int plane) {
		if(plane > 0)
		this.plane = plane;
		
		
	}
	
	public void increace(int howManyPeople) {
		this.plane = this.plane + howManyPeople;
	}
	
	public void decreace(int howMany) {
		this.plane = this.plane - howMany;

	}
	
	
	
	
	void start() {
		System.out.println("airplane Start");
	}
	
	//test
	
	
}
