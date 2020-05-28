package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {

//		Circle[] cir = new Circle[3];
//		Rectangle[] rec = new Rectangle[3];
//		
//		for(int i=0;i<3;i++) {
//			cir[i]=new Circle();
//			rec[i]=new Rectangle();
//		}
//		cir[0]=new Circle(4,5,9);
//		cir[0].draw();
//		rec[0]=new Rectangle(4,5,5,5);
//		rec[0].draw();
		
		
		Circle[] c = {
				new Circle(10,10,1),
				new Circle(20,20,50),
				new Circle(30,30,100)
		};
		
		Rectangle[] r = {
				new Rectangle(10,10,10,30),
				new Rectangle(30,20,20,40),
				new Rectangle(5,30,60,30)
		};
		
		for(int i=0;i<c.length;i++) {
			c[i].draw();
		}
		for(int i=0;i<r.length;i++) {
			r[i].draw();
		}
		
		
		
	}

}
