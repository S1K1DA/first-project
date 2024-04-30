package kr.co.quiz2;

public class Ex1_5_Carlmpl implements Ex1_5_Car {

	boolean isRunning = false; // ���� ���� ����
	int speed = 0; // �ڵ��� �ӵ�
	String status;

	@Override
	public void start() {
//		if(isRunnung == false) {
		if (!isRunning) {       // ���������� ���� isRunning�� false�� �� �ڵ� ����
			isRunning = true;
			status = "������";
			System.out.println("�ڵ����� ���۵Ǿ����ϴ�.");
		} else {                   // isRunning��  true�� �� �ڵ� ����.
			System.out.println("�ڵ����� �̹� ���۵Ǿ� �ֽ��ϴ�.");
		}
	}

	@Override
	public void stop() {
		if (isRunning) {
			isRunning = false;
			speed = 0;
			status = "������";
			System.out.println("�ڵ����� �����Ǿ����ϴ�.");
		} else {
			System.out.println("�ڵ����� �̹� �����Ǿ� �ֽ��ϴ�.");
		}
	}

	@Override
	public void accelerate(int speed) {
		if (isRunning) {
			this.speed = this.speed + speed;
			System.out.println("�ڵ�����" + speed + "km/h�� ���� ���Դϴ�.");
		} else {
			System.out.println("�ڵ����� ���� ���� �Դϴ�. ���� �����ϼ���.");
		}
	}

	@Override
	public void brake() {
		if (isRunning) {
			if (speed > 0) {
				speed -= 10;
				System.out.println("�ڵ����� ���� ���Դϴ�.");
			}
		} else if (speed <= 0) {
			System.out.println("�ڵ����� �̹� �����Ǿ� �ֽ��ϴ�.");
		} else {
			System.out.println("�ڵ����� ���� �����Դϴ�. ���� �����ϼ���.");
		}
	}

	@Override
	public String getInfo() {
		if (isRunning) {
			return "���� : " + status + ", ���� �ӵ� : " + speed + "km/h";
		} else {
//			System.out.println("���� : " + status + ", ���� �ӵ� : " + speed + "km/h");
			return "���� : " + status + ", ���� �ӵ� : " + speed + "km/h";
		}
	}

}
