package com.in28minutes.oops;

public class RpgGame {

	private int RpgGame;
	
	
	RpgGame(int Power) { //기본값 설정을 위한 구조체
		if(Power <= 0) // 설정값이 마이너스로 설정 될 시 0으로 고정
		this.RpgGame = 0;
		
		else
		this.RpgGame = Power;
	}
	
	
	RpgGame() { //뉴비 기본값
		this(100);
	}
	
	public int getOffensePower() { // 공격력을 가져오기 위한 메서드
		return RpgGame;
	}
	
	public void setOffensePower(int Power) { // 
		this.RpgGame = Power;	
	}
	
	public void jobPower(int yourJob) { 
		this.RpgGame = this.RpgGame + yourJob;
	} 
	
	public void Attack(int myHp) {
		this.RpgGame = this.RpgGame - myHp;
	} 
	
	
	void start() {
		System.out.println("select Job");
	}
	
	
}
