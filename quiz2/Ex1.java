package kr.co.quiz2;

public class Ex1 {

	public static void main(String[] args) {
		
//		<Ex 1 - 변수>
//		1) 정수형 변수 age를 선언하고 값 25를 할당하세요.
//		2) 실수형 변수 weight를 선언하고 값 68.5를 할당하세요.
//		3) 문자형 변수 grade를 선언하고 값 'A'를 할당하세요.
//		4) 논리형 변수 isMale를 선언하고 값 true를 할당하세요.
//		5) 문자열 변수 name을 선언하고 값 "John Doe"를 할당하세요.
//		    -> 문자열의 길이를 출력하세요.
//		    -> 문자열의 첫 번째 문자를 출력하세요.
//		    -> 문자열을 모두 대문자로 변환하여 출력하세요.
		int age = 25;
		double weight = 68.5;
		char grade = 'A';
		boolean isMale = true;
		String name = "John Doe";
		
		char firstChar = name.charAt(0); // 문자열 첫번째 글자 출력법
		String upperCaseStr = name.toUpperCase();
		
		System.out.println("문자열의 길이 : " + name.length());
		System.out.println("문자열 첫번째 문자 : " + firstChar);
		System.out.println("문자열 모든문자 대문자 : " + upperCaseStr);
		
//		<Ex 2  - 연산자>
//		1) 변수 x를 선언하고 값 10을 할당하세요.
//		2) 변수 y를 선언하고 값 5를 할당하세요.
//		3) 변수 sum을 선언하고 x와 y를 더한 값을 저장하세요.
//		4) 변수 difference를 선언하고 x와 y를 뺀 값을 저장하세요.
//		5) 변수 product를 선언하고 x와 y를 곱한 값을 저장하세요.
//		6) 변수 quotient를 선언하고 x를 y로 나눈 값을 저장하세요.
//		7) 변수 remainder를 선언하고 x를 y로 나눈 나머지 값을 저장하세요.
		
		int x = 10;
		int y = 5;
		int sum = x+y;
		int difference = x - y;
		int product = x * y;
		int quotient = x / y;
		int remainder = x % y;
		
		System.out.println();
		
//		<Ex 3 - 조건문>
//		1) 변수 num을 선언하고 값 53을 할당하세요.
//		    아래의 조건에 만족하는 조건문을 작성하세요.
//		 -> num은 0보다 크거나 같습니다. 그리고 num은 10보다 작습니다.
//		 -> num은 10과 같거나 큽니다. 그리고 20보다 작습니다.
//		 -> num은 50보다 작습니다. 또는 60보다 크거나 같습니다.
//		 -> 그 외의 경우에는 "else"를 출력합니다.
		
		int num = 53;
		
		if(num >= 0 && num < 10) {
		}
		if(num>=10 && num<20) {
		}
		if(num<50 || num>=60) {
		} else {
		}
		
		System.out.println();
		
//		<Ex 4 - 반복문>
//		1) hieght = 5 일 때 아래의 별찍기를 구현하세요.
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		<Ex 5 ~1)
//		1) 문자열 두 개를 결합하는 메서드 concat(String str1, String str2)와 문자열 세 개를 결합하는 
//        메서드 concat(String str1, String str2, String str3)를 정의하고, 
//        각각의 메서드를 활용하여 문자열을 결합하여 출력하는 프로그램을 작성하세요.
		Ex1 od = new Ex1();
		
		od.concat("qwdqwd", "qwfgas");
		od.concat("ASD", "!@!@#", "ASASGASA");
		System.out.println();
		
//		public void concat() {
//		}
//		
//		public void concat(String str1, String str2) {
//			System.out.println(str1 + str2);
//		}
//		public void concat(String str1, String str2, String str3) {
//			System.out.println(str1 + str2 +str3);
//		}
	
		
		
		
		
		
//		2) 문자열과 반복 횟수를 입력받아 해당 문자열을 입력된 반복 횟수만큼 반복한 결과를 반환하는 repeatString 메서드를 작성하세요. 
//		그리고 같은 이름의 메서드를 사용하여 문자열만 입력받았을 때는 한 번만 반복하도록 하고, 
//		반복 횟수를 입력받지 않았을 때는 오류 메시지를 출력하도록 오버로딩하세요.
//		    public static void main(String[] args) {
//		        // 문자열과 반복 횟수를 입력받아 해당 문자열을 입력된 반복 횟수만큼 반복한 결과를 반환
//		        String repeatedString = repeatString("Hello ", 3);
//		        System.out.println(repeatedString); // 출력: Hello Hello Hello 
//
//		        // 문자열만 입력받았을 때는 한 번만 반복하도록 오버로딩
//		        String singleRepeat = repeatString("Hi");
//		        System.out.println(singleRepeat); // 출력: Hi
//
//		        // 반복 횟수를 입력받지 않았을 때는 오류 메시지를 출력하도록 오버로딩
//		        String errorMessage = repeatString();
//		        System.out.println(errorMessage); // 출력: 반복 횟수를 입력해주세요.
//		    }
		
