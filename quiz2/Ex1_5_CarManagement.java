package kr.co.quiz2;

import java.util.Scanner;

public class Ex1_5_CarManagement {
	
	 public static void main(String[] args) {
	        Ex1_5_Car car = new Ex1_5_Carlmpl();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("�ڵ��� ���� ���α׷�");
	            System.out.println("1. �ڵ��� ����");
	            System.out.println("2. �ڵ��� ����");
	            System.out.println("3. �ڵ��� ����");
	            System.out.println("4. �ڵ��� ����");
	            System.out.println("5. �ڵ��� ���� ���");
	            System.out.println("6. ����");
	            System.out.print("�޴��� �����ϼ���: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Enter Ű ó��

	            switch (choice) {
	                case 1:
	                    car.start();
	                    break;
	                case 2:
	                    car.stop();
	                    break;
	                case 3:
	                    System.out.print("������ �ӵ��� �Է��ϼ���: ");
	                    int accelerateSpeed = scanner.nextInt();
	                    car.accelerate(accelerateSpeed);
	                    break;
	                case 4:
	                    car.brake();
	                    break;
	                case 5:
	                    System.out.println(car.getInfo());
	                    break;
	                case 6:
	                    System.out.println("���α׷��� �����մϴ�.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
	            }
	        }
	    }
	
}


