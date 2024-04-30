package kr.co.quiz2;

public class Ex1_3_SportsCar implements Ex1_3_Car {
	
	
//	public Ex1_3_SportsCar() {}
	
	@Override
	public void start() {
		System.out.println("스포츠카를 시동합니다.");
	}
	@Override
	public void accelerate() {
		System.out.println("스포츠카를 가속합니다.");
	}
	@Override
	public void brake() {
		System.out.println("스포츠카를 제동합니다.");
	}
	
	

}
