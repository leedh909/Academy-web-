package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class File0Test_1 {

	public static void main(String[] args) {

		File0Test_1 ft = new File0Test_1();
		ft.fileSave();
		
		
	}

	
	public void fileSave() {
		
		BufferedReader br = null;
		FileWriter fw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("파일명 입력하시오: ");			
			String fileName = br.readLine();
			fw = new FileWriter(fileName);
			
			String str = null;
			
			while(true) {
				System.out.print("파일에 저장할 내용 입력: ");				
				str = br.readLine();
				
				
				char[] car = str.toCharArray();
				if(!str.equals("exit")) {
					
					fw.write(car);
					
				}else {
					
					System.out.println("파일에 성공적으로 저장되었습니다.");
					break;
					
				}
		
			}
		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("읽을 파일 이름 입력: ");
			String fileName = br.readLine();
			
			fr = new FileReader(fileName);
			
			int value;
			StringBuilder sb = new StringBuilder();
			
			while((value=fr.read()) != -1) {
				sb.append((char)value);
			}
			
			String str = sb.toString();
			System.out.println(str);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
