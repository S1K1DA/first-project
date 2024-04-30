package kr.co.quiz;

import java.util.Scanner;

public class Ex12_3_Quiz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		
		System.out.print("국어 : ");
		int inputKor = sc.nextInt();
		
		System.out.print("영어 : ");
		int inputEng = sc.nextInt();
		
		System.out.print("수학 : ");
		int inputMat = sc.nextInt();
		
		System.out.print("과학 : ");
		int inputSci = sc.nextInt();
		
		
		// 이 부분 매개변수 5개 받는 생성자로 만들어서 사용
		Ex12_3_Student s = new Ex12_3_Student(inputName,inputKor,inputEng,inputMat,inputSci);
		
		
		s.getSum();
		
		int resultAvg = s.getAvg();
		
		s.getRank(resultAvg);
	}
	
	
	
}