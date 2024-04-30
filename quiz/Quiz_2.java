package kr.co.quiz;

public class Quiz_2 {

	public static void main(String[] args) {

		
//		
//		● int[] arr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
//
//		주어진 배열을 생성하고 아래의 조건에 만족하는 값을 출력하는 프로그램을 작성하세요.
//
//		1-1) 배열 요소의 합계를 출력하세요.
//		1-2) 배열의 요소 중 짝수가 몇 개인지 출력하세요.
//		1-3) 배열의 요소 중 3의 배수를 모두 출력하세요.
//		1-4) 배열의 요소 중 가장 작은 값을 출력하세요.
//		1-5) 2-4에서 확인한 가장 작은 값이 몇 번 인덱스에 있는지 출력하세요.
//		
//		
		
		
		
		int[] arr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
		
		
//		1-1) 배열 요소의 합계를 출력하세요.
		int sum = 0;
			for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
				}
		
		System.out.println("배열의 합 : "+ sum);
		System.out.println();
		
//		1-2) 배열의 요소 중 짝수가 몇 개인지 출력하세요.
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				count++;
		}
		}
		
		
		System.out.println("짝수의 개수 : " + count);
		System.out.println();
		 
		
		
		
		
		
		
//		1-3) 배열의 요소 중 3의 배수를 모두 출력하세요.
		for(int i=0; i<10; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println("3의 배수 : " + arr[i]);
			}
		}
		System.out.println();
		
		
		
		
//		1-4) 배열의 요소 중 가장 작은 값을 출력하세요.
		
		int max = 1;
		int min = 101;
		
		for (int j=1; j<arr.length; j++) {
			if(min > arr[j]) {
				count ++;
				min = arr[j];
			}
		}
		System.out.println("4번 최소값  : " + min);
		System.out.println();
			
		
		
		
		
		int count1 = 0;
		
//		1-5) 1-4에서 확인한 가장 작은 값이 몇 번 인덱스에 있는지 출력하세요.
		int[] arrr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
		
		for(int z=0; z<arrr.length; z++) {
			if(arrr[z] == min) {
				z = count1++;
			}
		}
		System.out.println("몇번 : " + count1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
