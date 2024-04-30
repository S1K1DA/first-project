package kr.co.green;

import java.util.Scanner;

public class Ex0_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Hello, World!");
	    
	    int varNum;  // 변수 선언 : 내가 varNum이라는 변수를 사용할꺼다.
	    varNum = 100; // 변수 초기화 : varNum이라는 변수에 숫자 100을 저장하겠다.
	    
	    // System.out.println : Console에 출력을 해주는 역할
	    System.out.println(varNum);
	    
	    int expNum = 200; // 명시적 초기화: 변수 선언과 초기화를 동시에 하는 것
	    System.out.println("명시적 초기화 : " + expNum);
	    
	    long longNum = 123681684L;   // long 사용시 L을 붙여주기 
	    
	 //    <데이터 타입의 종류>
	 // 1. 논리형 : boolean
//	             -> true 또는 false
	 // 2. 문자형 : char
//	             -> 문자 'ㅁ', '가', 'A', 'D'
	 // 3. 정수형 : byte, short, int, long
//	             -> 10, 300, 9800, ...
	 // 4. 실수형 : float, double
//	             -> 8.7, 100.567, 1234.5678, ..
	    
	    
	    // (논리형)boolean : true 또는 false
	    boolean varBoolean;
	    varBoolean = true;
	    System.out.println("boolean : " + varBoolean);
	    
	    // (문자형)char : 문자 (한글자만 가능)
	    // 'A', 'B', '가', '나' : 문자
	    //"AB", "CD", "가나", "다라" : 문자열
	    char varChar;
	    varChar = 'A';
	    System.out.println("char : " + varChar);
	    
	    // 정수형
	    byte varByte = 127;
	    
	    // 실수형   float같은경우 f를 같이 입력해주기
	    float varFloat = 1.123123123f;
	    System.out.println("float : " + varFloat);
	    
	    double varDouble = 1.123456789123456789;
	    System.out.println("double : " + varDouble);
	    
	    
	    // 참조자료형 = 참조형변수
	    String str = "ABCDEFG";
	    System.out.println("String : " + str);
	    
	    final int FINAL_NUMBER = 10;
	    System.out.println(FINAL_NUMBER);
	    //  FINAL_NUMBER = 20;  상수는 한번 지정하고 초기화하면 에러뜸
	    
	    
	    
	    // 형변환
//	    byte의 메모리 크기는 1byte
	    byte bNum = 127;
	    int iNum = bNum; 
	    System.out.println(iNum);
	    
	    int iNum2 = 1234;
	    double dNum2 = iNum2;
	    System.out.println(iNum2);
	    System.out.println(dNum2);  
	    
	    double dNum3 = 1234.5678;
	    int iNum3 = (int)dNum3; // 강제형변환
	    System.out.println(iNum3);
	    
	    
	    // 작은 자료형 -> 큰 자료형으로 가기 때문에 자동 형변환
	    char ch = 'a'; // char : 2byte    
	    int num = ch; // int : 4byte
	    
	    System.out.println(num);
	    
	    
	    // <변수 정리>
	    // 1. 변수 : 어떠한 값을 저장할 수 있는 공간
	    // 2. 변수 선언 :  자료형 변수명;
	    //     ex) int num;
	    // 3. 변수 초기화 : 변수명 = 값;
	    //     ex) num = 10;
	    // 4. 명시적 초기화 : 자료형 변수명 = 값;
	    //     ex) int num = 10;
	    
	    // <자료형>
	    // 기본 자료형   -----------  참조 자료형
	    //   논리형              기본자료형 8개 빼고 다
	    //   문자형
	    //   정수형
	    //   실수형
	    
	    // 논리형 : boolean(1byte)
	    //        -> true   or   false
	    // 문자형 : char (2byte)
	    //        -> 문자 하나(한글자)
	    // 정수형 : byte   (1byte)  
	    //         short (2byte)  
	    //         int   (4byte)  
	    //         long  (8byte)  
	    //      -> 숫자(정수)
	    // 실수형 : float  (4byte)
	    //         double (8byte)
	    //        -> 실수
	    
	    // <네이밍 규칙>
	    // 1. 대소문자 구별
	    // 2. 관례적으로 카멜 표기법(낙타 표기법)을 사용
	    //     ex) user + name --> userName
	    
	    // <형변환>
	    // 크기가 작은 자료형 - > 크기가 큰 자료형  : 자동 형변환
	    // 크기가 큰 자료형 -> 크기가 작은 자료형 :  강제 형변환
	    
	    // 큰 자료형에서 작은 자료형으로 데이터 타입을 변경하면
//	       데이터 손실의 위험이 있기 때문에 자동으로 되지 않음
//	       이런 경우에는 개발자가 강제로 데이터 타입을 변경 해주어야 함 ->강제 형변환
	    
	    // 작은 자료형에서 큰 자료형으로 데이터 타입을 변경하면
//	    데이터 손실의 위험이 없기 때문에 자동으로 데이터 타입이 변경 됨 -> 자동 형변환
	    
	    // 스캐너
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("나이를 입력하세요: ");
	    int age = sc.nextInt();
	    System.out.println("내 나이는 : " + age);
	    sc.nextLine();
	    
	    System.out.print("이름을 입력하세요: ");
	    String name = sc.nextLine();
	    System.out.print("내 이름은 : " + name + "\n");
	    
	    
	    System.out.println("\"Hello, World\"");
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
