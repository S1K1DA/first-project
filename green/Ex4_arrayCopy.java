package kr.co.green;

public class Ex4_arrayCopy {

	public static void main(String[] args) {
		
		// 얕은 복사(Shallow Copy)
		int[] tempArr = new int[3];
		tempArr[0] = 10;
		tempArr[1] = 20;
		tempArr[2] = 30;
		
		int[] arr = tempArr;
		
//		tempArr = {10,20,30}  일거같은데?
//		arr = {10,20,30}X
		
		arr[1] = 999;
		 
//		tempArr = {10,20,30}   일거같은데?
//		arr = {10,999,30}
		
		tempArr[0] = 777;
	
//		tempArr = {777,20,30}    일거같은데?
//		arr = {10,999,30}
		
		for(int i=0; i<tempArr.length; i++) {
			System.out.println("원본 배열 : " + tempArr[i]);
			System.out.println("배열 : " + arr[i]);
			System.out.println();
		}
			
		
		// <깊은 복사(Deep Copy)>
		// 새로운 배열을 생서앟고 기존 배열의 데이터만 가져와서 넣는 방식
		int[] tempArr2 = {10, 20, 30}; // 배열 선언 및 할당
		int[] arr2 = new int[3]; // 배열 선언 및 할당
		
//		arr2[0] = tempArr[0];
//		arr2[1] = tempArr[1];
//		arr2[2] = tempArr[2];
		
        // for문을 활용
		for(int i=0; i<tempArr2.length; i++) {
			arr2[i] = tempArr2[i];
		}
		
		// arraycopy()를 활용한 방식
//		System.arraycopy(원본배열, 복사를 시작할 위치,저장할 배열, 저장을 시작할 위치, 복사할 요소의 개수)
        System.arraycopy(tempArr2, 0, arr2, 0, tempArr2.length);
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                                
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                           
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
