package kr.co.green;

import java.util.Scanner;

public class Ex3_dowhile {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 13;
		
		do {
			x++;
			System.out.println("����" + x);
		} while(x < y);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("0�� �Է����ּ���: ");
//		int num = sc.nextInt();
//		
//		// num �������� ������ 0�� ���;� ��
//		// �ٸ� ���ڸ� ������ �ٽ� �Է��� �޾ƾ� ��
//		while(num != 0) {
//			
//			System.out.println("�ٽ� �Է����ּ���: ");
//			num = sc.nextInt();
//		}
		
		Scanner sc = new Scanner(System.in);
		int num; 
		do {
			System.out.println("0�� �Է����ּ��� : ");
			num = sc.nextInt();
		} while(num != 0);        // true�� ���;� �ݺ�! �׸��� ���� �ѹ��� �� ���� flase������ ��!
		System.out.println("0�� �Է��ϼ̽��ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
