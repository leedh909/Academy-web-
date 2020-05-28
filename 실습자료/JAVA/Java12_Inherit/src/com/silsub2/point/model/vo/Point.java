package com.silsub2.point.model.vo;

public class Point {

	protected int x;
	protected int y;
	
	
	//생성자
	public Point() { }
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//getter & setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//추가 메소드
	public void draw() {
		System.out.println("x,y 좌표 출력: "+this.x+","+this.y);
	}
	
	
	
}
