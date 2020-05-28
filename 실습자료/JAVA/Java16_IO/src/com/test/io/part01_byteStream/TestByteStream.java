package com.test.io.part01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {

	
	public void fileSave() {
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("sample.dat");
			//대상 파일이 존재 하지 않으면 자동으로 파일을 만든다.
			fout.write(97);
			byte[] bar = {98,99,100,101,102,10};  //마지막에 입력한 10은 줄바꿈이다.
			fout.write(bar);
			fout.write(bar,1,3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		FileInputStream fin = null;
		
		
		try {
			fin = new FileInputStream("sample.txt");
			int fileSize = (int)new File("sample.txt").length();   //long으로 되어있는걸 int로 형변환시켜주었다.
			//System.out.println(fileSize);
			
			
			//파일을 읽어서 저장할 파일 크기 만큼의 byte 배열 선언
//			byte[] bar = new byte[fileSize];
//			
//			fin.read(bar);
//			
//			for(int i=0; i<bar.length;i++) {
////				System.out.print(bar[i]+" ");
//				System.out.print((char)bar[i]+" ");
//			}
			
			
			
//			for(int i=0;i<15;i++) {
//				System.out.print(fin.read()+" "); //데이터를 가져오다가 읽어들일게 없으면 -1을 읽어온다.
//			}
			
//			while(fin.read()!= -1) { // read를 두번 불러오기때문에 결과값이 적게 나온다.
//				
//				System.out.print(fin.read()+" ");
//			}			
//			int no;
//			while((no=fin.read())!= -1) { //read를 한번씩 실행하게 만든다.
//				
//				System.out.print(no+" ");
//			}
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
