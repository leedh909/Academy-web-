package kh.model.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import kh.model.vo.Book;


public class FileWrite {
	
	public void fileSave(String fileName) {

		
		Book[] booklist = {
				new Book("자바를 정복하자",35000)	,
				new Book("자바를 정복하자2",35000),
				new Book("자바를 정복하자3",35000),
				new Book("자바를 정복하자4",35000)	
		};
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("book.dat"));){
			
			for(int i=0; i<booklist.length;i++) {
				objOut.writeObject(booklist[i]);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
