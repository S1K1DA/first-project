package kr.co.green;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {                                                        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복할 횟수를 입력하세요: ");
		int num = sc.nextInt();

		
		for(int i=1; i<=num; i++) {
			System.out.println("현재 숫자는 " + i + " 입니다.");                                                 
			
			if(i >= 2) {
				System.out.println("i가 2이상 입니다.");
			}
		}
		
		// i가 10부터 시작
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 까지 출력
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		sc.nextLine();
		
		System.out.println("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println("현재 반복 횟수의 " + i + " 입니다.");
		}
		
		
		for(int i=0; i<2; i++) {
			System.out.println("i : " + i);
			
			System.out.println("안에 있는 for문 시작됨");
			
			for(int j=10; j<15; j++) {
				System.out.println("j는 : " + j);
			}
			
			System.out.println("안에 있는 for문 종료됨");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                                                             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


























