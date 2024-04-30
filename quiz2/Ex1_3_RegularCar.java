package kr.co.quiz2;

public class Ex1_3_RegularCar implements Ex1_3_Car {

//public Ex1_3_RegularCar() {	}
	
	@Override
	public void start() {
		System.out.println("일반 자동차를 시동합니다.");
	}
	@Override
	public void accelerate() {
		System.out.println("일반 자동차를 가속합니다.");
	}
	@Override
	public void brake() {
		System.out.println("일반 자동차를 제동합니다.");
	}
	
	
	
}
