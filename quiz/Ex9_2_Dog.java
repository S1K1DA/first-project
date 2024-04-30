package kr.co.quiz;

public class Ex9_2_Dog extends Ex9_2_Animal {
//	public String name;          ºÎ¸ð Å¬·¡½º¿¡¼­ °¡Á®¿È
//	public int age;
	
	
	public Ex9_2_Dog(String name,int age) {
		super(name,age);
//		 super.name = name;
//		 super.age = age;
	}
	
//	public void bark() {
//		System.out.println("°­¾ÆÁö°¡ Â¢½À´Ï´Ù : ¸Û! ¸Û!");
//	}
	@Override
	public void makeSound() {
		System.out.println(name+age +"°¡ ¸Û¸Û!ÇÏ°í ¼Ò¸®¸¦ ³À´Ï´Ù.");
	}
	
	
	
	

}
