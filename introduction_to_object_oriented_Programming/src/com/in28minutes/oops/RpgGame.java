package com.in28minutes.oops;

public class RpgGame {

	private int RpgGame;
	
	
	RpgGame(int Power) { //�⺻�� ������ ���� ����ü
		if(Power <= 0) // �������� ���̳ʽ��� ���� �� �� 0���� ����
		this.RpgGame = 0;
		
		else
		this.RpgGame = Power;
	}
	
	
	RpgGame() { //���� �⺻��
		this(100);
	}
	
	public int getOffensePower() { // ���ݷ��� �������� ���� �޼���
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