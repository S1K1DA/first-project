package kr.co.quiz;

public class Ex5_5_student {																					
//	�̸�, ����, ����, ����, ���� ������ �ν��Ͻ� ������ ����(���� ����)
	public String name;
//	public int kor, eng, mat, sci;
	public int kor;
	public int eng;
	public int mat;
	public int sci;
	
//	������ : name, kor, eng, mat, sci
	public final double STUDENT_A_AVG = 93.5;
	public final double STUDENT_B_AVG = 56.0;
	public final double STUDENT_C_AVG = 68.5;
	public final double STUDENT_D_AVG = 80.5;
	public final double STUDENT_E_AVG = 73.5;
	
//	������ �հ踦 ���ϴ� getSum �޼��� ����
//	�հ踦 ���� �� "OOO���� �հ� ������ OO�� �Դϴ�." ���
	public void getSum() {
		int sum = kor+eng+mat+sci;
		System.out.println(name + "���� �հ� ������ " + sum +"�� �Դϴ�.");
	}
	
//	������ ����� ���ϴ� getAvg �޼��� ����
//	����� ���� �� "OOO���� ��� ������ OO�� �Դϴ�." ���
	public void getAvg() {
		int sum = kor+eng+mat+sci;
		int avg = sum/4;
		System.out.println(name + "���� ��� ������ " + avg + "�� �Դϴ�.");
	}
	
//	------------------------------- ������ ���� �� �ϰ�
//	�ڽ��� ��� ������ ������� Ȯ���� �� �ִ� getRank �޼��� ����
//	�ڽ��� ��� ������ �Ű������� ����
//	int count = 1;
	
	public void getRank(int avg) {
		int count = 1; // �������
		double[] arr = {STUDENT_A_AVG, STUDENT_B_AVG, STUDENT_C_AVG,
						STUDENT_D_AVG, STUDENT_E_AVG};
		
		for(double item : arr) {
			// 1���� : 70 < 93.5      // count = 2;
			// 2���� : 70 < 56.0
			// 3���� : 70 < 68.5
			// 4���� : 70 < 80.5      // count = 3;
			// 5���� : 70 < 73.5      // count = 4;
			if(avg < item) {
				count++;
			}
		}
		
		System.out.println("��� : " + count + "��");
	}
	
//	93.5 / 56.0 / 68.5 / 80.5 / 73.5
//	�� ��� ���� : 70
//	��Ʈ : STUDENT_A_AVG ~ STUDENT_E_AVG ��׸� �迭�� ����
//		  �迭�� ���̸�ŭ �ݺ��� �ϴµ�, ������ �����
//	      ���� : ���� ���޹��� ��� ���� < �迭�� ���
//	            count �� ����
	
}