package com.in28minutes.ifstatement.examples;

//사용자 입력값을 받아 그에 맞는 함수를 호출해주는 러너

import java.util.Scanner;  // 컨트롤 + 1 을 눌러 임포트 할 수 있다. 
                           // 스캐너는 자바 내장 클래스 이기 때문에 임포트를 해야한다.
public class MenuRunner {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in); //인스턴트 객체 선언 
		
		System.out.println("Enter Number1 : ");
		int Number1 = scanner.nextInt();  //사용자 입력값을 받아준다.
		
		System.out.println("The Number you Entered is = " + Number1); // 문자열 뒤에 + 를 붙여주면 정수를 붙여서 출력해준다.

	}

}
