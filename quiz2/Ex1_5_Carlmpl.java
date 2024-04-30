package kr.co.quiz2;

public class Ex1_5_Carlmpl implements Ex1_5_Car {

	boolean isRunning = false; // 운행 상태 여부
	int speed = 0; // 자동차 속도
	String status;

	@Override
	public void start() {
//		if(isRunnung == false) {
		if (!isRunning) {       // 논리부정으로 인해 isRunning이 false일 때 코드 실행
			isRunning = true;
			status = "운행중";
			System.out.println("자동차가 시작되었습니다.");
		} else {                   // isRunning이  true일 때 코드 실행.
			System.out.println("자동차가 이미 시작되어 있습니다.");
		}
	}

	@Override
	public void stop() {
		if (isRunning) {
			isRunning = false;
			speed = 0;
			status = "정지중";
			System.out.println("자동차가 정지되었습니다.");
		} else {
			System.out.println("자동차가 이미 정지되어 있습니다.");
		}
	}

	@Override
	public void accelerate(int speed) {
		if (isRunning) {
			this.speed = this.speed + speed;
			System.out.println("자동차가" + speed + "km/h로 가속 중입니다.");
		} else {
			System.out.println("자동차가 정지 상태 입니다. 먼저 시작하세요.");
		}
	}

	@Override
	public void brake() {
		if (isRunning) {
			if (speed > 0) {
				speed -= 10;
				System.out.println("자동차가 감속 중입니다.");
			}
		} else if (speed <= 0) {
			System.out.println("자동차가 이미 정지되어 있습니다.");
		} else {
			System.out.println("자동차가 정지 상태입니다. 먼저 시작하세요.");
		}
	}

	@Override
	public String getInfo() {
		if (isRunning) {
			return "상태 : " + status + ", 현재 속도 : " + speed + "km/h";
		} else {
//			System.out.println("상태 : " + status + ", 현재 속도 : " + speed + "km/h");
			return "상태 : " + status + ", 현재 속도 : " + speed + "km/h";
		}
	}

}
