package kr.co.green;

public class Ex4_arrayCopy {

	public static void main(String[] args) {
		
		// ���� ����(Shallow Copy)
		int[] tempArr = new int[3];
		tempArr[0] = 10;
		tempArr[1] = 20;
		tempArr[2] = 30;
		
		int[] arr = tempArr;
		
//		tempArr = {10,20,30}  �ϰŰ�����?
//		arr = {10,20,30}X
		
		arr[1] = 999;
		 
//		tempArr = {10,20,30}   �ϰŰ�����?
//		arr = {10,999,30}
		
		tempArr[0] = 777;
	
//		tempArr = {777,20,30}    �ϰŰ�����?
//		arr = {10,999,30}
		
		for(int i=0; i<tempArr.length; i++) {
			System.out.println("���� �迭 : " + tempArr[i]);
			System.out.println("�迭 : " + arr[i]);
			System.out.println();
		}
			
		
		// <���� ����(Deep Copy)>
		// ���ο� �迭�� �����۰� ���� �迭�� �����͸� �����ͼ� �ִ� ���
		int[] tempArr2 = {10, 20, 30}; // �迭 ���� �� �Ҵ�
		int[] arr2 = new int[3]; // �迭 ���� �� �Ҵ�
		
//		arr2[0] = tempArr[0];
//		arr2[1] = tempArr[1];
//		arr2[2] = tempArr[2];
		
        // for���� Ȱ��
		for(int i=0; i<tempArr2.length; i++) {
			arr2[i] = tempArr2[i];
		}
		
		// arraycopy()�� Ȱ���� ���
//		System.arraycopy(�����迭, ���縦 ������ ��ġ,������ �迭, ������ ������ ��ġ, ������ ����� ����)
        System.arraycopy(tempArr2, 0, arr2, 0, tempArr2.length);
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                           
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
