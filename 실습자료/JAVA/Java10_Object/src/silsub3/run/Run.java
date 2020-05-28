package silsub3.run;

import silsub3.model.vo.Circle;
import silsub3.model.vo.Circle_1;

public class Run {

	public static void main(String[] args) {
	
//		Circle cir = new Circle();
//		
//		cir.setradius(5);
//		cir.CircleRound();
//		cir.CircleArea();
//		cir.incrementRadius();

		
		Circle_1.setRadius(3);
		System.out.println("원의 넓이: " + (Circle_1.getRadius()*Circle_1.getRadius()*Circle_1.PI));
		System.out.println("원의 둘레: " + (Circle_1.getRadius()*2*Circle_1.PI));
		
		Circle_1 cir2 = new Circle_1();
		cir2.incrementRadius();
		System.out.println("원의 넓이: " + (Circle_1.getRadius()*Circle_1.getRadius()*Circle_1.PI));
		System.out.println("원의 둘레: " + (Circle_1.getRadius()*2*Circle_1.PI));
		
		
	}

}
