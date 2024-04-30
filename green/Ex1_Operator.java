package kr.co.green;

public class Ex1_Operator {

	public static void main(String[] args) {
		int result;
		int firstNumber = 50;
		int secondNumber = 20;
		
		//            50    +     20
		result = firstNumber+secondNumber;
		System.out.println("���� ��� : " + result);
		
		result = firstNumber*secondNumber;
		System.out.println("���� ��� : " + result);
		
		result = firstNumber/secondNumber;
		System.out.println("������ ��� : " + result);
		
		result = firstNumber-30;
		System.out.println("���� ��� : " + result);
		
		System.out.println(10+30*5);
		
		
		// ���� ������
		// ++ : 1 ����
		// -- : 1 ����
		// <���� ���� ������>
		int x = 10;
		x++; // 1����
		System.out.println(x); // 11
		 
		x--; // 1����
		System.out.println(x); // 10
		
		// <���� ���� ������>
		int y = 10;
		++y; // 1����
		System.out.println(y);  // 11
		
		--y; // 1����
		System.out.println(y);  // 10
		
		
		// <������>
		
		int z = 10;
		
		// println ���� -> z ���� 1����
		// 1. println�� ����Ǹ鼭 "���� ������ : 10" ���
		// 2. z ������ ���� 1����(11) 
		// 3. ���� println�� ����Ǹ鼭 "���� �� : 11" ���
		System.out.println("���� ���� ������ : " + z++); // 10 
		// z = z+1;
		System.out.println("���� �� : " + z); // 11
		
		// z���� 1���� -> println ����
		// 1. z ������ ���� 1����(12)
		// 2. println�� ����Ǹ鼭 "���� ���� ������ : 12" ���
		// 3. println�� ����Ǹ鼭 "���� �� : 12" ���
		
		// z = z+1;
		System.out.println("���� ���� ������ : " + ++z); // 12
		System.out.println("���� �� : " + z); // 12
		
		// firstNumber = 50;  , secondNumber = 20;
		System.out.println(10 < 5);  //false
		System.out.println(firstNumber > secondNumber);  //true
		System.out.println(firstNumber == 50);  // true
		
		String firstStr = "hi";
		String secondStr = new String("hi");
		System.out.println(firstStr == secondStr); // false
		
		// ���ڿ� ���Ҷ� : equals �޼ҵ� ���
		
		// equals : �� ���� ���ڿ��� ������true, �ٸ��� false
		
		// �����ڰ� �� ���� ���ڿ��� �ٸ��� true, ������ false�� ��ȯ�ϰ� �ʹ�
		// -> �� ���� ������(!)���
		System.out.println(firstStr.equals(secondStr));  //true
		
	    boolean isTrue = true;
	    System.out.println(!isTrue); // isTrue�� true�ε� !�پ� false
	    
	    
	    System.out.println(10>5 && 20!=20); //false
	    System.out.println(10>5 || 20!=20); //true
	    
	    
	    int a = 10;
	    int b = 5;
	    // ���ǽ� ? true�� �� ������ �ڵ� : false�� �� ������ �ڵ�
	    System.out.println(a>b ? a+10 : a-10);
	   
	    
	    
		
		
		
		
		
		

	}

}
