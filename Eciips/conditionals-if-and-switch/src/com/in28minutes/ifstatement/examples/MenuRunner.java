package com.in28minutes.ifstatement.examples;

//사용자 입력값을 받아 그에 맞는 함수를 호출해주는 러너

import java.util.Scanner;
                           // 스캐너는 자바 내장 클래스 이기 때문에 임포트를 해야한다.
public class MenuRunner {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("좆같다 씨발 무슨 욕할래?");
			
			String Sibal = scanner.nextLine();

			System.out.println(Sibal);
			

	}

}
