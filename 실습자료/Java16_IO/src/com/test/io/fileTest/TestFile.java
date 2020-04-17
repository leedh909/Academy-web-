package com.test.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("person.txt"); //상대경로
		
		System.out.println("파일명: "+ file.getName());
		System.out.println("저장경로: "+file.getPath());
		System.out.println("저장경로: "+file.getAbsolutePath()); //실제 컴퓨터에 파일이 실행되는 경로 = 절대경로
		System.out.println("파일용량: "+file.length());
		
		try {
			
			
			boolean b = file.createNewFile();
			//파일이 없을 경우 파일 생성하고 true값 리턴
			//파일이 있을 경우는 false를 리턴 
			System.out.println(b);
			
			
			boolean b2 = file.delete();
			//파일을 삭제하였다.
			System.out.println(b2);
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
