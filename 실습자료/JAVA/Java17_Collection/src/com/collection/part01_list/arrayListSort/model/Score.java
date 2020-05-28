package com.collection.part01_list.arrayListSort.model;

public class Score implements Comparable{

	//필드
	private String name;
	private int score;
	
	//생성자(기본, 매개변수)
	public Score() {}

	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}

	
	@Override
	public int compareTo(Object o) {
		//기본 정렬기준이 생성된다.
		//name으로 정렬
		
		String otherName = ((Score)o).getName();
		
		return name.compareTo(otherName);   //양수면 바꾸고 음수면 바꾸지 않겠다. (= 오름차순)
//		return -name.compareTo(otherName);  //양수면 바꾸고 음수면 바꾸지 않겠다. (= 내림차순)
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
