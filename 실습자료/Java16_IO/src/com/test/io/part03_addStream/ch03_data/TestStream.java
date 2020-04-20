package com.test.io.part03_addStream.ch03_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	
	public void output() {
		
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"));) {
			
			dout.writeUTF("홍길동");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("이순신");
			dout.writeInt(88);
			dout.writeChar('B');
			dout.writeUTF("유관순");
			dout.writeInt(64);
			dout.writeChar('D');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		
	}
	
	
	public void input() {
		
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));) {
			
			while(true) { //파일의 끝을 만났을때(=받아올값이 없을때) 예외처리가 되었다. --> 그 예외가 발생했을때 "파일 읽기 완료"라고 띄운다.
				
				System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
				
				
			}	
			
			
		} catch(EOFException e) {
			System.out.println("[파일 읽기 완료]");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
		
		
		
		
		
	}
	
	
	
	
	
}
