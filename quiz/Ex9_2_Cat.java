package kr.co.quiz;

public class Ex9_2_Cat extends Ex9_2_Animal {
//	public String name;      �θ�Ŭ�������� ������
//	public int age;
	
	
	public Ex9_2_Cat(String name,int age) {
		super(name,age);
//		 super.name = name;
//		super.age = age;
	}
	
//	public void meow() {
//		System.out.println("����̰� �ӻ��Դϴ� : �� ��~");
//	}
	
	
	@Override
	public void makeSound() {
		System.out.println(name+age +"�� �߿�!�ϰ� �Ҹ��� ���ϴ�.");
	}


}
