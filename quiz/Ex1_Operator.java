package kr.co.quiz;

import java.util.Scanner;

public class Ex1_Operator {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 이름을 입력하세요: ");
		String name = sc.nextLine();
		
		
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		int mat = sc.nextInt();
		
		System.out.print("과학 점수: ");
		int sci = sc.nextInt();
		
		int sum = kor+eng+mat+sci; //합계
		int avg = sum/4;  //평균
		System.out.println(name.equals("시키") ? "본인 입니다." : "본인이 아닙니다.");
		System.out.println("합계 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);
		// System.out.println("합계 점수 : " + (kor + eng + mat + sci));
		
		// System.out.println("평균 점수 : " + (kor + eng + mat + sci)/4);
		
		
		 
		// 1. 사용자 이름이 본인 이름이 맞는지 확인하고 
		//   맞다면"본인 입니다."
		//   틀린다면 " 본인이 아닙니다." 출력
		
		// 2. 국어, 영어, 수학, 과학의 합계 점수와 평균 접수를 출력하세요.
		
		
		
		
		
		
	}

}
