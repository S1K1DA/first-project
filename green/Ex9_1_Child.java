package kr.co.green;

public class Ex9_1_Child extends Ex9_1_Parent {
	
	public String childVar = "�ڽĺ���";
	
	public void childMethod() {
		System.out.println("�ڽ� Ŭ����");
		String str1 = "a";
		String str2 = "b";
		str1.equals(str2);
		
	}
	
	@Override
	public void parentMethod() {
		//������
		System.out.println("���ٶ��̵��� �޼���");
	}
	

}
