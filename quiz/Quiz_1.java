package kr.co.quiz;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Quiz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[Q1] �Ʒ��� ���ǿ� �����ϴ� ������ �����ϼ���.
//		1. ������ ���� varFalse ������ �����ϼ���.
//		   -> ������ ������ ������ false�� �ʱ�ȭ �ϼ���.
//		2. �������� ���� varChar ������ �����ϼ���.
//		   -> ������ ������ ������ 'Q'�� �ʱ�ȭ �ϼ���.
//		3. ������ ���ڸ� ���� varNum ������ �����ϼ���.
//		   -> ������ ������ ������ 10���� �ʱ�ȭ �ϼ���.
//		4. ���ڿ��� ���� varStr ������ ���� �� �ʱ�ȭ�� ���ÿ� �ϼ���.
//		   -> ���� "Java"�� ���ϴ�.
		
		boolean varFalse;
		varFalse = false;
		
		char varChar;
		varChar = 'Q';
		
		int varNum;
		varNum = 10;
		
		String varStr = "Java";
		
//		[Q2] �ΰ��� ���� ���� a�� b�� �����ϰ�, ���� 5�� 3�� ���� �Ҵ��ϼ���
//		1. a�� b�� ���� ���ϰ� ����� ���
//		2. a�� b�� ���̸� ���ϰ� ����� ���
//		3. a�� b�� ���� ���ϰ� ����� ���
//		4. a�� b�� ���� ����� ���
//		5. a�� b�� ���� �������� ���
		
		int a = 5;
		int b = 3;
		System.out.println("a��b �� : " + (a+b));
		System.out.println("a��b ���� : " + (a-b));
		System.out.println("a��b �� : " + (a*b));
		System.out.println("a��b ���� ��� : " + (a/b));
		System.out.println("a��b ���� ������ : " + (a%b));
		
		
		System.out.println();
		
//		Q3. �ΰ��� ���ڿ��� �̾� ���̼���.
//		1. ���� strFirst �� ���ڿ� "Hello, " �� �Ҵ�
//		2. ���� strSecond �� ���ڿ� "World!"�� �Ҵ�
//		3. �ΰ��� ���ڿ��� �̾� �ٿ� ���
		
		String strFirst = "Hello";
		String strSecond = " World!";
		System.out.println(strFirst+strSecond);
		
		
		System.out.println();
		
		//-----------------------------------------------------
		
//		[Q1] 1���� 100������ ���� �߿��� 3�� ����� ���ڸ� ����ϴ� �ڹ� ���α׷��� �ۼ�
//		1. for ���� ����Ͽ� 1���� 100������ ���ڸ� �ݺ� ����
//		2. if ���� ����Ͽ� �� ���ڰ� 3�� ��������� Ȯ��     
//		3. 3�� ����� ��� �ش� ���ڸ� ���
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				System.out.print("3��� : "+i);
				System.out.println();
			}
		}
		
//		[Q2] ����ڷκ��� ����, ����, ����, ���� ������ �Է¹ް� �Ʒ� ���ؿ� ���� ����ϴ� ���α׷��� �ۼ�
//		1. 90�� �̻� : OO�� ������ A �Դϴ�.
//		2. 80�� �̻� : OO�� ������ B �Դϴ�.
//		3. 70�� �̻� : OO�� ������ C �Դϴ�.
//		4. 60�� �̻� : OO�� ������ D �Դϴ�.
//		5. 50�� �̻� : OO�� ������ E �Դϴ�. 
//		6. 50�� �̸� : OO�� ������ F �Դϴ�.
//		ex) ������ ������ A �Դϴ�.  /  ������ ������ E �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int mat = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int sci = sc.nextInt();
		
		
		int kems = (kor+eng+mat+sci)/5;
		
		if(kems>= 90 ) {
			System.out.println("��� ������ A�Դϴ�.");
		} else if(kems>=80) {
			System.out.println("��� ������ B�Դϴ�.");
		} else if(kems>=70) {
			System.out.println("��� ������ C�Դϴ�.");
		} else if(kems>=60) {
			System.out.println("��� ������ D�Դϴ�.");
		} else if(kems>=50) {
			System.out.println("��� ������ E�Դϴ�.");
		} else if(kems< 50) {
			System.out.println("��� ������ F�Դϴ�.");
		}
		System.out.println();
		
//		[Q3] 5���� ������ ���� ������ �����ϰ�, �� �߿��� ���� ū ���� ���� ���� ���� ã�� ���
//		1. num1, num2, num3, num4, num5�� ���� ������ ���ڸ� �Ҵ�  --> �迭
//		2. for���� Ȱ���Ͽ� �ִ밪�� �ּҰ��� ���
//		3. ������ ������ 1~100 ���� �Դϴ�.
		
		int[] Num = {20, 15, 55, 45, 90};
		int max = 1;
		int min = 101;
		
		for (int i=1; i<Num.length; i++) {
			//�ִ�
			if (max < Num[i]) {
				max = Num[i];
			} 
			//�ּҰ�
			if (min > Num[i]) {
				min = Num[i]; 
			}
		}   
		System.out.println("�ּҰ� : "+min + " �ִ� : " + max);
		System.out.println();
		
		
		//---------------------------------------------------
		
		
//		[Q1] �־��� �迭���� ��� ����� ���� ����Ͽ� ����ϴ� ���α׷��� �ۼ�
//		1. int[] score = {37, 84, 12, 56, 91, 24, 63}
		int[] score = {37, 84, 12, 56, 91, 24, 63};
		
		int B = 0;   // �հ踦 ������ ���� ������ֱ�
		
		for(int i=0; i<score.length; i++) {
			B = B + score[i];
			}
		
		System.out.println(B);
		System.out.println();
		
