package kr.co.green;

import java.util.Scanner;

public class Ex0_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Hello, World!");
	    
	    int varNum;  // ���� ���� : ���� varNum�̶�� ������ ����Ҳ���.
	    varNum = 100; // ���� �ʱ�ȭ : varNum�̶�� ������ ���� 100�� �����ϰڴ�.
	    
	    // System.out.println : Console�� ����� ���ִ� ����
	    System.out.println(varNum);
	    
	    int expNum = 200; // ����� �ʱ�ȭ: ���� ����� �ʱ�ȭ�� ���ÿ� �ϴ� ��
	    System.out.println("����� �ʱ�ȭ : " + expNum);
	    
	    long longNum = 123681684L;   // long ���� L�� �ٿ��ֱ� 
	    
	 //    <������ Ÿ���� ����>
	 // 1. ���� : boolean
//	             -> true �Ǵ� false
	 // 2. ������ : char
//	             -> ���� '��', '��', 'A', 'D'
	 // 3. ������ : byte, short, int, long
//	             -> 10, 300, 9800, ...
	 // 4. �Ǽ��� : float, double
//	             -> 8.7, 100.567, 1234.5678, ..
	    
	    
	    // (����)boolean : true �Ǵ� false
	    boolean varBoolean;
	    varBoolean = true;
	    System.out.println("boolean : " + varBoolean);
	    
	    // (������)char : ���� (�ѱ��ڸ� ����)
	    // 'A', 'B', '��', '��' : ����
	    //"AB", "CD", "����", "�ٶ�" : ���ڿ�
	    char varChar;
	    varChar = 'A';
	    System.out.println("char : " + varChar);
	    
	    // ������
	    byte varByte = 127;
	    
	    // �Ǽ���   float������� f�� ���� �Է����ֱ�
	    float varFloat = 1.123123123f;
	    System.out.println("float : " + varFloat);
	    
	    double varDouble = 1.123456789123456789;
	    System.out.println("double : " + varDouble);
	    
	    
	    // �����ڷ��� = ����������
	    String str = "ABCDEFG";
	    System.out.println("String : " + str);
	    
	    final int FINAL_NUMBER = 10;
	    System.out.println(FINAL_NUMBER);
	    //  FINAL_NUMBER = 20;  ����� �ѹ� �����ϰ� �ʱ�ȭ�ϸ� ������
	    
	    
	    
	    // ����ȯ
//	    byte�� �޸� ũ��� 1byte
	    byte bNum = 127;
	    int iNum = bNum; 
	    System.out.println(iNum);
	    
	    int iNum2 = 1234;
	    double dNum2 = iNum2;
	    System.out.println(iNum2);
	    System.out.println(dNum2);  
	    
	    double dNum3 = 1234.5678;
	    int iNum3 = (int)dNum3; // ��������ȯ
	    System.out.println(iNum3);
	    
	    
	    // ���� �ڷ��� -> ū �ڷ������� ���� ������ �ڵ� ����ȯ
	    char ch = 'a'; // char : 2byte    
	    int num = ch; // int : 4byte
	    
	    System.out.println(num);
	    
	    
	    // <���� ����>
	    // 1. ���� : ��� ���� ������ �� �ִ� ����
	    // 2. ���� ���� :  �ڷ��� ������;
	    //     ex) int num;
	    // 3. ���� �ʱ�ȭ : ������ = ��;
	    //     ex) num = 10;
	    // 4. ����� �ʱ�ȭ : �ڷ��� ������ = ��;
	    //     ex) int num = 10;
	    
	    // <�ڷ���>
	    // �⺻ �ڷ���   -----------  ���� �ڷ���
	    //   ����              �⺻�ڷ��� 8�� ���� ��
	    //   ������
	    //   ������
	    //   �Ǽ���
	    
	    // ���� : boolean(1byte)
	    //        -> true   or   false
	    // ������ : char (2byte)
	    //        -> ���� �ϳ�(�ѱ���)
	    // ������ : byte   (1byte)  
	    //         short (2byte)  
	    //         int   (4byte)  
	    //         long  (8byte)  
	    //      -> ����(����)
	    // �Ǽ��� : float  (4byte)
	    //         double (8byte)
	    //        -> �Ǽ�
	    
	    // <���̹� ��Ģ>
	    // 1. ��ҹ��� ����
	    // 2. ���������� ī�� ǥ���(��Ÿ ǥ���)�� ���
	    //     ex) user + name --> userName
	    
	    // <����ȯ>
	    // ũ�Ⱑ ���� �ڷ��� - > ũ�Ⱑ ū �ڷ���  : �ڵ� ����ȯ
	    // ũ�Ⱑ ū �ڷ��� -> ũ�Ⱑ ���� �ڷ��� :  ���� ����ȯ
	    
	    // ū �ڷ������� ���� �ڷ������� ������ Ÿ���� �����ϸ�
//	       ������ �ս��� ������ �ֱ� ������ �ڵ����� ���� ����
//	       �̷� ��쿡�� �����ڰ� ������ ������ Ÿ���� ���� ���־�� �� ->���� ����ȯ
	    
	    // ���� �ڷ������� ū �ڷ������� ������ Ÿ���� �����ϸ�
//	    ������ �ս��� ������ ���� ������ �ڵ����� ������ Ÿ���� ���� �� -> �ڵ� ����ȯ
	    
	    // ��ĳ��
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("���̸� �Է��ϼ���: ");
	    int age = sc.nextInt();
	    System.out.println("�� ���̴� : " + age);
	    sc.nextLine();
	    
	    System.out.print("�̸��� �Է��ϼ���: ");
	    String name = sc.nextLine();
	    System.out.print("�� �̸��� : " + name + "\n");
	    
	    
	    System.out.println("\"Hello, World\"");
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
