package kr.co.green;

import java.util.Scanner;

public class Ex3_dowhile {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 13;
		
		do {
			x++;
			System.out.println("실행" + x);
		} while(x < y);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("0을 입력해주세요: ");
//		int num = sc.nextInt();
//		
//		// num 변수에는 무조건 0이 들어와야 함
//		// 다른 숫자를 받으면 다시 입력을 받아야 함
//		while(num != 0) {
//			
//			System.out.println("다시 입력해주세요: ");
//			num = sc.nextInt();
//		}
		
		Scanner sc = new Scanner(System.in);
		int num; 
		do {
			System.out.println("0을 입력해주세요 : ");
			num = sc.nextInt();
		} while(num != 0);        // true가 나와야 반복! 그리고 최초 한번은 꼭 실행 flase나오면 끝!
		System.out.println("0을 입력하셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
