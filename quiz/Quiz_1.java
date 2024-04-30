package kr.co.quiz;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Quiz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[Q1] 아래의 조건에 만족하는 변수를 선언하세요.
//		1. 논리형을 넣을 varFalse 변수를 선언하세요.
//		   -> 위에서 선언한 변수를 false로 초기화 하세요.
//		2. 문자형을 넣을 varChar 변수를 선언하세요.
//		   -> 위에서 선언한 변수를 'Q'로 초기화 하세요.
//		3. 정수형 숫자를 넣을 varNum 변수를 선언하세요.
//		   -> 위에서 선언한 변수를 10으로 초기화 하세요.
//		4. 문자열을 넣을 varStr 변수를 선언 및 초기화를 동시에 하세요.
//		   -> 값은 "Java"가 들어갑니다.
		
		boolean varFalse;
		varFalse = false;
		
		char varChar;
		varChar = 'Q';
		
		int varNum;
		varNum = 10;
		
		String varStr = "Java";
		
//		[Q2] 두개의 정수 변수 a와 b를 선언하고, 각각 5와 3의 값을 할당하세요
//		1. a와 b의 합을 구하고 결과를 출력
//		2. a와 b의 차이를 구하고 결과를 출력
//		3. a와 b의 곱을 구하고 결과를 출력
//		4. a를 b로 나눈 결과를 출력
//		5. a를 b로 나눈 나머지를 출력
		
		int a = 5;
		int b = 3;
		System.out.println("a와b 합 : " + (a+b));
		System.out.println("a와b 차리 : " + (a-b));
		System.out.println("a와b 곱 : " + (a*b));
		System.out.println("a와b 나눈 결과 : " + (a/b));
		System.out.println("a와b 나눈 나머지 : " + (a%b));
		
		
		System.out.println();
		
//		Q3. 두개의 문자열을 이어 붙이세요.
//		1. 변수 strFirst 에 문자열 "Hello, " 를 할당
//		2. 변수 strSecond 에 문자열 "World!"를 할당
//		3. 두개의 문자열을 이어 붙여 출력
		
		String strFirst = "Hello";
		String strSecond = " World!";
		System.out.println(strFirst+strSecond);
		
		
		System.out.println();
		
		//-----------------------------------------------------
		
//		[Q1] 1부터 100까지의 숫자 중에서 3의 배수인 숫자만 출력하는 자바 프로그램을 작성
//		1. for 문을 사용하여 1부터 100까지의 숫자를 반복 실행
//		2. if 문을 사용하여 각 숫자가 3의 배수인지를 확인     
//		3. 3의 배수인 경우 해당 숫자를 출력
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				System.out.print("3배수 : "+i);
				System.out.println();
			}
		}
		
//		[Q2] 사용자로부터 국어, 영어, 수학, 과학 성적을 입력받고 아래 기준에 따라 출력하는 프로그램을 작성
//		1. 90점 이상 : OO의 성적은 A 입니다.
//		2. 80점 이상 : OO의 성적은 B 입니다.
//		3. 70점 이상 : OO의 성적은 C 입니다.
//		4. 60점 이상 : OO의 성적은 D 입니다.
//		5. 50점 이상 : OO의 성적은 E 입니다. 
//		6. 50점 미만 : OO의 성적은 F 입니다.
//		ex) 영어의 성적은 A 입니다.  /  과학의 성적은 E 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();
		
		System.out.print("과학 점수를 입력하세요 : ");
		int sci = sc.nextInt();
		
		
		int kems = (kor+eng+mat+sci)/5;
		
		if(kems>= 90 ) {
			System.out.println("평균 점수는 A입니다.");
		} else if(kems>=80) {
			System.out.println("평균 점수는 B입니다.");
		} else if(kems>=70) {
			System.out.println("평균 점수는 C입니다.");
		} else if(kems>=60) {
			System.out.println("평균 점수는 D입니다.");
		} else if(kems>=50) {
			System.out.println("평균 점수는 E입니다.");
		} else if(kems< 50) {
			System.out.println("평균 점수는 F입니다.");
		}
		System.out.println();
		
//		[Q3] 5개의 정수를 가진 변수를 생성하고, 이 중에서 가장 큰 수와 가장 작은 수를 찾아 출력
//		1. num1, num2, num3, num4, num5에 각각 임의의 숫자를 할당  --> 배열
//		2. for문을 활용하여 최대값과 최소값을 출력
//		3. 숫자의 범위는 1~100 사이 입니다.
		
		int[] Num = {20, 15, 55, 45, 90};
		int max = 1;
		int min = 101;
		
		for (int i=1; i<Num.length; i++) {
			//최댓값
			if (max < Num[i]) {
				max = Num[i];
			} 
			//최소값
			if (min > Num[i]) {
				min = Num[i]; 
			}
		}   
		System.out.println("최소값 : "+min + " 최댓값 : " + max);
		System.out.println();
		
		
		//---------------------------------------------------
		
		
//		[Q1] 주어진 배열에서 모든 요소의 합을 계산하여 출력하는 프로그램을 작성
//		1. int[] score = {37, 84, 12, 56, 91, 24, 63}
		int[] score = {37, 84, 12, 56, 91, 24, 63};
		
		int B = 0;   // 합계를 저장할 변수 만들어주기
		
		for(int i=0; i<score.length; i++) {
			B = B + score[i];
			}
		
		System.out.println(B);
		System.out.println();
		
