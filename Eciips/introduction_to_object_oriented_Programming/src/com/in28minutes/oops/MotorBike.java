package com.in28minutes.oops;

public class MotorBike {

	//오토바이의 상태를 나타내는 함수 (state)
	private int speed; //멤버 변수 Speed
	
	MotorBike(int speed){ // 생성자 초기값 반환을 위한 함수
		this.speed = speed;
	}
	
	MotorBike(){
		this(5);
		//this.speed = 5; 
		//디폴트 생성
	};
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;	
	}

	public void increaseSpeed(int howMuch) { // 가속 메서드
		
		setSpeed(this.speed + howMuch);
	}
	
	
	//강의에 소스코드이지만 값을 0으로 만들려고 시도할 시 그대로 100이 되는 이슈 발생
	public void decreaseSpeed(int howMuch) { // 감속 메서드
		
		setSpeed(this.speed - howMuch);
	}
	
	
	
	void start() {
		System.out.println("Bike started");
	}
}
