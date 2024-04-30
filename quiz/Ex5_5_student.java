package kr.co.quiz;

public class Ex5_5_student {																					
//	이름, 국어, 영어, 수학, 과학 점수를 인스턴스 변수로 생성(변수 선언)
	public String name;
//	public int kor, eng, mat, sci;
	public int kor;
	public int eng;
	public int mat;
	public int sci;
	
//	변수명 : name, kor, eng, mat, sci
	public final double STUDENT_A_AVG = 93.5;
	public final double STUDENT_B_AVG = 56.0;
	public final double STUDENT_C_AVG = 68.5;
	public final double STUDENT_D_AVG = 80.5;
	public final double STUDENT_E_AVG = 73.5;
	
//	성적의 합계를 구하는 getSum 메서드 생성
//	합계를 구한 후 "OOO님의 합계 점수는 OO점 입니다." 출력
	public void getSum() {
		int sum = kor+eng+mat+sci;
		System.out.println(name + "님의 합계 점수는 " + sum +"점 입니다.");
	}
	
//	성적의 평균을 구하는 getAvg 메서드 생성
//	평균을 구한 후 "OOO님의 평균 점수는 OO점 입니다." 출력
	public void getAvg() {
		int sum = kor+eng+mat+sci;
		int avg = sum/4;
		System.out.println(name + "님의 평균 점수는 " + avg + "점 입니다.");
	}
	
//	------------------------------- 위에꺼 먼저 다 하고
//	자신의 평균 점수가 몇등인지 확인할 수 있는 getRank 메서드 생성
//	자신의 평균 점수는 매개변수로 받음
//	int count = 1;
	
	public void getRank(int avg) {
		int count = 1; // 몇등인지
		double[] arr = {STUDENT_A_AVG, STUDENT_B_AVG, STUDENT_C_AVG,
						STUDENT_D_AVG, STUDENT_E_AVG};
		
		for(double item : arr) {
			// 1바퀴 : 70 < 93.5      // count = 2;
			// 2바퀴 : 70 < 56.0
			// 3바퀴 : 70 < 68.5
			// 4바퀴 : 70 < 80.5      // count = 3;
			// 5바퀴 : 70 < 73.5      // count = 4;
			if(avg < item) {
				count++;
			}
		}
		
		System.out.println("등수 : " + count + "등");
	}
	
//	93.5 / 56.0 / 68.5 / 80.5 / 73.5
//	내 평균 점수 : 70
//	힌트 : STUDENT_A_AVG ~ STUDENT_E_AVG 얘네를 배열에 담음
//		  배열의 길이만큼 반복을 하는데, 조건을 줘야함
//	      조건 : 내가 전달받은 평균 점수 < 배열의 요소
//	            count 값 증가
	
}