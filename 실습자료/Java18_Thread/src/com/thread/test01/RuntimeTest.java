package com.thread.test01;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {
		
		
		Runtime rt = Runtime.getRuntime();
		//자바 클라스가 아닌 OS기반의 프로그램을 실행 시키거나 정보를 제공하는 객체! Runtime
		
		try {
			Process prc = rt.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
