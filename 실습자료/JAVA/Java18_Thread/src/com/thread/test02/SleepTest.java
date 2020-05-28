package com.thread.test02;

import java.util.Iterator;

public class SleepTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(2000);   //sleep을 이용해서 스레드 컨트롤을 하는 것이다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("∀");
		}
		
		
		
		
		
		
		
	}
	
	
}
