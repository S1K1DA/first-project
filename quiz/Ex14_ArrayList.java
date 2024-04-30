package kr.co.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14_ArrayList {
                                                        // 풀이 받아서 이해 해보김눰;ㄴ;ㄴ
	public static void main(String[] args) {
//		1. 프로그램은 사용자로부터 아래와 같은 메뉴를 입력받아 제공함
//		 1. 학생 추가
//		 2. 학생 목록 출력
//		 3. 종료
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dataList  = new ArrayList<>();
		
		
//		int a = sc.nextInt();
		
		
		
		while(true) {
			System.out.println("1.학생 추가");
			System.out.println("2.학생 목록 출력");
			System.out.println("3.종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("학생 이름 :");
				String name = sc.nextLine();
				dataList.add(name);
				break;
			case 2 :
				System.out.println(dataList);
				break;	
			case 3 :
				System.out.println("종료");
				break;	
				default:
		
			}
		
		
		
		
		
		
		
		
		

	}

	}}
