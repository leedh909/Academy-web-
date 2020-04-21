package com.io.silsub2.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NoteDao_1 {

	
	public void fileSave(StringBuilder sb, String fileName) {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			
			bw.write(sb.toString());
			System.out.println(fileName+" 저장 성공!");
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public StringBuilder fileOpen(String fileName) {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				sb.append(line+"\n");
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
