package kr.co.quiz;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		
		
//		Q1. ����ڷκ��� 1���� 7 ������ ���ڸ� �Է� �޾� 
//
//		�ָ�����,�������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		1. ��ĳ�ʷ� ����ڷκ��� ���ڸ� �Է� ��������
//		2. 1~5 �� �Է� ������ "�����Դϴ�" �� ����ϰ� , 6~7 �� �Է� ������ "�ָ��Դϴ�" �� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
			
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : case 2 : case 3 : case 4 : case 5 :
			System.out.println("�����Դϴ�.");
			break;
		case 6 : case 7 :
			System.out.println("�ָ��Դϴ�.");
			break;
		}
		
		
		
		
		
		
		

	}

}
