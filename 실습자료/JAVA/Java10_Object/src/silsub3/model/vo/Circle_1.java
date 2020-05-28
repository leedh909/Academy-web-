package silsub3.model.vo;

public class Circle_1 {
	//강사님 코딩
	public static final double PI = 3.14;
	private static int radius;
	
	public Circle_1() {}	
	public static int getRadius() {
		return radius;
	}
	public static void setRadius(int radius) {
		Circle_1.radius = radius;
	}
	
	public void incrementRadius() {
		Circle_1.radius++;
	}
	
	
	
	
}
