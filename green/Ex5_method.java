package kr.co.green;

public class Ex5_method {

	public static void main(String[] args) {
		
		// class : 틀
		// 메소드 : 기능을 수행하는 코드 묶음
		
		
		
		
		// 객체 생성(=인스턴스화)
		// Ex5_method 클래스를 메모리에 올리는 과정
		
		// 메소드를 만든 클래스가 있으면 객체를 생성할 때
		// 클래스명 변수명 = new 클래스명();
		Ex5_method m = new Ex5_method();
		
		// 변수명.메소드명();
		String printStr = "Hello, Method!";
		m.print(printStr); // "Hello, Method!"
		
		int resultAdd = m.add(1, 2);		
		System.out.println("add : " + resultAdd);
		
		
		m.sub(20, 10);
		
		
		
		// 계산기 클래스(Ex5_1_calc)를 객체 생성
		Ex5_1_calc calc = new Ex5_1_calc();
		
		int resultAdd2 = calc.add(100,50); // 100+50
		calc.div(777,5); // 777-5
		calc.sub(200,150); // 200 *150
		String resultmul2 = calc.mul(1000,23); // 1000/23
		
		// 동물 클래스 객체 생성
		Ex5_2_animal animal = new Ex5_2_animal();
		String ani1 = "먹는중";
		String ani2 = "자는중";
		String ani3 = "동물이 소리를 냅니다.";                                                       
		
		
		// eat메소드는 1을 반환
//		animal.eat(); //"먹는중"이라는 문자열을 전달
		//반환 받은 값 출력
	    int resultEat = animal.eat(ani1);
		System.out.println(resultEat);
		
		//sleep 메소드는 2를 반환
//		animal.sleep(); //"자는중"이라는 문자열을 전달
		//반환 받은 값 출력
		int resultSleep = animal.sleep(ani2);
		System.out.println(resultSleep);
		
		//makeSound 메소드는 3을 반환
//		animal.makeSound(); //"동물이 소리를 냅니다."이라는 문자열을 전달
		//반환 받은 값 출력
		int resultSound = animal.makeSound(ani3);
		System.out.println(resultSound);
	}
		

	// 뺼셈을 수행하는 메소드
	public void sub(int num1,int num2) {
		System.out.println(num1);
		
		System.out.println(num2);
		
		System.out.println("뺄셈 결과 : " + (num1-num2));
	}
		
	public void print(String printStr) {
		System.out.println("Hello, Method!");
	}
		
//	public void add(int add1,int add2) {
		public int add(int add1,int add2) {
		// System.out.println(add1+add2);
		return add1+add2;
	}
		
		
		
		
		
		
		
		
		
	

}
