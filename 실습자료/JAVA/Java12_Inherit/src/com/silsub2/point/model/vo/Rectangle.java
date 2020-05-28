package com.silsub2.point.model.vo;

public class Rectangle extends Point{

	private int width;
	private int height;
	
	//생성자
	public Rectangle() {}
	public Rectangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	//getter & setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	@Override
	public void draw() {
		super.draw();
//		System.out.println("사각형의 x,y 좌표: "+ super.x+","+super.y);
		System.out.printf("면적 : %.1f \n",(double)(this.width*this.height));
//		System.out.println("면적: "+((int)((width*height)*10)/10.0));
		System.out.printf("둘레 : %.1f \n",(double)(2*(this.width+this.height)));
//		System.out.println("둘레: "+((int)((2*(width+height))*10)/10.0));
	}
	
	
	
}
