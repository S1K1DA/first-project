package kr.co.quiz2;

public class Ex1 {

	public static void main(String[] args) {
		
//		<Ex 1 - ����>
//		1) ������ ���� age�� �����ϰ� �� 25�� �Ҵ��ϼ���.
//		2) �Ǽ��� ���� weight�� �����ϰ� �� 68.5�� �Ҵ��ϼ���.
//		3) ������ ���� grade�� �����ϰ� �� 'A'�� �Ҵ��ϼ���.
//		4) ���� ���� isMale�� �����ϰ� �� true�� �Ҵ��ϼ���.
//		5) ���ڿ� ���� name�� �����ϰ� �� "John Doe"�� �Ҵ��ϼ���.
//		    -> ���ڿ��� ���̸� ����ϼ���.
//		    -> ���ڿ��� ù ��° ���ڸ� ����ϼ���.
//		    -> ���ڿ��� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		int age = 25;
		double weight = 68.5;
		char grade = 'A';
		boolean isMale = true;
		String name = "John Doe";
		
		char firstChar = name.charAt(0); // ���ڿ� ù��° ���� ��¹�
		String upperCaseStr = name.toUpperCase();
		
		System.out.println("���ڿ��� ���� : " + name.length());
		System.out.println("���ڿ� ù��° ���� : " + firstChar);
		System.out.println("���ڿ� ��繮�� �빮�� : " + upperCaseStr);
		
//		<Ex 2  - ������>
//		1) ���� x�� �����ϰ� �� 10�� �Ҵ��ϼ���.
//		2) ���� y�� �����ϰ� �� 5�� �Ҵ��ϼ���.
//		3) ���� sum�� �����ϰ� x�� y�� ���� ���� �����ϼ���.
//		4) ���� difference�� �����ϰ� x�� y�� �� ���� �����ϼ���.
//		5) ���� product�� �����ϰ� x�� y�� ���� ���� �����ϼ���.
//		6) ���� quotient�� �����ϰ� x�� y�� ���� ���� �����ϼ���.
//		7) ���� remainder�� �����ϰ� x�� y�� ���� ������ ���� �����ϼ���.
		
		int x = 10;
		int y = 5;
		int sum = x+y;
		int difference = x - y;
		int product = x * y;
		int quotient = x / y;
		int remainder = x % y;
		
		System.out.println();
		
//		<Ex 3 - ���ǹ�>
//		1) ���� num�� �����ϰ� �� 53�� �Ҵ��ϼ���.
//		    �Ʒ��� ���ǿ� �����ϴ� ���ǹ��� �ۼ��ϼ���.
//		 -> num�� 0���� ũ�ų� �����ϴ�. �׸��� num�� 10���� �۽��ϴ�.
//		 -> num�� 10�� ���ų� Ů�ϴ�. �׸��� 20���� �۽��ϴ�.
//		 -> num�� 50���� �۽��ϴ�. �Ǵ� 60���� ũ�ų� �����ϴ�.
//		 -> �� ���� ��쿡�� "else"�� ����մϴ�.
		
		int num = 53;
		
		if(num >= 0 && num < 10) {
		}
		if(num>=10 && num<20) {
		}
		if(num<50 || num>=60) {
		} else {
		}
		
		System.out.println();
		
//		<Ex 4 - �ݺ���>
//		1) hieght = 5 �� �� �Ʒ��� ����⸦ �����ϼ���.
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		<Ex 5 ~1)
//		1) ���ڿ� �� ���� �����ϴ� �޼��� concat(String str1, String str2)�� ���ڿ� �� ���� �����ϴ� 
//        �޼��� concat(String str1, String str2, String str3)�� �����ϰ�, 
//        ������ �޼��带 Ȱ���Ͽ� ���ڿ��� �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		Ex1 od = new Ex1();
		
		od.concat("qwdqwd", "qwfgas");
		od.concat("ASD", "!@!@#", "ASASGASA");
		System.out.println();
		
//		public void concat() {
//		}
//		
//		public void concat(String str1, String str2) {
//			System.out.println(str1 + str2);
//		}
//		public void concat(String str1, String str2, String str3) {
//			System.out.println(str1 + str2 +str3);
//		}
	
		
		
		
		
		
//		2) ���ڿ��� �ݺ� Ƚ���� �Է¹޾� �ش� ���ڿ��� �Էµ� �ݺ� Ƚ����ŭ �ݺ��� ����� ��ȯ�ϴ� repeatString �޼��带 �ۼ��ϼ���. 
//		�׸��� ���� �̸��� �޼��带 ����Ͽ� ���ڿ��� �Է¹޾��� ���� �� ���� �ݺ��ϵ��� �ϰ�, 
//		�ݺ� Ƚ���� �Է¹��� �ʾ��� ���� ���� �޽����� ����ϵ��� �����ε��ϼ���.
//		    public static void main(String[] args) {
//		        // ���ڿ��� �ݺ� Ƚ���� �Է¹޾� �ش� ���ڿ��� �Էµ� �ݺ� Ƚ����ŭ �ݺ��� ����� ��ȯ
//		        String repeatedString = repeatString("Hello ", 3);
//		        System.out.println(repeatedString); // ���: Hello Hello Hello 
//
//		        // ���ڿ��� �Է¹޾��� ���� �� ���� �ݺ��ϵ��� �����ε�
//		        String singleRepeat = repeatString("Hi");
//		        System.out.println(singleRepeat); // ���: Hi
//
//		        // �ݺ� Ƚ���� �Է¹��� �ʾ��� ���� ���� �޽����� ����ϵ��� �����ε�
//		        String errorMessage = repeatString();
//		        System.out.println(errorMessage); // ���: �ݺ� Ƚ���� �Է����ּ���.
//		    }
		
