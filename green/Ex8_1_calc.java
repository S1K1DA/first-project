package kr.co.green;

public class Ex8_1_calc {
	
	int num;         // 생성자 호출 -> 멤버 변수 초기화 (num = 0)
	int age;
	String name;
	
	public void add() {
		int localVar;    
		System.out.println(localVar);
		
		System.out.println(num);
	}
	
	// 기본 생성자
	public Ex8_1_calc() {
		num = 100;
		System.out.println("기본 생성자가 호출되었습니다.");
	}
	
	
	
	// 매개변수 있는 생성자
	public Ex8_1_calc(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name; 
				
	}

}




