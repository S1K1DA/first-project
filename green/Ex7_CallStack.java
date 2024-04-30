package kr.co.green;

import java.util.Arrays;

public class Ex7_CallStack {

   public static void main(String[] args) {                                                            
      Ex7_CallStack cs = new Ex7_CallStack();
      
      
      // �⺻�� ����
      int num = 10;
      System.out.println("�޼ҵ� ȣ�� �� : " + num);
      cs.changeInt(num);
      System.out.println("�޼ҵ� ȣ�� �� : " + num);
      
      System.out.println("------------------------");
      
      // ������ ����
      int[] numArr = {10, 20, 30};
      System.out.println("�޼ҵ� ȣ�� �� : " + Arrays.toString(numArr));
      cs.changeArr(numArr);
      System.out.println("�޼ҵ� ȣ�� �� : " + Arrays.toString(numArr));
   }
   
   public void changeArr(int[] numArr) {
      numArr[1] = 1000;
      System.out.println("changeArr �޼ҵ� ȣ�� : " + Arrays.toString(numArr));
   }
   
   public void changeInt(int num) {
      num = 1000;
      System.out.println("changeInt �޼ҵ� ȣ�� : " + num);
   }

}
