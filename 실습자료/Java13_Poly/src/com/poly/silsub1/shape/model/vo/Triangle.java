package com.poly.silsub1.shape.model.vo;

public class Triangle implements IShape{

	private double base;
	private double height;
	public Triangle() {}
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
			
	@Override
	public double area() {

		return this.base*this.height/2;
	}
	
	public double getHypotenuse() {
		return Math.sqrt((base*base+height*height));
	}
	
	@Override	
	public double perimeter() {
		
		return base+height+getHypotenuse();
	}
	
	
			
			
}
