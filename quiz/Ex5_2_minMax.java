package kr.co.quiz;

public class Ex5_2_minMax {

	
	// �ּڰ��� ���ϴ� �޼ҵ�
	   // �Ű����� : �迭(int[] ������)
	// �ּڰ��� ���ϰ�
	// ���� ���� return
	   
	   public int min(int[] numbers) {
		   int min = numbers[0];
	    for(int i=0; i<numbers.length; i++) {
	    	if(min > numbers[i]) {
	    		min = numbers[i];
	    	}
	    }
	    return min;
	    	
	   }
	   
	   public int max(int[] numbers) {
		   int max = numbers[0];
		   for(int i=0; i<numbers.length; i++) {
			   if(max < numbers[i]) {
				   max = numbers[i];
			   }
		   }
		   return max;
	   }
	   
	   public int getMin(int num1, int... num2) {
		   System.out.println(num1 + " " + num2);
		   for(int num : num2) {
			   System.out.println(num);
		   }
	    	return 0;
	   }
	   
	   public int getMax(int[] numbers) {
		   int max = numbers[0];
		   for(int i=0; i<numbers.length; i++) {
			   if(max < numbers[i]) {
				   max = numbers[i];
			   }
		   }
		   return max;
	   }
		   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
