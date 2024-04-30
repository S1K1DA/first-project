package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex14_Collection {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();   // ��ü ����
		
		// add(��) :������ �߰�
		integerList.add(10);
		integerList.add(20);
		integerList.add(20);
		
		// size() : ArrayList�� ����
		for(int i=0; i<integerList.size(); i++) {
			// ���� ���� �迭 : �迭��[i];
			// ArrayList : ������.get(�ε���);
			System.out.println(integerList.get(i));
		}
		
		for(Integer item : integerList) {
			System.out.println(item);
		}
		
		
		// set(�ε���, ��) : ������ ����
		integerList.set(1, 50);
		System.out.println(integerList);
		
		// remove(�ε���) : ������(���) ����
		integerList.remove(1);
		System.out.println(integerList);
		
		
		// clear() : ��ü ����
		integerList.clear();
		System.out.println(integerList);
		
		
		// isEmpty() : �迭�� ����� ������ true, ��������������� false
		System.out.println(integerList.isEmpty());
		
		
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		linked.add(10);
		linked.add(20);
		
		linked.addFirst(100);
		
		linked.addLast(200);
		
		linked.add(1, 500);
		
		System.out.println(linked);
		
		
		
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs);
		
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		// String : key�� ������ Ÿ��
		// Integer :  value�� ������ Ÿ��
		// ex) "���� ����" : 50, "���� ����" : 70        
		
		hm.put("���� ����", 50);
		hm.put("���� ����", 70);
		hm.put("���� ����", 60);
		
		System.out.println(hm.keySet());
		System.out.println();
		if(hm.containsKey("���� ����")) {
			System.out.println("--------------------------");
			System.out.println(hm.get("���� ����"));
			System.out.println("--------------------------");
		}
		
		
		
		for(String key : hm.keySet()) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
