package com.silsub1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.silsub1.controller.CharacterProcess;
import com.silsub1.controller.NumberProcess;
import com.silsub1.exception.CharCheckException;
import com.silsub1.exception.NumberRangeException;

public class ConsoleIO {

	public void charInput() {
		
		//키보드로 입력받아 문자열을 CharacterProcess 클래스의 countAlpha로 전달하는 메소드
		//(BufferedReader 사용하여 try-catch구문으로 작성할 것) 
		
		CharacterProcess cp = new CharacterProcess();		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열을 입력하시오: ");
		String s;
		try {
			s = br.readLine();
			cp.countAlpha(s);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(CharCheckException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void charOutput(String s, int count) {
		
		//문자열과 영문자 수를 매개변수로 입력 받아
		//수행 결과를 돌려받아 출력하는 메소드
		
		System.out.println("문자열: "+s+", 영문자 수: "+count+"입니다.");

	}
	
	public void numberInput() {
		
		//키보드로 두 개의 정수를 입력받아 NumberProcess 클래스의 checkDouble()로 전달하는 메소드
		//(BufferedReader 사용하여 try-catch구문으로 작성할 것) 
		NumberProcess np = new NumberProcess();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("첫번째 수를 입력하세요: ");
			int num1 = (Integer.parseInt(br1.readLine()));
			System.out.print("두번째 수를 입력하세요: ");
			int num2 = (Integer.parseInt(br1.readLine()));
			
			np.checkDouble(num1,num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void charOutput(boolean isTrue) {
		//매개변수로 논리값을 전달 받아
		//결과를 출력하는 메소드
		
		if(isTrue==true) {
			System.out.println("첫번째 수는 두번째 수의 배수입니다.");
		}else {
			System.out.println("첫번째 수는 두번째 수의 배수가 아닙니다.");
		}
		
		
		
	}
	
	
}
