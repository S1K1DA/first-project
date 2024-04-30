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
	      
	      // 1. 실행할 때 예외가 뜨는데 해결
	      // 2. 예외 발생 가능성이 있는 부분들을 try-catch로 "예외 발생" 출력
	      try {
	      while (isTrue) {
	         // 1. 예외가 발생할 가능성이 있는 코드가 어디인지?
	         // 2. 어떤 예외가 발생할것으로 추측되는지?
	         // 3. 예외가 발생했을 때 어떤 처리를 할것인지?
	         
	         System.out.println("계산기 프로그램");
	         System.out.println("1. 덧셈 ");
	         System.out.println("2. 뺄셈 ");
	         System.out.println("3. 곱셈 ");
	         System.out.println("4. 나눗셈(몫) ");
	         System.out.println("5. 나눗셈(나머지) ");
	         System.out.println("0. 종료");
	         System.out.print("원하는 작업을 선택하세요 : ");
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
	            System.out.println("프로그램을 종료합니다.");
	            isTrue = false;
	            break;
	         default:
	            System.out.println("올바른 번호를 선택하세요.");
	         }
	         System.out.println("--------------------------");
	      }
	      } catch(NullPointerException e) {
	    	  System.out.println();
	    	  System.out.println("예외 발생");
	      } catch(InputMismatchException e) {
	    	  System.out.println("예외 발생");
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
	   // getter,setter 작성
	}

	
	
	
	
	interface CalcInterface {
	   // 아래의 추상 메서드 작성
		public void add(CalcDto cd); 
		public void sub(CalcDto cd); 
		public void mul(CalcDto cd); 
		public void divShare(CalcDto cd); 
		public void divRemain(CalcDto cd); 
		
	   // 1. add (덧셈)
		
	   // 2. sub (뺄셈)
		
	   // 3. mul (곱셈)
		
	   // 4. divShare (나눗셈, 몫)
		
	   // 5. divRemain (나눗셈, 나머지)
	}

	class CalcProgram implements CalcInterface {
		int firstNum;
		int secondNum;
	   
	   public void inputNum(CalcDto cd) {
		   // 사용자로부터 두 개의 숫자를 입력받는 코드 작성
		   Scanner sc = new Scanner(System.in);
		   
		   
		   System.out.println("첫번째 숫자 : ");
		   int firstNum = sc.nextInt();
		   System.out.println("두번째 숫자 : ");
		   int secondNum = sc.nextInt();
	      
	      // 입력받은 두 개의 숫자는 CaclDto에 저장
		   cd.setFirstNum(firstNum);
		   cd.setSecondNum(secondNum);
	      // 첫번째로 입력한 숫자 : firstNum
	      // 두번째로 입력한 숫자 : secondNum
	   }
	   
	   // CalcInterface에서 작성한 추상 메서드를 모두 구현
	   @Override
	   public void add(CalcDto cd) {
		   System.out.println("덧셈 결과 : " + (cd.getFirstNum()+cd.getSecondNum()) );
	   }
	   @Override
	   public void sub(CalcDto cd) {
		   System.out.println("뺄셈 결과 : " + (cd.getFirstNum()-cd.getSecondNum()) );
	   }
	   @Override
	   public void mul(CalcDto cd) {
		   System.out.println("곱셈 결과 : " + (cd.getFirstNum()*cd.getSecondNum()) );
	   }
	   @Override
	   public void divShare(CalcDto cd) {
		   try {
			   System.out.println("나눗셈 결과 : " + (cd.getFirstNum()/cd.getSecondNum()) );
		   } catch(ArithmeticException e){
			 System.out.println("0을 입력하셨습니다");
		   }
	   }

	   @Override
	   public void divRemain(CalcDto cd) {
		   try {
			   System.out.println("나눗셈 결과 : " + (cd.getFirstNum()%cd.getSecondNum()) );
		   } catch(ArithmeticException e) {
			   System.out.println("0을 입력하셨습니다.");
		   }
	   }
	   
	   
	   
	   
	   
	}



