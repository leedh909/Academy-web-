package com.collection.part02_set.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public void testHashSet() {
		
		//Hashset
		HashSet hset = new HashSet();
		
		//다형성 적용
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.67));
		hset.add(new Date());
//		hset.add(1234);
//		hset.add(45.678);
		
		//저장 순서 유지 안된다.
		System.out.println("hset : "+hset);
		
		//중복 허용 안함.
		hset.add(new String("java"));
		hset.add(new Integer(123));
		System.out.println("hset1 : "+hset);
		System.out.println("저장된 객체수: "+hset.size());
		System.out.println("포함확인: "+hset.contains(new Integer(123)));
		
		System.out.println("-----------------------------------------");
		
		HashSet hset2 = new HashSet();
		hset2.add(new Score("이창진",99));
		hset2.add(new Score("홍길동",83));
		hset2.add(new Score("이순신",69));
		
		hset2.add(new Score("이창진",99));
		//hashcode와 equals 가 오버라이딩 되어 있어야지 주소값을 비교해도 값이 같다는걸 알수 있다.
		System.out.println("hset2 : "+hset2);
		
		
		//저장된 객체를 하나씩 꺼내기
		//set에서는 하나씩 꺼내는 기능 없다.
		//1.toArray()배열로 바꾸고 반복문 사용
		Object[] arr= hset.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" : "+arr[i]);
		}
		
		//2.Iterator()로 목록 만들어 처리
		Iterator iter = hset.iterator();
		//Iterator는 1회용짜리이다.
		while(iter.hasNext()) { //Stringtokenizer랑 비슷하다.
			System.out.println(iter.next());
		}
		System.out.println(hset.iterator().hashCode());
		
		//한번더 사용하려면 다시 지정해주어야한다.
//		Iterator iter2 = hset.iterator();
//		while(iter2.hasNext()) {
//			System.out.println("2: "+iter2.next());
//		}
//		System.out.println(hset.iterator().hashCode());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

