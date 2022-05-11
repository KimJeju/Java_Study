package loops;

import java.util.Scanner;

public class NavigateNumberRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 사용자에게 입력받을 받기위해 scanner 클래스 호출
		int Number = -1;

		do {
			if (Number != -1) {
				System.out.println("Cube is " + (Number * Number * Number));
			}
			System.out.print("Enter the Number : ");
			// 정수값을 받아오고 세제곱으로 반환
			Number = scanner.nextInt();
		} while (Number >= 0);
		System.out.println("Thank you Have Fun");

	}

}
