package kr.co.green;

import kr.co.green.Ex12_1_Plant.Ex12_A;

public class Ex12_abstract {

	public  static void main(String[] args) {
		
//		추상 클래스는 객체 생성 불가
//		Ex12_1_Organism o = new Ex12_1_Organism();
		
		Ex12_1_Animal animal = new Ex12_1_Animal();
		animal.eat();
		animal.breathe();
		
		Ex12_A a = new Ex12_A();
		a.eat();
		a.breathe();
	    

	}

}
