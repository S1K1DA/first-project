package kr.co.quiz;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		
		
//		Q1. 사용자로부터 1부터 7 사이의 숫자를 입력 받아 
//
//		주말인지,평일인지 출력하는 프로그램을 작성하시오.
//
//		1. 스캐너로 사용자로부터 숫자를 입력 받으세요
//		2. 1~5 를 입력 받으면 "평일입니다" 를 출력하고 , 6~7 을 입력 받으면 "주말입니다" 를 출력하시오.
		Scanner sc = new Scanner(System.in);
			
		System.out.println("숫자를 입력하시오 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : case 2 : case 3 : case 4 : case 5 :
			System.out.println("평일입니다.");
			break;
		case 6 : case 7 :
			System.out.println("주말입니다.");
			break;
		}
		
		
		
		
		
		
		

	}

}
