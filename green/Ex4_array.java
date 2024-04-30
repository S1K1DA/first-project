package kr.co.green;

public class Ex4_array {

	public static void main(String[] args) {
		
		// <배열 선언>
		// 1. 자료형[] 배열명;                       <-- (사용권장)
		// 2. 자료형 배열명[];
		int[] numbers;
		
		// <배열 할당>
		// 1. 자료형[] 배열명 = new 자료형[배열크기]      <-- (사용권장)
		// 2. 자료형 배열명[] = new 자료형[배열크기]
		int[] numbers2 = new int[5];
		
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        
        // <for문을 활용해서 위의 코드를 만듬>
        int value = 10;
        
        for(int i=1; i<6; i++) {
        	numbers2[i-1] = i*10;
        }
        
        
        
        for(int i=0; i<5; i++) {  // i: 0~4
        	//i가 0일 때 : numbers2[0] = 10;
        	//i가 1일 때 : numbers2[0] = 20;
        	//i가 2일 때 : numbers2[0] = 30;
        	//i가 3일 때 : numbers2[0] = 40;
        	//i가 4일 때 : numbers2[0] = 50;
			numbers2[i] = value;
			
			
			//i가 0일 때 : value = 20 
			//i가 1일 때 : value = 30
			//i가 2일 때 : value = 40
			//i가 3일 때 : value = 50
			//i가 4일 때 : value = 60
			value = value + 10;
			
        } 
		
        
        // <배열의 명시적 초기화>
        int[] numbers3 = {10, 20, 30, 40, 50};
//        또는
//        int[] numbers3 = new int[] {10, 20, 30, 40, 50};
        
        
        System.out.println(numbers3[2]);
		                                                                                             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
