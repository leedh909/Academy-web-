package com.test.io.part03_addStream.ch04_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStream {

	public void fileSave() {
		
		Member[] mar = {
				new Member("user01","pass01","이창진","lee@kh.org",19,'남'),
				new Member("user02","pass02","홍홍웅","hsw@kh.org",20,'여'),
				new Member("user03","pass03","이대희","ldh@kh.org",27,'남')
		};
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.dat"));){
			
			for(int i=0; i<mar.length;i++) {
				objOut.writeObject(mar[i]);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public void fileOpen() {
		
		Member[] mar = new Member[3];
		
		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.dat"));) {
			
			for(int i=0;i<mar.length;i++) {
				mar[i]=(Member)objIn.readObject();
			}
			
			for(Member m : mar) {
				System.out.println(m);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 뭐든 Exception이 포함되니깐 줄일 수 있다. 하지만 추천하지는 않는다.
//			catch (FileNotFoundException e) {    
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
