package kr.co.quiz;

public class Ex8_1_Product {
	// 인스턴스 변수 성언
	// name :  상품 이름
	// price : 상품 가격
	// count : 상품 수량
	String name;
	int price;
	int count;
	
	
	// 기본생성자와 매개변수 있는 생성자를 만들껀데
	// 매개변수 있는 생성자는 아래의 조건에 맞춰 직상
	public Ex8_1_Product() {}
	
	
	public Ex8_1_Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public Ex8_1_Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
	
	
	
}	
	
	
	// 1. name, price, count를 받는 생성자
	// 2. name, price를 받는 생성자

