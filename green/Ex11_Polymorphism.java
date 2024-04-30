package kr.co.green;

import java.util.ArrayList;

public class Ex11_Polymorphism {

	public static void main(String[] args) {
		
		Ex11_1_Animal a = new Ex11_1_Dog();
		a.makeSound();
//		                                    �迭�� ũ�⸦ ���������� �÷��ټ��־ ���̻����.
		ArrayList<Ex11_1_Animal> list = new ArrayList<>();
		list.add(new Ex11_1_Dog());
		list.add(new Ex11_1_Cat());
		
		
		for(Ex11_1_Animal animal : list) {
			animal.makeSound();
			
		}
		
		Ex11_1_Dog dog = new Ex11_1_Dog();
		dog.eat();
		dog.sleep();
		dog.makeSound();  // �������̵��� �޼�
		
		
		//dog Ŭ������ ������ �ִ� �޼���
		dog.brak();
		
		//�������� ����ȯ
		// ������Ÿ��(Ŭ������) ������ =  (��ȯ��Ÿ��)��ȯ�Һ���;
		Ex11_1_Animal animal = (Ex11_1_Animal)dog;
		
		//animal Ŭ������ ������ �ִ� �޼���
		animal.eat();
		animal.sleep();
		animal.makeSound();
		
		// dog Ŭ������ ������ �ִ� �޼���(��� �Ұ�)
//		animal.brak();
		
		Ex11_1_Dog dog2 = (Ex11_1_Dog)animal;
		// ��ӹ��� �޼���
		dog2.eat();
		dog2.sleep();
		dog2.makeSound();
		
		// dog�� ������ �ִ� �޼���
		dog2.brak();
		

	}

}
