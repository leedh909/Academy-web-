package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class File0Test {

	public static void main(String[] args) {

		File0Test ft = new File0Test();
		ft.fileSave();
		
		
	}

	
	public void fileSave() {
		
		String name = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("사용할 파일명을 입력하시오. : ");
		try {
			name = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileWriter fw = new FileWriter(name);){
			String str = null;
			while(true) {
				System.out.print("파일에 저장할 내용을 입력하시오 : ");
				str = br.readLine();
				if(str.equals("exit")) {
					System.out.println("파일이 성공적으로 저장되었습니다.");
					break;
				}else {
					fw.write(str);
					fw.write(10);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void fileRead() {
		
		System.out.print("읽을 대상파일명을 입력하시오. : ");
		String name = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			name = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileReader fr = new FileReader(name);){
			
			int str =0;
			while((str=fr.read())!= -1) {
				
				System.out.print((char)str);
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
