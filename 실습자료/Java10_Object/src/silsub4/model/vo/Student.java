package silsub4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height; 
	private char gender;
	
	public Student() {}
//	public Student(int grade, int classroom, String name, double height, char gender) {
//		this.grade =grade;
//		this.classroom = classroom;
//		this.name = name;
//		this.height = height;
//		this.gender = gender;
//	}
	
	
	public int getgrade() {
		return grade;
	}
	public void setgrade(int grade) {
		this.grade = grade;
	}
	public int getclassroom() {
		return classroom;
	}
	public void setclassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height = height;
	}
	public char getgender() {
		return gender;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return grade+", "+classroom+", "+name+", "+height+", "+gender;
	}
	
	
	
	
	
	
	
	
	
	
}
