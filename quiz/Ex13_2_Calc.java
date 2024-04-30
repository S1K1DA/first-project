package kr.co.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13_2_Calc {
	  public static void main(String[] args) {
	      CalcProgram cp = new CalcProgram();
	      CalcDto cd = new CalcDto();
	      Scanner sc = new Scanner(System.in);
	      boolean isTrue = true;
	      int choice = -1;
	      
	      // 1. ������ �� ���ܰ� �ߴµ� �ذ�
	      // 2. ���� �߻� ���ɼ��� �ִ� �κе��� try-catch�� "���� �߻�" ���
	      try {
	      while (isTrue) {
	         // 1. ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ尡 �������?
	         // 2. � ���ܰ� �߻��Ұ����� �����Ǵ���?
	         // 3. ���ܰ� �߻����� �� � ó���� �Ұ�����?
	         
	         System.out.println("���� ���α׷�");
	         System.out.println("1. ���� ");
	         System.out.println("2. ���� ");
	         System.out.println("3. ���� ");
	         System.out.println("4. ������(��) ");
	         System.out.println("5. ������(������) ");
	         System.out.println("0. ����");
	         System.out.print("���ϴ� �۾��� �����ϼ��� : ");
	         choice = sc.nextInt();
	         
	         switch (choice) {
	         case 1:
	            cp.inputNum(cd);
	            cp.add(cd);
	            break;
	         case 2:
	        	 cp.inputNum(cd);
		            cp.sub(cd);
	            break;
	         case 3:
	        	 cp.inputNum(cd);
		            cp.mul(cd);
	            break;
	         case 4:
	        	 cp.inputNum(cd);
		            cp.divShare(cd);
	            break;
	         case 5:
	        	 cp.inputNum(cd);
		            cp.divRemain(cd);
	            break;
	         case 0:
	            System.out.println("���α׷��� �����մϴ�.");
	            isTrue = false;
	            break;
	         default:
	            System.out.println("�ùٸ� ��ȣ�� �����ϼ���.");
	         }
	         System.out.println("--------------------------");
	      }
	      } catch(NullPointerException e) {
	    	  System.out.println();
	    	  System.out.println("���� �߻�");
	      } catch(InputMismatchException e) {
	    	  System.out.println("���� �߻�");
	      }
	      
	      
	   }
	}

	class CalcDto {
		
		int firstNum;
		int secondNum;
		
	   public int getFirstNum() {
			return firstNum;
		}
	   public int getSecondNum() {
		   return secondNum;
	   }
		public void setFirstNum(int firstNum) {
			this.firstNum = firstNum;
		}
		public void setSecondNum(int secondNum) {
			this.secondNum = secondNum;
		}
	   
//		@Override
//		public String toString() {
//			return "CalcDto [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
//		}
	   // getter,setter �ۼ�
	}

	
	
	
	
	interface CalcInterface {
	   // �Ʒ��� �߻� �޼��� �ۼ�
		public void add(CalcDto cd); 
		public void sub(CalcDto cd); 
		public void mul(CalcDto cd); 
		public void divShare(CalcDto cd); 
		public void divRemain(CalcDto cd); 
		
	   // 1. add (����)
		
	   // 2. sub (����)
		
	   // 3. mul (����)
		
	   // 4. divShare (������, ��)
		
	   // 5. divRemain (������, ������)
	}

	class CalcProgram implements CalcInterface {
		int firstNum;
		int secondNum;
	   
	   public void inputNum(CalcDto cd) {
		   // ����ڷκ��� �� ���� ���ڸ� �Է¹޴� �ڵ� �ۼ�
		   Scanner sc = new Scanner(System.in);
		   
		   
		   System.out.println("ù��° ���� : ");
		   int firstNum = sc.nextInt();
		   System.out.println("�ι�° ���� : ");
		   int secondNum = sc.nextInt();
	      
	      // �Է¹��� �� ���� ���ڴ� CaclDto�� ����
		   cd.setFirstNum(firstNum);
		   cd.setSecondNum(secondNum);
	      // ù��°�� �Է��� ���� : firstNum
	      // �ι�°�� �Է��� ���� : secondNum
	   }
	   
	   // CalcInterface���� �ۼ��� �߻� �޼��带 ��� ����
	   @Override
	   public void add(CalcDto cd) {
		   System.out.println("���� ��� : " + (cd.getFirstNum()+cd.getSecondNum()) );
	   }
	   @Override
	   public void sub(CalcDto cd) {
		   System.out.println("���� ��� : " + (cd.getFirstNum()-cd.getSecondNum()) );
	   }
	   @Override
	   public void mul(CalcDto cd) {
		   System.out.println("���� ��� : " + (cd.getFirstNum()*cd.getSecondNum()) );
	   }
	   @Override
	   public void divShare(CalcDto cd) {
		   try {
			   System.out.println("������ ��� : " + (cd.getFirstNum()/cd.getSecondNum()) );
		   } catch(ArithmeticException e){
			 System.out.println("0�� �Է��ϼ̽��ϴ�");
		   }
	   }

	   @Override
	   public void divRemain(CalcDto cd) {
		   try {
			   System.out.println("������ ��� : " + (cd.getFirstNum()%cd.getSecondNum()) );
		   } catch(ArithmeticException e) {
			   System.out.println("0�� �Է��ϼ̽��ϴ�.");
		   }
	   }
	   
	   
	   
	   
	   
	}



