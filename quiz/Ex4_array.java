package kr.co.quiz;

import java.util.Arrays;

public class Ex4_array {

	public static void main(String[] args) {

//		1. 5��ŭ�� ���̸� ���� �迭�� ���� �� �Ҵ��ϼ���.
//		2. ������ ���� �� �Ҵ��� �迭�� �Ʒ��� ������ �ʱ�ȭ �ϼ���.
//		   -> "A", "B", "CD", "E", "FG"
		

		String[] arr = new String[5];
//		String[] arr = new String[]{"A, B, CD, E, FG"};

		arr [0] = "A";
		arr [1] = "B";
		arr [2] = "CD";
		arr [3] = "E";
		arr [4] = "FG";
		
		// ù��° ���
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);
	    }
	    
	    // �ι�° ���
	    // ���� for��(=for each��)
	    for(String str : arr) {
	    	System.out.println(str);
	    }
	    
	    // ����° ���
	    System.out.println(Arrays.toString(arr));
		
//		----------------------------------------------------------------
//
//		3. ����, ����, ����, ���� ������ �迭�� ���� ��������.
//		  -> ���� ���� : 85
//		  -> ���� ���� : 80
//		  -> ���� ���� : 90
//		  -> ���� ���� : 88
//		4. �迭�� �ִ� ���� ��� ��ģ �� ��� ������ ����ϼ���.
		
		int[] A = {85,80,90,88};
		
		System.out.println("���� ���� : " + A[0]);
		System.out.println("���� ���� : " + A[1]);
		System.out.println("���� ���� : " + A[2]);
		System.out.println("���� ���� : " + A[3]);
		int B = A[0] + A[1] + A[2]+ A[3];
		System.out.println("��� ���� : " + (B/4));
//		System.out.println("��� ���� : " + (A[0]+A[1]+A[2]+A[3])/4);  �� �ٸ� ���
		
		
	
		
		
	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                                   
	}

}
