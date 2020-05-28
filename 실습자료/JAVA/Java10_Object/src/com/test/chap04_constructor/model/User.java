package com.test.chap04_constructor.model;

import java.util.Date;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private Date EnrollDate;
	
	//생성자의 사용 목적
	//1. 객체를 생성해 주기 위한 목적
	//2. 매개변수로 전달받은 값으로 필드를 초기화할 목적
	
	//생성자 사용시 주의사항
	//1. 반드시 클래스명과 동일해야 한다(대/소문자 구분)
	//2. 리턴형이 존재하지 않는다. (void, int, char, string, ...)
	
	//기본생성자 -> 필드의 초기화 역할은 수행하지 못하고 객체만 생성 할때만 사용.
	public User() {}
	
	//매개변수 있는 생성자 -> 객체 생성과 필드를 초기화 하는 두 가지 목적으로 사용.
	//같은 이름의 생성자 혹은 메소드를 사용하려고 하는 경우 오버로딩을 사용해야 한다.
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		//this. 메소드 내에 숨겨진 채 존재하는 래퍼런스 변수, 할당된 객체 자신을 의미.
		
	}
	public User(String userId, String userPwd, String userName,Date EnrollDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId,userPwd,userName);
		//this() : 중복되는 동일한 초기화 하는 내용의 생성자가 
		//존재하는 경우 this()를 사용할 수 있다.
		this.EnrollDate = EnrollDate;
	}
	
	
	//getter setter 작성
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public Date getDate() {
		return EnrollDate;
	}
	public void setDate(Date EnrollDate) {
		this.EnrollDate=EnrollDate;
	}
	
	//출력용 메소드
	public void info() {
		
		System.out.println(userId+", "+userPwd+", "+ userName+", "+EnrollDate);
		
	}
	
	
	
	
	
	
	
}
