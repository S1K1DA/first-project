package kr.co.quiz;

public class Ex9_1_Student extends Ex9_1_Person {

//	Student 클래스에는 인스턴스 변수 StudentId가 있습니다.
	public String StudentId;
//	   Student 클래스에는 study()와 studentInfo 메소드가 있습니다.
//	 study() 메소드는 “공부를 시작합니다.” 를 출력합니다.
//	 studentInfo() 메소드는 학번을 출력합니다
	
	public void study() {
		System.out.println("공부를 시작합니다.");
	}
	
	@Override
	public void displayInfo(String name, int age, String StudentId) {
		this.StudentId = StudentId;
		super.name=name;
		super.age= age;
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + StudentId);
	}
	
	
	
	
}
