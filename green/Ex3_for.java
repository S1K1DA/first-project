package kr.co.green;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {                                                        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ��� Ƚ���� �Է��ϼ���: ");
		int num = sc.nextInt();

		
		for(int i=1; i<=num; i++) {
			System.out.println("���� ���ڴ� " + i + " �Դϴ�.");                                                 
			
			if(i >= 2) {
				System.out.println("i�� 2�̻� �Դϴ�.");
			}
		}
		
		// i�� 10���� ����
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 ���� ���
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		sc.nextLine();
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println("���� �ݺ� Ƚ���� " + i + " �Դϴ�.");
		}
		
		
		for(int i=0; i<2; i++) {
			System.out.println("i : " + i);
			
			System.out.println("�ȿ� �ִ� for�� ���۵�");
			
			for(int j=10; j<15; j++) {
				System.out.println("j�� : " + j);
			}
			
			System.out.println("�ȿ� �ִ� for�� �����");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                                                             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


