		od.repeatedString("Hello", 4);
		od.singleRepeat("Hi");
		od.errorMessage();
		
		System.out.println();
		
		
		

//      3). ���� �����
//      1. int[] numbers = {50, 5, 8, 132, 15} �迭�� Ȱ��
//      2. numbers�� ��� ������ ���� ��ȯ�ϴ� int sum() �޼ҵ� ����
//      3. numbers�� ��� ������ ���� ��ȯ�ϴ� int product() �޼ҵ� ����
//      4. numbers�� ���� ū ������ ��ȯ�ϴ� int max() �޼ҵ� ����
//      5. numbers�� ���� ���� ������ ��ȯ�ϴ� int min() �޼ҵ� ����
	  
//		
//		public int sum(int[] numbers) {
//		}
		
		int[] numbers = {50, 5, 8, 132, 15};
		
//		�迭�� ��
		int sum1 = 0;
		
		for(int i=0; i<numbers.length; i++) {
		sum1 += numbers[i];
			}
		System.out.println("�迭�� �� : " + sum1);
		
//		�迭�� ��
		int prodect = 1;
		for(int i=0; i<numbers.length; i++) {
			prodect = prodect * numbers[i];
				}
		System.out.println("�迭�� �� : " + prodect);
		
//		�迭���� ���� ū ���� �� ���� ���� ���ϱ�
		
		
		int min = 101;
		int max = 1;
		int count = 0;
		// ���� ���� ����
		for(int i=0; i<numbers.length; i++) {
			if(min > numbers[i]) {
				count++;
				min = numbers[i];
			}
		}
		System.out.println("���� ���� ���� : " + min);
		for(int i=0; i<numbers.length; i++) {
			if(max <numbers[i]) {
				count++;
				max = numbers[i];
			}
		}
		System.out.println("���� ū ���� : " + max);
		System.out.println();
		
		
		
//		5-4) ������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Ex1_1_InternetUser user1 = new Ex1_1_InternetUser("����","bamtol2100@naver.com");
		System.out.println("---���ͳ� ����� ����---");
		user1.displayUserInfo();
		System.out.println();
		
		Ex1_1_PremiumUser premium1 = new Ex1_1_PremiumUser("����","bamtol2100@naver.com",12);
		
		System.out.println("---�����̾� ����� ����---");
		premium1.displayUserInfo();    
		premium1.displayMembershipPeriod();
		
		System.out.println();
		
		
		
		
		
		
//		5-5)  �������� ������ �� �ִ� ���α׷��� �ۼ��ϼ���.
		
		Ex1_2_Employee p1 = new Ex1_2_Employee("����","Manager",50000);
		Ex1_2_Employee p2 = new Ex1_2_Employee("����","Developer",40000);
		
		System.out.println("---���� 1 ����---");
		p1.displayEmployeeInfo();
		System.out.println();
		
		System.out.println("---���� 2 ����---");
		p2.displayEmployeeInfo();
		System.out.println();
		
		System.out.println("---������ ���� �λ�---");
		p1.raiseSalary(30000);
		System.out.println();
		
		System.out.println("---���� 1 ����(�λ���)---");
		p1.displayEmployeeInfo();
		System.out.println();
		
		
//	    [6]  main �޼��忡�� SportsCar�� RegularCar�� ��ü�� �����ϰ� �޼��带 ��� �����ϼ���.
		
		Ex1_3_SportsCar Scar = new Ex1_3_SportsCar();  //��ü ����
		Ex1_3_RegularCar Rcar = new Ex1_3_RegularCar();
		
		System.out.println("----�Ϲ� �ڵ���----");
		Rcar.start();
		Rcar.accelerate();
		Rcar.brake();
        System.out.println();		
		System.out.println("----������ ī----");
		Scar.start();
		Scar.accelerate();
		Scar.brake();
		System.out.println();
		
		
		
		
		
		
		
		
		

	
		
	


		
		
	}
	
	
//	 5-1
	public void concat() {
	}
	
	public void concat(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	public void concat(String str1, String str2, String str3) {
		System.out.println(str1 + str2 +str3);
	}
	
	
//	5-2
	public void errorMessage() {
		System.out.println("�ݺ� Ƚ���� �Է����ּ���.");
	}
	public void singleRepeat(String str1) {
		System.out.println(str1);
	}
	public void repeatedString(String str1,int num) {
		for(int i = 0; i<num; i++) {
		 System.out.print(str1+" ");
		}
		System.out.println();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
