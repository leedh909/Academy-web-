package silsub3.model.vo;

public class Circle {
	//내코딩
	public final double PI = 3.14;
	private int radius;
	
	public Circle() {}
//	public Circle(int radius) {
//		
//		this.radius = radius;
//	}
	
	public int getradius() {
		return radius;
	}
	public void setradius(int radius) {
		this.radius = radius;
	}
	
	public void CircleRound() {
		int r = this.radius;
		System.out.println("반지름: "+r+", 둘레는: "+(2*PI*r));
	}
	public void CircleArea() {
		int r = this.radius;
		System.out.println("반지름: "+r+", 넓이는: "+(r*r*PI));
	}
	
	public void incrementRadius() {
		
		this.radius +=1;
		
		//같은 클래스 내에서는 그냥 호출 가능
		CircleRound();
		CircleArea();
	}
	
	
}
