package kr.co.quiz;

import java.util.Scanner;

public class Ex5_filed {
	public static void main(String[] arvgs) {														
		// ��ü ����
		Ex5_3_Buy buy = new Ex5_3_Buy();
		buy.buyMontior();
		
		buy.buyMouse();
		
		
		// ����ڷκ��� ���� 1���� �Է¹��� (double  ->  nextDouble())
		
		// Ex5_4_rating ��ü ����
		Ex5_4_rating rating = new Ex5_4_rating();
		System.out.println("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		// ������ ��ü�� getAvgRating �޼��带 ȣ�� �ϸ鼭, �Է¹޾Ҵ� �� ����
		// getAvgRating �޼���κ��� ��ȯ���� ��� ������ result ������ ���� �� ���
		double result = rating.getAvgRating(input);
		System.out.println("��� ���� : " + result);

		sc.nextLine();
		
		// ����ڷκ��� �̸�, ����, ����, ����, ���� ������ �Է� �޾ƾ� ��
		System.out.print("�̸� : ");
		String inputName = sc.nextLine();
		
		System.out.print("���� ���� : ");
		int inputKor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int inputEng = sc.nextInt();

		System.out.print("���� ���� : ");
		int inputMat = sc.nextInt();

		System.out.print("���� ���� : ");
		int inputSci = sc.nextInt();
		
		// Ex5_5_student�� ��ü ����
		Ex5_5_student s = new Ex5_5_student();
		
		// ��ü��.name = �Է¹����̸�;
		// ��ü��.kor = �Է¹�����������;
		s.name = inputName;
		s.kor = inputKor;
		s.eng = inputEng;
		s.mat = inputMat;
		s.sci = inputSci;
		
		// getSum ȣ��
		s.getSum();
		
		// getAvg ȣ��
		s.getAvg();
		
		// getRank ȣ���� �ϴµ�, ���� ��� ������ ���� ����� ��
		// 1. ���� ����(Ex5_filed) ���� ��� ���ϰ� ����
		// 2. getAvg���� ������ �޾Ƽ� �൵ ��
		
		int sum = inputKor + inputEng + inputMat + inputSci;
		int avg = sum/4;
		s.getRank(avg);
	}
}




