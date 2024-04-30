package kr.co.quiz;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		
		
		// Q1. 입력 받은 값이 0 또는 12 이상일 경우
		// "값이 너무 크거나 작습니다."를 출력 하시오.
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num==0 || num>=12) { 
		System.out.println("값이 너무 크거나 작습니다.");
			
			
			
		// Q2. 입력 받은 월에 따라 계절을 출력 하시오.
//		1. 스캐너로 사용자로부터 몇 월인지 입력 받으세요
//		2. 해당하는 계절과 출력 메시지는 아래와 같습니다
//		      3, 4, 5 : 봄
//		      6, 7, 8 : 여름
//		      9, 10, 11 : 가을
//		      12, 1, 2 : 겨울
//		그 외 : 해당하는 계절이 없습니다
//		ex) 1 을 입력 받을 경우 겨울 ” 출력
//		3. 위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요.
		
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
			
		if(month==3 || month==4 || month==5 ) {
		System.out.println("계절은 봄입니다.");
	    } else if(month==6 || month==7 || month==8) { 
		System.out.println("계절은 여름입니다.");
	    } else if(month==9 || month==10 || month==11) {
		System.out.println("계절은 가을입니다.");
	    } else if(month==12 || month==1 || month==2) {
		System.out.println("계절은 겨울입니다.");	
	    } else 
		System.out.println("해당하는 계절이 없습니다.");
	    }
		
		// Q3. 나이를 입력하고 출력받기
		// 나이가 18세 미만이면 "미성년자" 출력
		// 나이가 18세 이상 65세 미만이면 "성인" 출력
		// 그 외에는 "노인"을 출력
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age<18) {
		System.out.println("미성년자");
		} else if(age>=18 && age<65) {
		System.out.println("성인");
		} else {
		System.out.println("노인");
		}


		// Q4. 아래의 코드를 참고하여 계산기 프로그램을 작성하세요.
		// ex) 사용자가 1번을 입력하면  firstNumber와 secondNumber를 더한 값을 출력합니다.
		// ex) 사용자가 4번을 입력하면 firstNumber와 secondNumber를 나눈 값(몫)을 출력합니다.
		int firstNumber = 1000;
		int secondNumber = 20;
		      
		System.out.println("계산기 프로그램"); 
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
	    System.out.println("3. 곱하기");
	    System.out.println("4. 나누기(몫)");
	    System.out.println("5. 나누기(나머지)");
	    
	    
	    System.out.println("계산기 입력: ");
	    int userSelect = sc.nextInt();
	    
	    if(userSelect==1) {
	    	System.out.println(firstNumber+secondNumber);
	    }  else if(userSelect==2) {
	    	System.out.println(firstNumber-secondNumber);
	    }  else if(userSelect==3) {
	    	System.out.println(firstNumber*secondNumber);
	    }  else if(userSelect==4) {
	    	System.out.println(firstNumber/secondNumber);
	    }  else if(userSelect==5) {
	    	System.out.println(firstNumber%secondNumber);
	    }
	    

		
		
		
		
		
		
		
	}
}
