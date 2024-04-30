package kr.co.quiz;

import java.util.Random;
import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		
		// Q3. 로또번호 생성하는 프로그램
//		Random rd = new Random();
		
//		int lottoNumber = rd.nextInt(45) + 1;
//		System.out.println(lottoNumber);
		
//		[Q1.] 숫자 1 부터 , 사용자가 입력한 값만큼 숫자를 출력하는 프로그램을 작성하시오.
//		1. 스캐너로 사용자로부터 숫자를 입력 받으세요
//		2. 만약 , 사용자가 숫자 10 을 입력 한다면 , 1 부터 10 까지의 숫자를 출력하면 됩니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
		System.out.println();
//		[Q2] 짝수를 출력하는 프로그램을 작성하시오.
//		1. 범위는 1 부터 20 까지 입니다
//		2. 스캐너로 입력 받지 않아도 되며 , 1~20 사이의 짝수를 출력하면 됩니다.
		
		for(int j=1; j<=20; j++) {
			if(j%2 == 0) {
				System.out.print("짝수" + j + " ");
			}
		}
		
		System.out.println();
		System.out.println();

		
		//	    Q3. 로또번호 생성하는 프로그램
		Random rd = new Random();
			
		for(int z=0; z<6; z++) {
			int lottoNumber = rd.nextInt(45) + 1;
			System.out.print(lottoNumber + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//[Q4] 1부터 100까지의 숫자 중 3과 5의 공배수를 출력하세요.
		// -> 3과 5의 공통되는 배수
		
		for(int x=3; x<=100; x++) {
			if(x%3==0 && x%5==0) {
				System.out.println("3과 5의 배수는 : " + x);
			}
		}
		System.out.println();
//		[Q5] 팩토리얼의 값을 출력하세요.
		// -> 10팩토리얼: 1*2*3*4*5*6*7*8*9*10
		
		int factorial = 1;
		
		for(int i=1; i<=10; i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
