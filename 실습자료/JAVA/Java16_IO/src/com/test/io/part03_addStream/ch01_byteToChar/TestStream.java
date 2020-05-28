package com.test.io.part03_addStream.ch01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {

	
	public void input(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//자바클래스와 콘솔창이랑 연결하겠다는 의미이다.
		//BufferedReader는 문자단위지만 콜송에서 입력은 바이트 단위여서 InputStreamReader로 단위를 변환시켜준다.
		
		//보조스트림 변수 = new 보조스트림(new 보조스트림(new 기반스트림("외부자원")));
		//기반 스트림은 대표적으로 파일, 콘솔 등이 있다.
		
		
		try {
			System.out.print("문자열 입력: ");
			String val = br.readLine();
			System.out.println("val: "+val);	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("Java Oracle JDBC");

			bw.flush(); //버퍼에 남아있는 값이 다 비워낸다.(=출력된다) 중간중간 데이터를 확인할때도 사용된다.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally {           
//			try {
//				bw.close();		//파일을 닫아주지 않으면  결과가 출력되지 않는다.  대신 flush() 메소드를 써주면 버퍼에 남아있는 값들을 출력해준다.
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
