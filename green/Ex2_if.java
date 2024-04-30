package kr.co.green;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		int firstNumber = 100;
		int secondNumber = 200;
		
		// firstNumber가 secondNumber보다 작을때만 "작습니다." 출력
		if(firstNumber < secondNumber) {
			System.out.println("작습니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num > 10) {
			System.out.println("10보다 큽니다.");
		}
		
		// 10일때 "10입니다" 출력
		// 20일때 "20입니다" 출력
		// 30일때 "30입니다" 출력
		if(num == 10) { //10일 때
			System.out.println("10입니다.");
		} else if(num == 20) {  // 20일때
			System.out.println("20입니다.");
		} else if(num == 30) {  // 30일때
			System.out.println("30입니다.");
		} else {     // 그외 나머지 모든 경우일 때           
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		// 10~20일 때 "10~20입니다." 출력
	    // "num이 10보다 크거나 같다." 그리고 "num이 20보다 작거나 같다."
		if(num >= 10 && num <= 20) {
			System.out.println("10~20입니다.");
		} else if(num == 21 || num == 22) { //21 또는 22일때 "21 또는 22와 같습니다.
			System.out.println("21 또는 22와 같습니다.");
		} else {
			System.out.println("조건에 만족하는 숫자가 아닙니다.");
		}
		
		
		// 홀수, 짝수, 배수 구하기
		int number = 10;
		
		if(number%2 == 0) {
			System.out.println("짝수입니다.");
		} else if(number%2 == 1) {
			System.out.println("홀수입니다.");
		} 
		if(number%10 == 0) {   // 10의 배수
			System.out.println("10의 배수입니다.");
		}
		
	
		
		
		
		
		

	}

}
