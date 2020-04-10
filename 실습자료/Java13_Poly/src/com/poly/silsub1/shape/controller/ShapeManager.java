package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.Circle2;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Rectangle;
import com.poly.silsub1.shape.model.vo.Rectangle2;
import com.poly.silsub1.shape.model.vo.Shape;
import com.poly.silsub1.shape.model.vo.Triangle;

public class ShapeManager {

	public void calcShape(){
		
		Shape s;
		s = new Circle(15.5);
		System.out.println("원 면적 : "+s.area());
		System.out.println("원 둘레 : "+s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : "+s.area());
		System.out.println("사각형둘레 : "+s.perimeter());
		
		
		
	}
	public void calcShape2() {
		Circle2 c = new Circle2(15.5);
		System.out.println("원 면적 : "+c.area());
		System.out.println("원 둘레 : "+c.perimeter());
		
		Rectangle2 r = new Rectangle2(34.5, 42.7);
		System.out.println("사각형면적 : "+r.area());
		System.out.println("사각형둘레 : "+r.perimeter());
	}
	
	public void calcShapeArray() {
		
		IShape[] iarr = new IShape[5];
		
		
		for(int i=0;i<iarr.length;i++) {
			
			int random = (int)(Math.random()*3+1);
			System.out.println("random: "+ random);
			
			switch(random) {
			case 1:
				iarr[i]= new Circle2(15.5);
				break;
				
			case 2:
				iarr[i]= new Rectangle2(11.2, 10.4);
				break;
				
			case 3:
				iarr[i]= new Triangle(10.5,12.2);
				break;
			}
				
		}
		
		
		for(int i=0; i<iarr.length;i++) {
			
			if(iarr[i] instanceof Circle2) {
				System.out.println("원 면적 : "+((Circle2)iarr[i]).area());
				System.out.println("원 둘레 : "+((Circle2)iarr[i]).perimeter());
			}else if(iarr[i] instanceof Rectangle2) {
				System.out.println("사각형면적 : "+((Rectangle2)iarr[i]).area());
				System.out.println("사각형둘레 : "+((Rectangle2)iarr[i]).perimeter());
			}else if(iarr[i] instanceof Triangle) {
				System.out.println("삼각형면적 : "+((Triangle)iarr[i]).area());
				System.out.println("삼각형빗변 : "+((Triangle)iarr[i]).getHypotenuse());
				System.out.println("삼각형둘레 : "+((Triangle)iarr[i]).perimeter());
				
			}

		}
		
	}
	
	
}
