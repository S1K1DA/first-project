package kr.co.quiz;

public class Ex9_2_Animal {
	public String name;
	public int age;

	public Ex9_2_Animal(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void eat() {
		System.out.println(name+"("+age+")"+"��(��) �Դ� ���Դϴ�.");
	}
	
	public void sleep() {
		System.out.println(name+"("+age+")"+"��(��) ���� �ڰ� �ֽ��ϴ�.");
	}
	
	public void makeSound() {
		System.out.println("�������� �Ҹ��� ���ϴ�.");
	}
	
	
	
	
	
	

}
