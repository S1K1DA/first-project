package kr.co.green;

import java.util.ArrayList;

public class Ex11_Polymorphism {

	public static void main(String[] args) {
		
		Ex11_1_Animal a = new Ex11_1_Dog();
		a.makeSound();
//		                                    배열의 크기를 자유자제로 늘려줄수있어서 많이사용함.
		ArrayList<Ex11_1_Animal> list = new ArrayList<>();
		list.add(new Ex11_1_Dog());
		list.add(new Ex11_1_Cat());
		
		
		for(Ex11_1_Animal animal : list) {
			animal.makeSound();
			
		}
		
		Ex11_1_Dog dog = new Ex11_1_Dog();
		dog.eat();
		dog.sleep();
		dog.makeSound();  // 오버라이딩된 메서
		
		
		//dog 클래스가 가지고 있는 메서드
		dog.brak();
		
		//참조변수 형변환
		// 데이터타입(클래스명) 변수명 =  (뱐환할타입)변환할변수;
		Ex11_1_Animal animal = (Ex11_1_Animal)dog;
		
		//animal 클래스가 가지고 있는 메서드
		animal.eat();
		animal.sleep();
		animal.makeSound();
		
		// dog 클래스가 가지고 있는 메서드(사용 불가)
//		animal.brak();
		
		Ex11_1_Dog dog2 = (Ex11_1_Dog)animal;
		// 상속받은 메서드
		dog2.eat();
		dog2.sleep();
		dog2.makeSound();
		
		// dog가 가지고 있는 메서드
		dog2.brak();
		

	}

}
