package com.test.chap01_encapsulation;

public class Score {

	//필드
	private String name="이창진";
	private int kor = 90;
	private int eng = 84;
	private int mat = 97;
	
	//생성자 == 객체를 생성하기 위한 메소드
	public Score() {   }
	
	//총합을 구하여 출력하는 메소드
	public void Sum() {
		int sum = (kor + eng + mat);
		
		System.out.println(name+"의 총합은 "+sum+"입니다.");
	}
	
	//평균을 구하여 출력하는 메소드
	public void Avg() {
		double avg = (kor + eng + mat)/3.0;
		
		System.out.println(name+"의 평균은 "+avg+"입니다.");
	}
	
	//제일 높은 점수를 받은 과목을 찾는 메소드
	public void Max() {
		//내코딩
		int max=0;
		
		if(kor>eng) {
			if(kor>mat) {
				max=kor;
				System.out.println("국어가 제일 높은 점수입니다.");
			}else {
				max=mat;
				System.out.println("수학이 제일 높은 점수입니다.");
			}
		}else {
			if(eng>mat) {
				max=eng;
				System.out.println("영어가 제일 높은 점수입니다.");
			}else {
				max=mat;
				System.out.println("수학이 제일 높은 점수입니다.");
			}
		}
		
		System.out.println("제일 높은 점수는 "+max+"입니다.");
		
	}
	public void prnMax() {
		//강사님 코딩
		if(kor>eng && kor > mat) {
			System.out.println("국어가 제일 높은 점수.");
		}else if(eng>kor && eng > mat) {
			System.out.println("영어가 제일 높은 점수.");
		}else {
			System.out.println("수학이 제일 높은 점수.");
		}

	}
	
	//제일 낮은 점수를 받은 과목을 찾는 메소드
	public void Min() {
		//내코딩
		if(kor>eng) {
			if(eng>mat) {
				System.out.println("수학이 제일 낮다.");
			}else {
				System.out.println("영어가 제일 낮다.");
			}			
		}else {
			if(kor>mat) {
				System.out.println("수학이 제일 낮다.");
			}else {
				System.out.println("국어가 제일 낮다.");
			}
		}
	
		
	}
	public void prnMin() {
		//강사님 코딩
		if(kor<eng && kor < mat) {
			System.out.println("국어가 가장 낮은 점수");
		}else if(eng < kor && eng <mat) {
			System.out.println("영어가 가장 낮은 점수");
		}else {
			System.out.println("수학이 가장 낮은 점수");
		}
	}
	
	//필드값을 확인 할 수 있는 information() 메소드
	public void information() {
		System.out.println(name+"의 국어 성적은 "+kor+"이고, 영어 성적은 "+eng+"이고, 수학 성적은 "+mat+"입니다.");
	}
	
	
	
	
	
	
	
	
}
