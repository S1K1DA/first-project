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
			System.out.println("1. 주문 입력");
			System.out.println("2. 주문 목록 출력");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("주문자 이름 : ");
				String name = sc.nextLine();
				
				System.out.println("주문 물품 : ");
				String art = sc.nextLine();
				
				OrderDTO o = new OrderDTO(name,orderCounter, art);
				orderList.add(o);
				
				orderCounter++;
				System.out.println(name + "님의 주문이 접수되었습니다.");
				
				break;
			case 2:
//				int totalOrder = 0;
					if(orderList.isEmpty()) {
						System.out.println("주문 목록이 비어있습니다.");
					} else {
						for(OrderDTO o1 : orderList) {
							System.out.println("주문 번호 : "+ o1.getOrderNumber());
							System.out.println("주문자 이름 : " +o1.getCustomerName());
							System.out.println("주문 물품 : "+ o1.getOrderItem());
							
						}
					}
					break;
				
//				orderList가 비어있을 경우 “주문 목록이 비어 있습니다.” 출력
//				비어있지 않을 경우 전체 주문 목록(orderList)에 대해 주문자 이름, 주문 번호, 주문 물품을 출력합니다.
			case 3:
				System.out.println("프로그램 종료합니다.");
				sc.close();
				isTrue = false;
//				“프로그램을 종료합니다.“ 출력 후 종료합니다.
				break;
				
				
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
//				“존재하지 않는 메뉴입니다.” 출력 후 처음 메뉴로 돌아갑니다
			}
		}
	}
}
