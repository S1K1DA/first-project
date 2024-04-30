package kr.co.green;

public class Ex1_Operator {

	public static void main(String[] args) {
		int result;
		int firstNumber = 50;
		int secondNumber = 20;
		
		//            50    +     20
		result = firstNumber+secondNumber;
		System.out.println("덧셈 결과 : " + result);
		
		result = firstNumber*secondNumber;
		System.out.println("곱셈 결과 : " + result);
		
		result = firstNumber/secondNumber;
		System.out.println("나누기 결과 : " + result);
		
		result = firstNumber-30;
		System.out.println("뺄셈 결과 : " + result);
		
		System.out.println(10+30*5);
		
		
		// 증감 연산자
		// ++ : 1 증가
		// -- : 1 감소
		// <후위 증감 연산자>
		int x = 10;
		x++; // 1증가
		System.out.println(x); // 11
		 
		x--; // 1감소
		System.out.println(x); // 10
		
		// <전위 증감 연산자>
		int y = 10;
		++y; // 1증가
		System.out.println(y);  // 11
		
		--y; // 1감소
		System.out.println(y);  // 10
		
		
		// <차이점>
		
		int z = 10;
		
		// println 실행 -> z 변수 1증가
		// 1. println이 실행되면서 "후위 연산자 : 10" 출력
		// 2. z 변수의 값을 1증가(11) 
		// 3. 그후 println이 실행되면서 "이후 값 : 11" 출력
		System.out.println("후위 증감 연산자 : " + z++); // 10 
		// z = z+1;
		System.out.println("이후 값 : " + z); // 11
		
		// z변수 1증가 -> println 실행
		// 1. z 변수의 값을 1증가(12)
		// 2. println이 실행되면서 "전위 증감 연산자 : 12" 출력
		// 3. println이 실행되면서 "이후 값 : 12" 출력
		
		// z = z+1;
		System.out.println("전위 증감 연산자 : " + ++z); // 12
		System.out.println("이후 값 : " + z); // 12
		
		// firstNumber = 50;  , secondNumber = 20;
		System.out.println(10 < 5);  //false
		System.out.println(firstNumber > secondNumber);  //true
		System.out.println(firstNumber == 50);  // true
		
		String firstStr = "hi";
		String secondStr = new String("hi");
		System.out.println(firstStr == secondStr); // false
		
		// 문자열 비교할때 : equals 메소드 사용
		
		// equals : 두 개의 문자열이 같으면true, 다르면 false
		
		// 개발자가 두 개의 문자열이 다르면 true, 같으면 false를 반환하고 싶다
		// -> 논리 부정 연산자(!)사용
		System.out.println(firstStr.equals(secondStr));  //true
		
	    boolean isTrue = true;
	    System.out.println(!isTrue); // isTrue는 true인데 !붙어 false
	    
	    
	    System.out.println(10>5 && 20!=20); //false
	    System.out.println(10>5 || 20!=20); //true
	    
	    
	    int a = 10;
	    int b = 5;
	    // 조건식 ? true일 때 실행할 코드 : false일 때 실행할 코드
	    System.out.println(a>b ? a+10 : a-10);
	   
	    
	    
		
		
		
		
		
		

	}

}
