package kr.co.quiz2;

import java.util.Scanner;

public class Ex1_4_MemberInfo {

	public static void main(String[] args) {
		
		Ex1_4_Login login = new Ex1_4_Login();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է��ϼ��� : ");
		String id1 = sc.nextLine();
		
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String pass1 = sc.nextLine();
		
		String result = login.Login(id1, pass1);
//		String id2 = "���̵� Ʋ�Ƚ��ϴ�.";
		System.out.println(result);
		

	}

}
