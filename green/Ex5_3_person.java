package kr.co.green;

// 사람 설계도(틀)
public class Ex5_3_person {
	
	// 사람의 속성  
	// 인스턴스 변수
	public String name = "정은식";
	public int age = 19;
	public String addr;
	
	// 클래스 변수
	public static String phone = "01050962429";
	
	// 사람의 행위(기능)
	// 지역 변수
	public void walk() {
		System.out.println("걷는중");
	}
	
	public void run() {
		System.out.println("뛰는중");
	}
}

