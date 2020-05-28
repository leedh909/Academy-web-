package com.poly.silsub1.shape.model.vo;

public class Circle2 implements IShape{

	double radius;
	public Circle2() {}
	public Circle2(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {

		return (radius*radius*Math.PI);
	}
	@Override
	public double perimeter() {
		
		
		return (2*Math.PI*radius);
	}
	
	
	
	
	
	
	
	
}
