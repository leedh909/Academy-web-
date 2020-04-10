package com.poly.silsub1.shape.model.vo;

public class Rectangle	extends Shape {

	double width, heigth;
	
	public Rectangle() {}
	public Rectangle(double width, double heigth) {
		super();
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
	
		
		return (this.width*this.heigth);
	}

	@Override
	public double perimeter() {

		
		return (2*(this.width+this.heigth));
	}

	
	
	
}
