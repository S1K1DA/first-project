package kr.co.quiz;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		
		
		// Q1. �Է� ���� ���� 0 �Ǵ� 12 �̻��� ���
		// "���� �ʹ� ũ�ų� �۽��ϴ�."�� ��� �Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num==0 || num>=12) { 
		System.out.println("���� �ʹ� ũ�ų� �۽��ϴ�.");
			
			
			
		// Q2. �Է� ���� ���� ���� ������ ��� �Ͻÿ�.
//		1. ��ĳ�ʷ� ����ڷκ��� �� ������ �Է� ��������
//		2. �ش��ϴ� ������ ��� �޽����� �Ʒ��� �����ϴ�
//		      3, 4, 5 : ��
//		      6, 7, 8 : ����
//		      9, 10, 11 : ����
//		      12, 1, 2 : �ܿ�
//		�� �� : �ش��ϴ� ������ �����ϴ�
//		ex) 1 �� �Է� ���� ��� �ܿ� �� ���
//		3. ���� ���ø� Ȱ���Ͽ� OR ������ �Ǵ� AND �����ڸ� Ȱ���Ͽ� ������ Ǯ�����.
		
		System.out.println("���� �Է��ϼ���: ");
		int month = sc.nextInt();
			
		if(month==3 || month==4 || month==5 ) {
		System.out.println("������ ���Դϴ�.");
	    } else if(month==6 || month==7 || month==8) { 
		System.out.println("������ �����Դϴ�.");
	    } else if(month==9 || month==10 || month==11) {
		System.out.println("������ �����Դϴ�.");
	    } else if(month==12 || month==1 || month==2) {
		System.out.println("������ �ܿ��Դϴ�.");	
	    } else 
		System.out.println("�ش��ϴ� ������ �����ϴ�.");
	    }
		
		// Q3. ���̸� �Է��ϰ� ��¹ޱ�
		// ���̰� 18�� �̸��̸� "�̼�����" ���
		// ���̰� 18�� �̻� 65�� �̸��̸� "����" ���
		// �� �ܿ��� "����"�� ���
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if(age<18) {
		System.out.println("�̼�����");
		} else if(age>=18 && age<65) {
		System.out.println("����");
		} else {
		System.out.println("����");
		}


		// Q4. �Ʒ��� �ڵ带 �����Ͽ� ���� ���α׷��� �ۼ��ϼ���.
		// ex) ����ڰ� 1���� �Է��ϸ�  firstNumber�� secondNumber�� ���� ���� ����մϴ�.
		// ex) ����ڰ� 4���� �Է��ϸ� firstNumber�� secondNumber�� ���� ��(��)�� ����մϴ�.
		int firstNumber = 1000;
		int secondNumber = 20;
		      
		System.out.println("���� ���α׷�"); 
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
	    System.out.println("3. ���ϱ�");
	    System.out.println("4. ������(��)");
	    System.out.println("5. ������(������)");
	    
	    
	    System.out.println("���� �Է�: ");
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
