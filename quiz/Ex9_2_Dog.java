package kr.co.quiz;

public class Ex9_2_Dog extends Ex9_2_Animal {
//	public String name;          �θ� Ŭ�������� ������
//	public int age;
	
	
	public Ex9_2_Dog(String name,int age) {
		super(name,age);
//		 super.name = name;
//		 super.age = age;
	}
	
//	public void bark() {
//		System.out.println("�������� ¢���ϴ� : ��! ��!");
//	}
	@Override
	public void makeSound() {
		System.out.println(name+age +"�� �۸�!�ϰ� �Ҹ��� ���ϴ�.");
	}
	
	
	
	

}
