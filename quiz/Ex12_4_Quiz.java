package kr.co.quiz;

import java.util.Scanner;

public class Ex12_4_Quiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		String setTitle = sc.nextLine();
		
		System.out.print("���� : ");
		String setContent = sc.nextLine();
		
		System.out.print("�ۼ��� : ");
		String setWriter = sc.nextLine();
		
		System.out.print("�ۼ��� : ");
		String setIndate = sc.nextLine();
		
		
		
		
		Ex12_4_FreeBoard free = new Ex12_4_FreeBoard(setTitle, setContent, setWriter, setIndate);
		Ex12_4_NoticeBoard notice = new Ex12_4_NoticeBoard(setTitle, setContent, setWriter, setIndate);
//	free.insert();
//	free.edit();
//	free.delete();
		free.insert();
	
		

	}



	

}
