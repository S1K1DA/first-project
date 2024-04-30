package kr.co.quiz2;

import java.util.Scanner;

public class Ex1_4_MemberInfo {

	public static void main(String[] args) {
		
		Ex1_4_Login login = new Ex1_4_Login();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String id1 = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요 : ");
		String pass1 = sc.nextLine();
		
		String result = login.Login(id1, pass1);
//		String id2 = "아이디가 틀렸습니다.";
		System.out.println(result);
		

	}

}
