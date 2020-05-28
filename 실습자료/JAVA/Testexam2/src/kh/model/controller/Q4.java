package kh.model.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import kh.model.vo.Book;

public class Q4 {

	public void fileOpen() {

		ArrayList<Book> bookList = new ArrayList<>();

		Object test = null;

		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("book.dat"));) {

			while ((test = objIn.readObject()) != null) {
				Book test1 = (Book) test;
				bookList.add(test1);
			}

		} catch (Exception e) {
			for (int i = 0; i < bookList.size(); i++) {

				System.out.println(bookList.get(i));

			}
			e.printStackTrace();
		}

	}

//	public void fileOpen() {
//		
//		
//		ArrayList<Book> bookList = new ArrayList<>();
//			
//		
//		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("book.dat"));) {
//			
//			
//			
//			for(int i=0;i<4;i++) {
//				bookList.add((Book)objIn.readObject());
//			}
//			
//			for(int i=0;i<bookList.size();i++){
//				
//				bookList.get(i);
//				
//			}
//			
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//	}

}
