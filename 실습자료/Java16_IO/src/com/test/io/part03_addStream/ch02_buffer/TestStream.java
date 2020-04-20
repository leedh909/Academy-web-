package com.test.io.part03_addStream.ch02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TestStream {

	
	public void output() {
		
		//new 보조스트림(new 보조스트림(new 기반스트림('외부자원')));
		//try~with~resource  (자동으로 close()된다.== finally{ close()...} 안해도 된다는 의미이다.)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample2.txt"));) {
			
			bw.write("안녕하세요 \n");
			bw.write("반갑습니다.\n");
			bw.write("월요일이네요\n");
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public void input() {
		
		//try~with~resource
		try (BufferedReader br = new BufferedReader(new FileReader("sample2.txt"));){
			
			String tmp;
			while((tmp = br.readLine()) != null) {  //null값이 들어오면 종료된다.
				
				System.out.println(tmp);
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
