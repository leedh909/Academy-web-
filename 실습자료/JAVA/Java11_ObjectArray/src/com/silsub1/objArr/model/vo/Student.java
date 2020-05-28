package com.silsub1.objArr.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	public Student() {}
	public Student(int grade, int classroom, int number, String name) {
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.name = name;
	}
	
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
	public int getnumber() {
		return number;
	}
	public void setnumber() {
		this.number = number;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String information() {
		return grade+"학년 "+classroom+"반 "+number+"번 "+name;
	}
	
	
	
	
	
	
}
