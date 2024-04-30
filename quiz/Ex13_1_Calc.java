package kr.co.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13_1_Calc {
	
    public static void method() throws NullPointerException {
    	throw new NullPointerException();
    }

	public static void main(String[] args) {
		
		try {
			// NullPointer ���ܸ� �ǵ������� �߻���Ű�ڴ�.
//			throw new NullPointerException();
			Ex13_1_Calc.method();
			
		} catch(NullPointerException e) {
			System.out.println("���� �߻�");
		}
		
		
		
		
		
		
		
		
		
		
		// ���� 2�� �Է¹�������.
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("����1 �Է� : ");
			int num1 = sc.nextInt();   // ���ܰ� �߻��� ���ɼ� �ִ� �ڵ�1
			
			System.out.print("����2 �Է� : ");
			int num2 = sc.nextInt();  // ���ܰ� �߻��� ���ɼ� �ִ� �ڵ�2
			
			
			// �Է¹��� �� ���� ������(/) �����ϴ� �ڵ� �ۼ�
			System.out.println(num1 / num2);   // ���ܰ� �߻��� ���ɼ� �ִ� �ڵ�3
			
			String str = null;
			System.out.println(str.length());
			
		} catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ���.");
		} catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch(NullPointerException e) {
			System.out.println("��ü�� ����ֽ��ϴ�.");
		} finally {
			sc.close();
		}
		
		
		// 1. InputMismatchException
		//   -> ����ڰ� �Է��� ���� int�� �ƴ�
		
		// 2. ArithmeticException
		//   -> 0���� ���� �� ����.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
