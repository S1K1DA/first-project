package kr.co.quiz;

public class Quiz_2 {

	public static void main(String[] args) {

		
//		
//		�� int[] arr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
//
//		�־��� �迭�� �����ϰ� �Ʒ��� ���ǿ� �����ϴ� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//		1-1) �迭 ����� �հ踦 ����ϼ���.
//		1-2) �迭�� ��� �� ¦���� �� ������ ����ϼ���.
//		1-3) �迭�� ��� �� 3�� ����� ��� ����ϼ���.
//		1-4) �迭�� ��� �� ���� ���� ���� ����ϼ���.
//		1-5) 2-4���� Ȯ���� ���� ���� ���� �� �� �ε����� �ִ��� ����ϼ���.
//		
//		
		
		
		
		int[] arr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
		
		
//		1-1) �迭 ����� �հ踦 ����ϼ���.
		int sum = 0;
			for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
				}
		
		System.out.println("�迭�� �� : "+ sum);
		System.out.println();
		
//		1-2) �迭�� ��� �� ¦���� �� ������ ����ϼ���.
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				count++;
		}
		}
		
		
		System.out.println("¦���� ���� : " + count);
		System.out.println();
		 
		
		
		
		
		
		
//		1-3) �迭�� ��� �� 3�� ����� ��� ����ϼ���.
		for(int i=0; i<10; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println("3�� ��� : " + arr[i]);
			}
		}
		System.out.println();
		
		
		
		
//		1-4) �迭�� ��� �� ���� ���� ���� ����ϼ���.
		
		int max = 1;
		int min = 101;
		
		for (int j=1; j<arr.length; j++) {
			if(min > arr[j]) {
				count ++;
				min = arr[j];
			}
		}
		System.out.println("4�� �ּҰ�  : " + min);
		System.out.println();
			
		
		
		
		
		int count1 = 0;
		
//		1-5) 1-4���� Ȯ���� ���� ���� ���� �� �� �ε����� �ִ��� ����ϼ���.
		int[] arrr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
		
		for(int z=0; z<arrr.length; z++) {
			if(arrr[z] == min) {
				z = count1++;
			}
		}
		System.out.println("��� : " + count1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
