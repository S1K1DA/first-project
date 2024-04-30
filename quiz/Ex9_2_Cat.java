package kr.co.quiz;

public class Ex9_2_Cat extends Ex9_2_Animal {
//	public String name;      부모클래스에서 가져옴
//	public int age;
	
	
	public Ex9_2_Cat(String name,int age) {
		super(name,age);
//		 super.name = name;
//		super.age = age;
	}
	
//	public void meow() {
//		System.out.println("고양이가 속삭입니다 : 야 옹~");
//	}
	
	
	@Override
	public void makeSound() {
		System.out.println(name+age +"가 야옹!하고 소리를 냅니다.");
	}


}
