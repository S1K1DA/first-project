package kr.co.quiz;

import java.util.Scanner;

public class Ex5_filed {
	public static void main(String[] arvgs) {														
		// 객체 생성
		Ex5_3_Buy buy = new Ex5_3_Buy();
		buy.buyMontior();
		
		buy.buyMouse();
		
		
		// 사용자로부터 숫자 1개를 입력받음 (double  ->  nextDouble())
		
		// Ex5_4_rating 객체 생성
		Ex5_4_rating rating = new Ex5_4_rating();
		System.out.println("평점 입력 : ");
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		// 생성된 객체의 getAvgRating 메서드를 호출 하면서, 입력받았던 값 전달
		// getAvgRating 메서드로부터 반환받은 평균 점수를 result 변수에 저장 후 출력
		double result = rating.getAvgRating(input);
		System.out.println("평균 점수 : " + result);

		sc.nextLine();
		
		// 사용자로부터 이름, 국어, 영어, 수학, 과학 점수를 입력 받아야 함
		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		
		System.out.print("국어 점수 : ");
		int inputKor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int inputEng = sc.nextInt();

		System.out.print("수학 점수 : ");
		int inputMat = sc.nextInt();

		System.out.print("과학 점수 : ");
		int inputSci = sc.nextInt();
		
		// Ex5_5_student의 객체 생성
		Ex5_5_student s = new Ex5_5_student();
		
		// 객체명.name = 입력받은이름;
		// 객체명.kor = 입력받은국어점수;
		s.name = inputName;
		s.kor = inputKor;
		s.eng = inputEng;
		s.mat = inputMat;
		s.sci = inputSci;
		
		// getSum 호출
		s.getSum();
		
		// getAvg 호출
		s.getAvg();
		
		// getRank 호출을 하는데, 나의 평균 점수를 전달 해줘야 함
		// 1. 지금 여기(Ex5_filed) 에서 평균 구하고 전달
		// 2. getAvg에서 리턴을 받아서 줘도 됨
		
		int sum = inputKor + inputEng + inputMat + inputSci;
		int avg = sum/4;
		s.getRank(avg);
	}
}




