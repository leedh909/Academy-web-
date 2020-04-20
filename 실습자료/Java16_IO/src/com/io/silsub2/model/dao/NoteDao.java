package com.io.silsub2.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteDao {

	
	public int fileSave(StringBuilder sb, String fileName) {
		
		BufferedWriter bw = null;
		FileWriter fw =null;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);

			String res = sb.toString();
			bw.write(res);
			
			System.out.println(fileName+" 파일에 성공적으로 저장하였습니다.");
			System.out.println();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

		
		return 0;
	}
	
	public StringBuilder fileOpen(String fileName) {
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br=null;
		try{
			
			 br = new BufferedReader(new FileReader(fileName));
			 
			 int no;
			 while((no=br.read())!=-1) {
				 
				 sb.append((char)no); 
				 
			 }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return sb;
	}
	
	
	
	
	
	
	
	
	
	
}
