package kr.co.quiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {
		
		ArrayList<OrderDTO> orderList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int orderCounter = 1;
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("1. �ֹ� �Է�");
			System.out.println("2. �ֹ� ��� ���");
			System.out.println("3. ����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("�ֹ��� �̸� : ");
				String name = sc.nextLine();
				
				System.out.println("�ֹ� ��ǰ : ");
				String art = sc.nextLine();
				
				OrderDTO o = new OrderDTO(name,orderCounter, art);
				orderList.add(o);
				
				orderCounter++;
				System.out.println(name + "���� �ֹ��� �����Ǿ����ϴ�.");
				
				break;
			case 2:
//				int totalOrder = 0;
					if(orderList.isEmpty()) {
						System.out.println("�ֹ� ����� ����ֽ��ϴ�.");
					} else {
						for(OrderDTO o1 : orderList) {
							System.out.println("�ֹ� ��ȣ : "+ o1.getOrderNumber());
							System.out.println("�ֹ��� �̸� : " +o1.getCustomerName());
							System.out.println("�ֹ� ��ǰ : "+ o1.getOrderItem());
							
						}
					}
					break;
				
//				orderList�� ������� ��� ���ֹ� ����� ��� �ֽ��ϴ�.�� ���
//				������� ���� ��� ��ü �ֹ� ���(orderList)�� ���� �ֹ��� �̸�, �ֹ� ��ȣ, �ֹ� ��ǰ�� ����մϴ�.
			case 3:
				System.out.println("���α׷� �����մϴ�.");
				sc.close();
				isTrue = false;
//				�����α׷��� �����մϴ�.�� ��� �� �����մϴ�.
				break;
				
				
			default:
				System.out.println("�������� �ʴ� �޴��Դϴ�.");
//				���������� �ʴ� �޴��Դϴ�.�� ��� �� ó�� �޴��� ���ư��ϴ�
			}
		}
	}
}
