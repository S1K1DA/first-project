package kr.co.quiz;

import java.util.Scanner;

public class Ex12_3_Quiz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String inputName = sc.nextLine();
		
		System.out.print("���� : ");
		int inputKor = sc.nextInt();
		
		System.out.print("���� : ");
		int inputEng = sc.nextInt();
		
		System.out.print("���� : ");
		int inputMat = sc.nextInt();
		
		System.out.print("���� : ");
		int inputSci = sc.nextInt();
		
		
		// �� �κ� �Ű����� 5�� �޴� �����ڷ� ���� ���
		Ex12_3_Student s = new Ex12_3_Student(inputName,inputKor,inputEng,inputMat,inputSci);
		
		
		s.getSum();
		
		int resultAvg = s.getAvg();
		
		s.getRank(resultAvg);
	}
	
	
	
}