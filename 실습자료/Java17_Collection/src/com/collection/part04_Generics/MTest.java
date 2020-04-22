package com.collection.part04_Generics;

import java.util.HashSet;
import java.util.Set;

public class MTest {

	public static void main(String[] args) {
		
		TestGenerics tg = new TestGenerics();
//		tg.testGenerics1();
//		tg.testGenerics2();
//		tg.testGenerics3();
//		tg.testGenerics4();
		
		//강사님 코딩
		Set<Integer> set = new HashSet<>();
		while(set.size()<6) {
			set.add((int)(Math.random()*45+1));
		}
		System.out.println(set);
		
		
		
		
		//내코딩
//		HashSet hs = new HashSet();
//		while(hs.size()<6) {
//			hs.add((int)(Math.random()*45+1));
//		}
//		System.out.println(hs);
//		
//		MTest m = new MTest();
//		m.test();
		
		
		
		
		
	}

	
	public void test() {
		//내코딩
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size()<6){
			int random = (int)(Math.random()*45 +1);
			hs.add(random);
		}
		System.out.println(hs);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
