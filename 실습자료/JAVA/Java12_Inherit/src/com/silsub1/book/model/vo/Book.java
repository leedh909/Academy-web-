package com.silsub1.book.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;

	//생성자
	public Book() {}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//getter & setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//추가 메소드
	
	//1. toString 오버라이딩
	//클래스의 풀 패키지 명과 객체의 해쉬코드를 16진수로 변환하여 리턴하는 메소드
	@Override
	public String toString() {
		return title+", "+author+", "+price;
	}
	
	//2. equals 오버라이딩
	//(원래)두 객체의 주소값을 비교하여 같으면 true, 다르면 false를 리턴.
	//(변경)객체가 가진 값까지 비교 하기 위한 목적으로 오버라이딩, 동등성 확보.
	@Override
	public boolean equals(Object obj) {
	
		//주소가 같으면 같은 객체
		if(this == obj) {
			return true;
		}
		//전달받은 객체가 null인 경우 무조건 다른 객체
		if(obj == null) {
			return false;
		}
		//전달받은 객체를 형변환하여 각 필드별로 비교 시작
		Book other = (Book)obj; //강제 형변환
		
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		}else if(!title.equals(other.title)) {
			return false;
		}
		
		if(author == null) {
			if(other.author != null) {
				return false;
			}
		}else if(!author.equals(other.author)) {
			return false;
		}
		//기본 자료형의 경우 값만 일치하는지 비교
		if(price !=other.price) {
			return false;
		}		
		return true;
		
	}
	
	//3. hashcode()
	@Override
	public int hashCode() {
		return (author+price+title).hashCode();
	}
	
	
	
	
	
	
	
	
	
}
