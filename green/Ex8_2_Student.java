package kr.co.green;

public class Ex8_2_Student {
	
	
	// private : ���� Ŭ���������� ���� ����
	private String name;
	private int age;
	private int grade;
	private String studentNumber;
	
	
	public Ex8_2_Student() {
		this("�̸� ����", 0, 0, "00000000");
	}
	
	
	public Ex8_2_Student(String name,int age, int grade, String studentNumber) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentNumber = studentNumber;
	}
	
	// getter : ���� ������ �� ����� �޼���
	public String getName() { // get ���δ°� �ʼ� x �Ϲ����� ���!!
		return name;
	}
	public int getAge() { 
		return age;
	}
	public int getGrade() { 
		return grade;
	}
	public String getStudentNumber() { 
		return studentNumber;
	}
	
	
	
	
	// setter : ���� ���� �� ����� �޼���
	// setName
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
