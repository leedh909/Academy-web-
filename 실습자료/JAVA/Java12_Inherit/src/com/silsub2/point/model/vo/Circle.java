package com.silsub2.point.model.vo;

public class Circle extends Point{

	private int radius;
	
	//생성자
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	//getter & setter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
//		System.out.println("원의 x,y 좌표: "+super.x+","+super.y);
		System.out.printf("원의 면적 = %.1f \n",(Math.PI*this.radius*this.radius));
//		System.out.println("원의 면적: "+(int)(Math.PI*this.radius*this.radius*10)/10.0);
		System.out.printf("원의 둘레= %.1f \n",(Math.PI*2*this.radius));
//		System.out.println("원의 둘레: "+(int)(Math.PI*2*this.radius*10)/10.0);
		
	}
	
	
	
	
	
}
