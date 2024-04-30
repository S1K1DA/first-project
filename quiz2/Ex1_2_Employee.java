package kr.co.quiz2;

public class Ex1_2_Employee {
	
	private String name;   // 이름
	private String position;    // 직급
	private double salart;    // 연봉
//	private double percentage;    // 연봉 인상 금액
	
	
	public Ex1_2_Employee(String name, String position, double salart) {
		this.name = name;
		this.position = position;
		this.salart = salart;
	}
	
	public void raiseSalary(double percentage) {  // 연봉 인상 메서드
//		this.percentage = percentage;
		salart = salart + percentage;
		System.out.println(name+" 님의 연봉이 " + percentage + "올랐습니다.");
	}
	
	public void displayEmployeeInfo() {
		System.out.println("직원 이름 : " + name);
		System.out.println("직원 직급 : " + position);
		System.out.println("직원 연봉 : " + salart);
	}

}
