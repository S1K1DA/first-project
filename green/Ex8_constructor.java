package kr.co.green;

public class Ex8_constructor {

	public static void main(String[] args) {
		
		Ex8_1_calc calc = new Ex8_1_calc(100, 19, "정은식");
		
		
		
		
		
		
		
		Ex8_2_Student s = new Ex8_2_Student();
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
		System.out.println(s.getStudentNumber());
		
		System.out.println();
		
		s.setName("정은식");
		System.out.println(s.getName());
		s.setAge(19);
		System.out.println(s.getAge());
		s.setGrade(6);
		System.out.println(s.getGrade());
		s.setStudentNumber("2015204104");
		System.out.println(s.getStudentNumber());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
