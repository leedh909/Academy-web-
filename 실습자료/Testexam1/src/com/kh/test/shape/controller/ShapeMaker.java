package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {
	//UML 에 제시된 요구사항을 이해하지 못하였으며 시나리오 작성 순서를 기술하지 못하였음
	//->시나리오 작성하라고 하면 어떻게 구현할지를 쓰면 된다.
	/* 	
	  	*시나리오 작성 순서*
		1. Circle 클래스를 작성한다.
		
		2. Rectangle 클래스를 작성한다.
		
		3. main() 메소드를 포함하는 실행용 클래스로 ShapeMaker 클래스를 작성한다.
		
		4. main() 메소드에서 요구한 실행결과가 도출되도록 
		   Circle 과 Rectangle 클래스를 사용하여 실행될 코드를 작성한다.
	*/
	public static void main(String[] args){
		
			Circle[] cir = new Circle[3];
	
			cir[0] = new Circle(20); 
	
			cir[1] = new Circle(40);
	
			cir[2] = new Circle(50);
	
			for(int i=0; i<cir.length;i++){
	
			cir[i].draw();
	
			}



			System.out.println();
	
	
			RectAngle[] rec = new RectAngle[2];
	
			rec[0] = new RectAngle(20,20);
	
			rec[1] = new RectAngle(50,60);

			for(int i=0; i<rec.length;i++){
	
			rec[i].draw();
	
			}

		}

}