//		int B = score[0]+score[1] + score[2] + score[3] + score[4] + score[5] + score[6];
//		 System.out.println(B);
		
		
		
//		Q2. ����ڷκ��� 10���� ������ �Է� �޾�, �迭�� ������ �� �迭�� ��� �߿��� ¦���� ������ Ȧ���� ������ ����ϴ� �ڹ� ���α׷��� �ۼ�
//		1. Scanner Ŭ������ ����Ͽ� ����ڷκ��� ������ �Է� ���� �� �ֽ��ϴ�.
//		2. ũ�Ⱑ 10�� ���� �迭�� �����ϰ� ����� �Է��� �迭�� ����
//		3. for ������ ����Ͽ� 10���� �Է��� �ް� �迭�� ����
//		4. �迭�� �ݺ��Ͽ� ¦���� Ȧ���� ���� ������ ���
		int[] numA = new int[10];
		int evenCount = 0;  // ¦��
		int oddCount = 0;  // Ȧ��
		
		for(int i=0; i<numA.length; i++) {
			System.out.print("���� �Է� : ");
			numA[i] = sc.nextInt();
			
			if(numA[i]%2 == 0) {    //¦��
				evenCount++;
		}	 else if(numA[i]%2 == 1) { //Ȧ��
				oddCount++;
			}
		}
		 System.out.println("Ȧ�� : " + oddCount + "¦�� : " + evenCount);
		
//		Q3. �迭�� ����� �л����� ���� ã��     <�����Բ� �ڵ�޾ƺ���>
//		1. int[] scores = {85, 90, 78, 92, 88} �迭�� Ȱ��
//		2. ��� �л��� ������ ����� ����ϰ� ���
//		3. ���� ���� ������ ���� �л��� ������ ���
//		4. ���� ���� ������ ���� �л��� ������ ���
//		5. 80�� �̻��� ���� �л��� ���� ����ϰ� ���
		 
		  int[] scores = {85, 90, 78, 92, 88};
//	      int scoreAvg = (scores[0]+scores[1]+scores[2]+scores[3])/4;
	      int scoreSum = 0;
	      int scoreMax = scores[0]; // �ʱⰪ: 85
	      int scoreMin = scores[0]; // �ʱⰪ: 85
	      int scoreCount = 0;
	      
	      for(int i=0; i<scores.length; i++) {
	         scoreSum = scoreSum+scores[i]; // �հ�
	         
	         // ���� ���� ������ ���� �л��� ������ ���ϴ� �ڵ�
	         if(scoreMax < scores[i]) {
	            scoreMax = scores[i];
	         } else if(scoreMin > scores[i]) { // ���� ���� ������ ���� �л��� ������ ���ϴ� �ڵ�
	            scoreMin = scores[i];
	         }
	         
	         // 80�� �̻��� �л����� ��
	         if(scores[i] >= 80) {
	            scoreCount++; // ī��Ʈ �� 1 ����
	         }
	      }
	      
	      int scoreAvg = scoreSum/4; // ���
	      System.out.println("��� ���� : " + scoreAvg);
	      
	      System.out.println("���� ���� ���� : " + scoreMax);
	      System.out.println("���� ���� ���� : " + scoreMin);
	      
	      System.out.println("80�� �̻��� �л����� �� : " + scoreCount);

		
		 
		 
		 
		 
		 
		
		 
//		 Q4. ����ڷκ��� ����, ����, ����, ���� ������ �Է¹ް� �迭�� ���� �� �Ʒ� ���ؿ� ���� ����ϴ� ���α׷��� �ۼ�
//		 * ��Ʈ : ���� 4���ϱ� 4�� �ݺ��ž� ��
//		 1. 90�� �̻� : OO�� ������ A �Դϴ�.
//		 2. 80�� �̻� : OO�� ������ B �Դϴ�.
//		 3. 70�� �̻� : OO�� ������ C �Դϴ�.
//		 4. 60�� �̻� : OO�� ������ D �Դϴ�.
//		 5. 50�� �̻� : OO�� ������ E �Դϴ�. 
//		 6. 50�� �̸� : OO�� ������ F �Դϴ�.
//		 ex) ������ ������ A �Դϴ�.  /  ������ ������ E �Դϴ�.
		  int[] scores2 = new int[4];
	      String[] subject = {"����", "����", "����", "����"};
	      
	      for(int i=0; i<4; i++) {
	         scores2[i] = sc.nextInt();
	         
	         if(scores2[i] >= 90) {
	            System.out.println(subject[i] + "�� ������ A �Դϴ�.");
	         }
	      }
	      
	      
//	      ����, ����, ����, ���� -> kor, eng, mat, sci
//	      int[] score = {kor, eng, mat, sci};
	   //
//	      0�� �ε��� ������ ����
//	      1�� �ε��� ������ ����
//	      2�� �ε��� ������ ����
//	      3�� �ε��� ������ ����
	   //
//	      i 0~3
//	      i = 0�϶� : ����, i = 1�� �� ����, i=2�� �� ����, i=3�� �� ����

		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 String eng1 = sc.nextLine();
//		 System.out.println("������ �Է��ϼ���: ");
//		 
//		 String mat1 = sc.nextLine();
//		 System.out.println("������ �Է��ϼ���: ");
//		 
//		 String sci1 = sc.nextLine();
//		 System.out.println("������ �Է��ϼ���: ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                 
	}

}
