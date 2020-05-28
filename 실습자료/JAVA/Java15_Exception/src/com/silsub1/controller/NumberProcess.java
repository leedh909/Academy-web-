package com.silsub1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.silsub1.exception.NumberRangeException;
import com.silsub1.view.ConsoleIO;

public class NumberProcess {

	public NumberProcess() {}
	
	public boolean checkDouble(int a, int b) throws NumberRangeException {
		// 임의의 정수 두개를 BufferedReader로 입력받아, 첫번째 수가 두번째수의 배수인지 확인하고
		//ConsoleIO의 numberOutput()메소드로 배수가 맞으면 true, 배수가 아니면 false를 전달함
		//단, 첫번째와 두번째 수가 1~100사이의 값이 아니면
		//NumberRangeException 발생시킴
		//에러메시지 : "1부터 100사이의 값이 아닙니다."
		
		if((!(a>=1&&a<=100))||(!(b>=1&&b<=100))==true) {
			
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
			
		}else {
			ConsoleIO cio = new ConsoleIO();
			boolean result;
			if(a%b==0) {
				 result=true;
				cio.charOutput(result);
				return true;
			}else {
				 result=false;
				cio.charOutput(result);
				return false;
				
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
