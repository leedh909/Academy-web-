package silsub3.run;

import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
	
		Circle cir = new Circle();
		
		cir.setradius(5);
		cir.CircleRound();
		cir.CircleArea();
		cir.incrementRadius();

		
	}

}
