package kr.co.quiz;

import java.util.Scanner;

public class Ex1_Operator {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		
		System.out.print("���� ����: ");
		int kor = sc.nextInt();
		
		System.out.print("���� ����: ");
		int eng = sc.nextInt();
		
		System.out.print("���� ����: ");
		int mat = sc.nextInt();
		
		System.out.print("���� ����: ");
		int sci = sc.nextInt();
		
		int sum = kor+eng+mat+sci; //�հ�
		int avg = sum/4;  //���
		System.out.println(name.equals("��Ű") ? "���� �Դϴ�." : "������ �ƴմϴ�.");
		System.out.println("�հ� ���� : " + sum);
		System.out.println("��� ���� : " + avg);
		// System.out.println("�հ� ���� : " + (kor + eng + mat + sci));
		
		// System.out.println("��� ���� : " + (kor + eng + mat + sci)/4);
		
		
		 
		// 1. ����� �̸��� ���� �̸��� �´��� Ȯ���ϰ� 
		//   �´ٸ�"���� �Դϴ�."
		//   Ʋ���ٸ� " ������ �ƴմϴ�." ���
		
		// 2. ����, ����, ����, ������ �հ� ������ ��� ������ ����ϼ���.
		
		
		
		
		
		
	}

}
