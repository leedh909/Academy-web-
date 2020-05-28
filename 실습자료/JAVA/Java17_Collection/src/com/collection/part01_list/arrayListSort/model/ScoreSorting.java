package com.collection.part01_list.arrayListSort.model;

import java.util.Comparator;

public class ScoreSorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		//기본(name)이 되는 정렬말고 다른 정렬을 만든다.
		//점수로 기본 정렬
		int other1 = ((Score)o1).getScore();
		int other2 = ((Score)o2).getScore();
		
		if(other1>other2) {
			return 1;
		}else {
			return -1;  //return 0; 둘다 상관없다.  둘의 의미는 "바뀌지 않는다"이기때문에 상관없다.
		}
		
	}

	
	
	
	
	
}
