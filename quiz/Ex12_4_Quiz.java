package kr.co.quiz;

import java.util.Scanner;

public class Ex12_4_Quiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("力格 : ");
		String setTitle = sc.nextLine();
		
		System.out.print("郴侩 : ");
		String setContent = sc.nextLine();
		
		System.out.print("累己磊 : ");
		String setWriter = sc.nextLine();
		
		System.out.print("累己老 : ");
		String setIndate = sc.nextLine();
		
		
		
		
		Ex12_4_FreeBoard free = new Ex12_4_FreeBoard(setTitle, setContent, setWriter, setIndate);
		Ex12_4_NoticeBoard notice = new Ex12_4_NoticeBoard(setTitle, setContent, setWriter, setIndate);
//	free.insert();
//	free.edit();
//	free.delete();
		free.insert();
	
		

	}



	

}