//		int B = score[0]+score[1] + score[2] + score[3] + score[4] + score[5] + score[6];
//		 System.out.println(B);
		
		
		
//		Q2. 사용자로부터 10개의 정수를 입력 받아, 배열에 저장한 후 배열의 요소 중에서 짝수의 개수와 홀수의 개수를 출력하는 자바 프로그램을 작성
//		1. Scanner 클래스를 사용하여 사용자로부터 정수를 입력 받을 수 있습니다.
//		2. 크기가 10인 정수 배열을 선언하고 사용자 입력을 배열에 저장
//		3. for 루프를 사용하여 10번의 입력을 받고 배열에 저장
//		4. 배열을 반복하여 짝수와 홀수를 세고 개수를 출력
		int[] numA = new int[10];
		int evenCount = 0;  // 짝수
		int oddCount = 0;  // 홀수
		
		for(int i=0; i<numA.length; i++) {
			System.out.print("숫자 입력 : ");
			numA[i] = sc.nextInt();
			
			if(numA[i]%2 == 0) {    //짝수
				evenCount++;
		}	 else if(numA[i]%2 == 1) { //홀수
				oddCount++;
			}
		}
		 System.out.println("홀수 : " + oddCount + "짝수 : " + evenCount);
		
//		Q3. 배열을 사용해 학생들의 성적 찾기     <선생님꺼 코드받아보기>
//		1. int[] scores = {85, 90, 78, 92, 88} 배열을 활용
//		2. 모든 학생의 성적의 평균을 계산하고 출력
//		3. 가장 높은 성적을 가진 학생의 성적을 출력
//		4. 가장 낮은 성적을 가진 학생의 성적을 출력
//		5. 80점 이상을 받은 학생의 수를 계산하고 출력
		 
		  int[] scores = {85, 90, 78, 92, 88};
//	      int scoreAvg = (scores[0]+scores[1]+scores[2]+scores[3])/4;
	      int scoreSum = 0;
	      int scoreMax = scores[0]; // 초기값: 85
	      int scoreMin = scores[0]; // 초기값: 85
	      int scoreCount = 0;
	      
	      for(int i=0; i<scores.length; i++) {
	         scoreSum = scoreSum+scores[i]; // 합계
	         
	         // 가장 높은 성적을 가진 학생의 성적을 구하는 코드
	         if(scoreMax < scores[i]) {
	            scoreMax = scores[i];
	         } else if(scoreMin > scores[i]) { // 가장 낮은 성적을 가진 학생의 성적을 구하는 코드
	            scoreMin = scores[i];
	         }
	         
	         // 80점 이상인 학생들의 수
	         if(scores[i] >= 80) {
	            scoreCount++; // 카운트 값 1 증가
	         }
	      }
	      
	      int scoreAvg = scoreSum/4; // 평균
	      System.out.println("평균 점수 : " + scoreAvg);
	      
	      System.out.println("가장 높은 성적 : " + scoreMax);
	      System.out.println("가장 낮은 성적 : " + scoreMin);
	      
	      System.out.println("80점 이상인 학생들의 수 : " + scoreCount);

		
		 
		 
		 
		 
		 
		
		 
//		 Q4. 사용자로부터 국어, 영어, 수학, 과학 성적을 입력받고 배열에 담은 후 아래 기준에 따라 출력하는 프로그램을 작성
//		 * 힌트 : 과목 4개니까 4번 반복돼야 함
//		 1. 90점 이상 : OO의 성적은 A 입니다.
//		 2. 80점 이상 : OO의 성적은 B 입니다.
//		 3. 70점 이상 : OO의 성적은 C 입니다.
//		 4. 60점 이상 : OO의 성적은 D 입니다.
//		 5. 50점 이상 : OO의 성적은 E 입니다. 
//		 6. 50점 미만 : OO의 성적은 F 입니다.
//		 ex) 영어의 성적은 A 입니다.  /  과학의 성적은 E 입니다.
		  int[] scores2 = new int[4];
	      String[] subject = {"국어", "영어", "수학", "과학"};
	      
	      for(int i=0; i<4; i++) {
	         scores2[i] = sc.nextInt();
	         
	         if(scores2[i] >= 90) {
	            System.out.println(subject[i] + "의 성적은 A 입니다.");
	         }
	      }
	      
	      
//	      국어, 영어, 수학, 과학 -> kor, eng, mat, sci
//	      int[] score = {kor, eng, mat, sci};
	   //
//	      0번 인덱스 무조건 국어
//	      1번 인덱스 무조건 영어
//	      2번 인덱스 무조건 수학
//	      3번 인덱스 무조건 과학
	   //
//	      i 0~3
//	      i = 0일때 : 국어, i = 1일 때 영어, i=2일 때 수학, i=3일 때 과학

		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 String eng1 = sc.nextLine();
//		 System.out.println("과목을 입력하세요: ");
//		 
//		 String mat1 = sc.nextLine();
//		 System.out.println("과목을 입력하세요: ");
//		 
//		 String sci1 = sc.nextLine();
//		 System.out.println("과목을 입력하세요: ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                 
	}

}
