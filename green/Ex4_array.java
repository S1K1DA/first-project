package kr.co.green;

public class Ex4_array {

	public static void main(String[] args) {
		
		// <�迭 ����>
		// 1. �ڷ���[] �迭��;                       <-- (������)
		// 2. �ڷ��� �迭��[];
		int[] numbers;
		
		// <�迭 �Ҵ�>
		// 1. �ڷ���[] �迭�� = new �ڷ���[�迭ũ��]      <-- (������)
		// 2. �ڷ��� �迭��[] = new �ڷ���[�迭ũ��]
		int[] numbers2 = new int[5];
		
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        
        // <for���� Ȱ���ؼ� ���� �ڵ带 ����>
        int value = 10;
        
        for(int i=1; i<6; i++) {
        	numbers2[i-1] = i*10;
        }
        
        
        
        for(int i=0; i<5; i++) {  // i: 0~4
        	//i�� 0�� �� : numbers2[0] = 10;
        	//i�� 1�� �� : numbers2[0] = 20;
        	//i�� 2�� �� : numbers2[0] = 30;
        	//i�� 3�� �� : numbers2[0] = 40;
        	//i�� 4�� �� : numbers2[0] = 50;
			numbers2[i] = value;
			
			
			//i�� 0�� �� : value = 20 
			//i�� 1�� �� : value = 30
			//i�� 2�� �� : value = 40
			//i�� 3�� �� : value = 50
			//i�� 4�� �� : value = 60
			value = value + 10;
			
        } 
		
        
        // <�迭�� ����� �ʱ�ȭ>
        int[] numbers3 = {10, 20, 30, 40, 50};
//        �Ǵ�
//        int[] numbers3 = new int[] {10, 20, 30, 40, 50};
        
        
        System.out.println(numbers3[2]);
		                                                                                             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
