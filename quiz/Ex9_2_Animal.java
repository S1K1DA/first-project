package kr.co.quiz;

public class Ex9_2_Animal {
	public String name;
	public int age;

	public Ex9_2_Animal(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void eat() {
		System.out.println(name+"("+age+")"+"이(가) 먹는 중입니다.");
	}
	
	public void sleep() {
		System.out.println(name+"("+age+")"+"이(가) 잠을 자고 있습니다.");
	}
	
	public void makeSound() {
		System.out.println("동물들이 소리를 냅니다.");
	}
	
	
	
	
	
	

}
