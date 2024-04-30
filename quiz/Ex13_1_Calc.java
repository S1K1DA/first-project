package kr.co.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13_1_Calc {
	
    public static void method() throws NullPointerException {
    	throw new NullPointerException();
    }

	public static void main(String[] args) {
		
		try {
			// NullPointer 예외를 의도적으로 발생시키겠다.
//			throw new NullPointerException();
			Ex13_1_Calc.method();
			
		} catch(NullPointerException e) {
			System.out.println("예외 발생");
		}
		
		
		
		
		
		
		
		
		
		
		// 정수 2개 입력받으세요.
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자1 입력 : ");
			int num1 = sc.nextInt();   // 예외가 발생할 가능성 있는 코드1
			
			System.out.print("숫자2 입력 : ");
			int num2 = sc.nextInt();  // 예외가 발생할 가능성 있는 코드2
			
			
			// 입력받은 두 값을 나눗셈(/) 수행하는 코드 작성
			System.out.println(num1 / num2);   // 예외가 발생할 가능성 있는 코드3
			
			String str = null;
			System.out.println(str.length());
			
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요.");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch(NullPointerException e) {
			System.out.println("객체가 비어있습니다.");
		} finally {
			sc.close();
		}
		
		
		// 1. InputMismatchException
		//   -> 사용자가 입력한 값이 int가 아님
		
		// 2. ArithmeticException
		//   -> 0으로 나눌 수 없음.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
