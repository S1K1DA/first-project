package kr.co.quiz;

import java.util.Random;
import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		
		// Q3. �ζǹ�ȣ �����ϴ� ���α׷�
//		Random rd = new Random();
		
//		int lottoNumber = rd.nextInt(45) + 1;
//		System.out.println(lottoNumber);
		
//		[Q1.] ���� 1 ���� , ����ڰ� �Է��� ����ŭ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		1. ��ĳ�ʷ� ����ڷκ��� ���ڸ� �Է� ��������
//		2. ���� , ����ڰ� ���� 10 �� �Է� �Ѵٸ� , 1 ���� 10 ������ ���ڸ� ����ϸ� �˴ϴ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
		System.out.println();
//		[Q2] ¦���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		1. ������ 1 ���� 20 ���� �Դϴ�
//		2. ��ĳ�ʷ� �Է� ���� �ʾƵ� �Ǹ� , 1~20 ������ ¦���� ����ϸ� �˴ϴ�.
		
		for(int j=1; j<=20; j++) {
			if(j%2 == 0) {
				System.out.print("¦��" + j + " ");
			}
		}
		
		System.out.println();
		System.out.println();

		
		//	    Q3. �ζǹ�ȣ �����ϴ� ���α׷�
		Random rd = new Random();
			
		for(int z=0; z<6; z++) {
			int lottoNumber = rd.nextInt(45) + 1;
			System.out.print(lottoNumber + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//[Q4] 1���� 100������ ���� �� 3�� 5�� ������� ����ϼ���.
		// -> 3�� 5�� ����Ǵ� ���
		
		for(int x=3; x<=100; x++) {
			if(x%3==0 && x%5==0) {
				System.out.println("3�� 5�� ����� : " + x);
			}
		}
		System.out.println();
//		[Q5] ���丮���� ���� ����ϼ���.
		// -> 10���丮��: 1*2*3*4*5*6*7*8*9*10
		
		int factorial = 1;
		
		for(int i=1; i<=10; i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
