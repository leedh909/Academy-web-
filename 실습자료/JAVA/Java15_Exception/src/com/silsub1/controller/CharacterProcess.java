package com.silsub1.controller;

import com.silsub1.exception.CharCheckException;
import com.silsub1.view.ConsoleIO;

public class CharacterProcess {

	public CharacterProcess() {}
	
	public void countAlpha(String s) throws CharCheckException{
		//전달된 문자열값에서 영문자가 몇개인지 카운트하고
		//ConsoleIO 클래스의 output()메소드로 문자열과 카운트한 숫자 전달

		//단, 공백문자가 있으면, CharCheckException 발생
		
		//에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다." 출력함
		
		int count=0;
		char[] carr = new char[s.length()];
		for(int i=0;i<carr.length;i++) {
			carr[i]=s.charAt(i);
			if((carr[i]>='a'&&carr[i]<='z')||(carr[i]>='A'&&carr[i]<='Z')) {
				count++;
			}
			if(carr[i]==' ') {
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
			}
		}
		
		
		ConsoleIO cio = new ConsoleIO();
		cio.charOutput(s, count);
		
		
	}
	
}
