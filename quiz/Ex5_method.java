package kr.co.quiz;

public class Ex5_method {

	public static void main(String[] args) {

		
		// 클래스 생성 : Ex_1_car
		// startEngine() : "자동차 엔진을 시작합니다." 출력
		// stopEngine() : "자동차 엔진을 정지합니다." 출력
		// accelerate() : "자동차 가속합니다." 출력
		// brake() : "자동차가 감속합니다." 출력
		
		// 객체 생성 후 4개 메소드 호출
		
		
		Ex5_1_car car = new Ex5_1_car();
		
		car.startEngine();
		car.stopEngine();
		car.accelerate();
		car.brake();
		
		
		// 객체 생성(Ex5_2_minMax)
		Ex5_2_minMax minMax = new Ex5_2_minMax();
		
		int[] numbers = {10, 23, 64, 7, 99};
		
		// 최솟값 구하는 메소드 호출(numbers)
		// 반환받은 최솟값을 변수 minValue에 저장 후 출력
		int minValue = minMax.min(numbers);
		System.out.println("최솟값 : " + minValue);
		
		// 최댓값 구하는 메소드 호출(numbers)
		// 반환받은 최대값을 변수 maxValue에 저장 후 출력
		int maxValue = minMax.max(numbers);
		System.out.println("최대값 : " + maxValue);
		
		minMax.getMin(10, 20, 30, 40);
		
		
		
		
		
		 
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
