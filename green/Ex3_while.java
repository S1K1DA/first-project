package kr.co.green;

import java.util.Scanner;

public class Ex3_while {

	public static void main(String[] args) {

		// cnt(변수) : count 
		int cnt = 0;  
		
		while(cnt < 10) {
			System.out.println("cnt : " + cnt);
			cnt++;    
		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println("i : " + i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0을 입력해주세요: ");
		int num = sc.nextInt();
		
		// num 변수에는 무조건 0이 들어와야 함
		// 다른 숫자를 받으면 다시 입력을 받아야 함
		while(num != 0) {
			
			System.out.println("다시 입력해주세요: ");
			num = sc.nextInt();
		}
		
		// 1~100 사이에서 짝수 구하기
		int count = 1;
		while(count <= 100) {	
		if(count%2 == 0) {
		System.out.println("짝수" + count);
			}		
		count++;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
