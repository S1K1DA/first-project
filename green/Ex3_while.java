package kr.co.green;

import java.util.Scanner;

public class Ex3_while {

	public static void main(String[] args) {

		// cnt(����) : count 
		int cnt = 0;  
		
		while(cnt < 10) {
			System.out.println("cnt : " + cnt);
			cnt++;    
		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println("i : " + i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0�� �Է����ּ���: ");
		int num = sc.nextInt();
		
		// num �������� ������ 0�� ���;� ��
		// �ٸ� ���ڸ� ������ �ٽ� �Է��� �޾ƾ� ��
		while(num != 0) {
			
			System.out.println("�ٽ� �Է����ּ���: ");
			num = sc.nextInt();
		}
		
		// 1~100 ���̿��� ¦�� ���ϱ�
		int count = 1;
		while(count <= 100) {	
		if(count%2 == 0) {
		System.out.println("¦��" + count);
			}		
		count++;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
