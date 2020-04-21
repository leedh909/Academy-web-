package com.collection.part03_map.hashmap.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public void testHashMap() {
		
		HashMap hmap = new HashMap();
//		Map hmap2 = new HashMap();
//		Collection hmap3 = new HashMap(); //Collection의 하위 객체가 아니므로 오류가 뜬다.
		
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		
		System.out.println("hmap: "+hmap);
		
		//key값은 중복허용X(set의 특징과 비슷) : 최근 키값으로 덮어씌어 진다.
		hmap.put(12, "yellow banana");
		System.out.println("hmap : "+hmap);
		
		//value값은 중복혀용한다.(list의 특징과 비슷)
		hmap.put(11,"yellow banana");
		hmap.put(9,"yellow banana");
		System.out.println("hmap: "+hmap);
		
		
		//각 객체의 내용을 가져 오기
		System.out.println("키가 9인 객체: "+hmap.get(9));
		
		//삭제
		hmap.remove(9);
		System.out.println("hmap: "+hmap);
		
	}
	
	public void testHashMap2() {
		
		HashMap hmap = new HashMap();
		hmap.put("one","java");
		hmap.put("two", "oracle");
		hmap.put("three","jdbc");
		hmap.put("four","html5");
		hmap.put("five", "css3");
		
		//Map의 데이터 접근하는 방법
		//1.keySet()
//		Set keys = hmap.keySet();
//		Iterator keyIter = keys.iterator();
//		while(keyIter.hasNext()) {
//			String key=(String)keyIter.next();
//			String val = (String)hmap.get(key);
//			System.out.println(key +" = "+val);
//		}
		
//		System.out.println("-----------------------------------");
//		
//		//2.저장된 value값들만 values()를 이용해 Collection으로 만든다.
//		Collection values = hmap.values();
//		//2.1 Iterator()
//		Iterator valIter = values.iterator();
//		while(valIter.hasNext()) {
//			System.out.println(valIter.next());
//		}
//		
//		//2.2 배열로 만들어서 처리
//		Object[] valArr = values.toArray();
//		for(int i=0;i<valArr.length;i++) {
//			System.out.println(i+" : "+valArr[i]);
//		}
//		
//		//3.Map 내부 클래스인 EntrySet을 이용 
//		Set set = hmap.entrySet();
//		Iterator entryIter = set.iterator();
//		while(entryIter.hasNext()) {
//			Map.Entry entry = (Map.Entry)entryIter.next();
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
