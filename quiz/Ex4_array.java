package kr.co.quiz;

import java.util.Arrays;

public class Ex4_array {

	public static void main(String[] args) {

//		1. 5만큼의 길이를 가진 배열을 선언 및 할당하세요.
//		2. 위에서 선언 및 할당한 배열에 아래의 값으로 초기화 하세요.
//		   -> "A", "B", "CD", "E", "FG"
		

		String[] arr = new String[5];
//		String[] arr = new String[]{"A, B, CD, E, FG"};

		arr [0] = "A";
		arr [1] = "B";
		arr [2] = "CD";
		arr [3] = "E";
		arr [4] = "FG";
		
		// 첫번째 방법
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);
	    }
	    
	    // 두번째 방법
	    // 향상된 for문(=for each문)
	    for(String str : arr) {
	    	System.out.println(str);
	    }
	    
	    // 세번째 방법
	    System.out.println(Arrays.toString(arr));
		
//		----------------------------------------------------------------
//
//		3. 국어, 영어, 수학, 과학 점수를 배열을 만들어서 넣으세요.
//		  -> 국어 점수 : 85
//		  -> 영어 점수 : 80
//		  -> 수학 점수 : 90
//		  -> 과학 점수 : 88
//		4. 배열에 있는 값을 모두 합친 후 평균 점수를 출력하세요.
		
		int[] A = {85,80,90,88};
		
		System.out.println("국어 점수 : " + A[0]);
		System.out.println("영어 점수 : " + A[1]);
		System.out.println("수학 점수 : " + A[2]);
		System.out.println("과학 점수 : " + A[3]);
		int B = A[0] + A[1] + A[2]+ A[3];
		System.out.println("평균 점수 : " + (B/4));
//		System.out.println("평균 점수 : " + (A[0]+A[1]+A[2]+A[3])/4);  또 다른 방법
		
		
	
		
		
	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                                   
	}

}