		od.repeatedString("Hello", 4);
		od.singleRepeat("Hi");
		od.errorMessage();
		
		System.out.println();
		
		
		

//      3). 계산기 만들기
//      1. int[] numbers = {50, 5, 8, 132, 15} 배열을 활용
//      2. numbers의 모든 정수의 합을 반환하는 int sum() 메소드 생성
//      3. numbers의 모든 정수의 곱을 반환하는 int product() 메소드 생성
//      4. numbers의 가장 큰 정수를 반환하는 int max() 메소드 생성
//      5. numbers의 가장 작은 정수를 반환하는 int min() 메소드 생성
	  
//		
//		public int sum(int[] numbers) {
//		}
		
		int[] numbers = {50, 5, 8, 132, 15};
		
//		배열의 합
		int sum1 = 0;
		
		for(int i=0; i<numbers.length; i++) {
		sum1 += numbers[i];
			}
		System.out.println("배열의 합 : " + sum1);
		
//		배열의 곱
		int prodect = 1;
		for(int i=0; i<numbers.length; i++) {
			prodect = prodect * numbers[i];
				}
		System.out.println("배열의 곱 : " + prodect);
		
//		배열에서 가장 큰 정수 및 작은 정수 구하기
		
		
		int min = 101;
		int max = 1;
		int count = 0;
		// 가장 작은 정수
		for(int i=0; i<numbers.length; i++) {
			if(min > numbers[i]) {
				count++;
				min = numbers[i];
			}
		}
		System.out.println("가장 작은 정수 : " + min);
		for(int i=0; i<numbers.length; i++) {
			if(max <numbers[i]) {
				count++;
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 정수 : " + max);
		System.out.println();
		
		
		
//		5-4) 사용자의 정보를 출력하는 프로그램을 작성하세요.
		
		Ex1_1_InternetUser user1 = new Ex1_1_InternetUser("은식","bamtol2100@naver.com");
		System.out.println("---인터넷 사용자 정보---");
		user1.displayUserInfo();
		System.out.println();
		
		Ex1_1_PremiumUser premium1 = new Ex1_1_PremiumUser("은식","bamtol2100@naver.com",12);
		
		System.out.println("---프리미엄 사용자 정보---");
		premium1.displayUserInfo();    
		premium1.displayMembershipPeriod();
		
		System.out.println();
		
		
		
		
		
		
//		5-5)  직원들을 관리할 수 있는 프로그램을 작성하세요.
		
		Ex1_2_Employee p1 = new Ex1_2_Employee("은식","Manager",50000);
		Ex1_2_Employee p2 = new Ex1_2_Employee("현진","Developer",40000);
		
		System.out.println("---직원 1 정보---");
		p1.displayEmployeeInfo();
		System.out.println();
		
		System.out.println("---직원 2 정보---");
		p2.displayEmployeeInfo();
		System.out.println();
		
		System.out.println("---직원의 연봉 인상---");
		p1.raiseSalary(30000);
		System.out.println();
		
		System.out.println("---직원 1 정보(인상후)---");
		p1.displayEmployeeInfo();
		System.out.println();
		
		
//	    [6]  main 메서드에서 SportsCar와 RegularCar의 객체를 생성하고 메서드를 모두 실행하세요.
		
		Ex1_3_SportsCar Scar = new Ex1_3_SportsCar();  //객체 생성
		Ex1_3_RegularCar Rcar = new Ex1_3_RegularCar();
		
		System.out.println("----일반 자동차----");
		Rcar.start();
		Rcar.accelerate();
		Rcar.brake();
        System.out.println();		
		System.out.println("----스포츠 카----");
		Scar.start();
		Scar.accelerate();
		Scar.brake();
		System.out.println();
		
		
		
		
		
		
		
		
		

	
		
	


		
		
	}
	
	
//	 5-1
	public void concat() {
	}
	
	public void concat(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	public void concat(String str1, String str2, String str3) {
		System.out.println(str1 + str2 +str3);
	}
	
	
//	5-2
	public void errorMessage() {
		System.out.println("반복 횟수를 입력해주세요.");
	}
	public void singleRepeat(String str1) {
		System.out.println(str1);
	}
	public void repeatedString(String str1,int num) {
		for(int i = 0; i<num; i++) {
		 System.out.print(str1+" ");
		}
		System.out.println();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
