package kr.co.quiz;

public class Ex8_Constructor {

	public static void main(String[] args) {
		// 기본 생성자 호출후 name, price, count 출력
		// 매개변수 있는 생성자(1) 호출후 name, price, count 출력
		// 매개변수 있는 생성자(2) 호출후 name, price, count 출력

		
		Ex8_1_Product p1 = new Ex8_1_Product("사과",10000,5);
		System.out.println(p1.name+" " + p1.price + "원 " + p1.count+"개");
		
			
		Ex8_1_Product p2 = new Ex8_1_Product("사과",10000);
		System.out.println(p2.name+" " + p2.price + "원");
		
		
//		                                   내돈     모니터    마우스   데스크탑
		// Ex8_2_Buy 객체 생성 = 생성자 호출할 때 200000, 130000, 50000, 150000
		
		// buyMonitor, buyMouse, buyDesktop 메소드 아무거나 호출해보기
		
		Ex8_2_Buy B = new Ex8_2_Buy(200000,130000,50000,150000);
		
		B.buyMonitor();
		
		B.buyDesktop();
		
		B.buyMouse();
		
		Ex8_3_Student S = new Ex8_3_Student();
		Ex8_3_Student S1 = new Ex8_3_Student("시키",19,6,"2015203003");
		
		
		
		System.out.println("이름은 : " + S.name);
		System.out.println("나이는 : " + S.age);
		System.out.println("학년은 : " + S.grade);
		System.out.println("학번은 : " + S.studentNumber);
		
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.grade);
		System.out.println(S1.studentNumber);
		
		
		
		// 기본 생성자 x
		Ex8_4_Order o = new Ex8_4_Order();
		// setter 이용
		// 주문번호 : ORD123 , 주문금액 : 100.5   주만상태 : 처리중
		
		
		// getter로 값 하나씩 출력
		o.setOderNumber("ORD123");
		o.setOderAmount(100.5);
		o.setOderStatus("처리중");
//		System.out.println(o.getOderNumber());
//		System.out.println(o.getOderAmount());
//		System.out.println(o.getOderStatus());
		
		System.out.println();
		o.amountCheck(100);
		
		
		// Ex8_4_Order에 메소드를 만들껀데
		// amountCheck() 호출
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
