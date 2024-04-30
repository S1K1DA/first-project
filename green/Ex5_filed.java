package kr.co.green;

public class Ex5_filed {
	// 멤버 변수
	int num = 10; //인스턴스 변수
	static int classNum = 100; // 클래스 변수

	public static void main(String[] args) {
		Ex5_filed f = new Ex5_filed();
		System.out.println("인스턴스 변수 : "  + f.num);
		f.num = 200;
		System.out.println("인스턴스 변수 : " + f.num);
		
		// 사람 클래스에 대한 객체 생성(인스턴스화)
		Ex5_3_person p = new Ex5_3_person();
		
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		p.walk();
		p.run();            // 예를들어 p.name; 은 변수   p.name(); 이거는 메소드
		
		System.out.println(Ex5_3_person.phone);
		
		Calc calc = new Calc(); // 객체 생성
		calc.instanceNumFirst = 10;
		calc.instanceNumSecond = 20;
		
		System.out.println(calc.instanceNumFirst + calc.instanceNumSecond);
		
		Calc.classNumThird = 30;
		System.out.println(calc.instanceNumFirst + Calc.classNumThird);
		
		
		// 객체 배열
		String[] s = new String[3];
		Ex5_3_person[] person = new Ex5_3_person[3]; // 객체배열 선언+생성(할당)
		
		person[0] = new Ex5_3_person();
		person[1] = new Ex5_3_person();
		person[2] = new Ex5_3_person();
		
		 
		person[0].addr = "안양";
		person[2].addr = "경기";
		
		for(int i=0; i<person.length; i++) {
			System.out.println("현재 i의 값 : " + i);
			System.out.println("addr : " + person[i].addr);
		}
		
		

	}
	
	public void add() {
		int localNum = 100; // 지역 변수
	}

}

class Calc {
	
	public int instanceNumFirst;       // 인스턴스 변수
	public int instanceNumSecond; 
	public static int classNumThird;    // 클래스 변수
	
	public void add() {    // 지역 변수 ????
		instanceNumFirst = 10;
		instanceNumSecond = 20;
		
		System.out.println(instanceNumFirst + instanceNumSecond);
	}
}
