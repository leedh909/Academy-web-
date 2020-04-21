package com.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.part01_list.arrayListSort.model.Score;
import com.collection.part01_list.arrayListSort.model.ScoreSorting;

public class ScoreManager {

	public void scoreSort() {
		
		List list = new ArrayList();
		
		list.add(new Score("이창진",99));
		list.add(new Score("홍길동",75));
		list.add(new Score("이순신",88));
		list.add(new Score("하하하",40));
		list.add(new Score("김유신",73));
		list.add(new Score("강철수",59));
		list.add(new Score("조지아",100));
//		list.add("끄읕");
		
		System.out.println("list: "+list);
		
		//*********Comparable
//		Collections.sort(list);
//		System.out.println("listSort: "+list);
		
		list.sort(null); //null값을 넣으면 기본으로 정의된 정렬로 실행된다.
		System.out.println("listSort: "+list);
		
		
		//*********Comparator
		Collections.sort(list,new ScoreSorting());
//		System.out.println("listSorting: "+list);
		//위와 같은 기능이다.
//		list.sort(new ScoreSorting());
//		System.out.println("listSorting: "+list);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
