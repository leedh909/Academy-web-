package com.poly.silsub1.shape.model.vo;

public class Rectangle2	implements IShape {

	double width;
	double heigth;
	
	public Rectangle2() {}
	public Rectangle2(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
		
	@Override
	public double area() {
	
		return (width*heigth);
	}

	@Override
	public double perimeter() {

		
		return (2*(width+heigth));
	}

	
	
	
}
