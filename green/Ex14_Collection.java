package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex14_Collection {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();   // 객체 생성
		
		// add(값) :데이터 추가
		integerList.add(10);
		integerList.add(20);
		integerList.add(20);
		
		// size() : ArrayList의 길이
		for(int i=0; i<integerList.size(); i++) {
			// 원래 썻던 배열 : 배열명[i];
			// ArrayList : 변수명.get(인덱스);
			System.out.println(integerList.get(i));
		}
		
		for(Integer item : integerList) {
			System.out.println(item);
		}
		
		
		// set(인덱스, 값) : 데이터 수정
		integerList.set(1, 50);
		System.out.println(integerList);
		
		// remove(인덱스) : 데이터(요소) 삭제
		integerList.remove(1);
		System.out.println(integerList);
		
		
		// clear() : 전체 삭제
		integerList.clear();
		System.out.println(integerList);
		
		
		// isEmpty() : 배열이 비워져 있으면 true, 비워져있지않으면 false
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
		// String : key의 데이터 타입
		// Integer :  value의 데이터 타입
		// ex) "국어 점수" : 50, "영어 점수" : 70        
		
		hm.put("국어 점수", 50);
		hm.put("영어 점수", 70);
		hm.put("수학 점수", 60);
		
		System.out.println(hm.keySet());
		System.out.println();
		if(hm.containsKey("국어 점수")) {
			System.out.println("--------------------------");
			System.out.println(hm.get("국어 점수"));
			System.out.println("--------------------------");
		}
		
		
		
		for(String key : hm.keySet()) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
