package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URI02 {

	public static void main(String[] args) throws IOException {
		
		byte[] b = new byte[1];
		
		URL url = new URL("https://t1.daumcdn.net/cfile/tistory/122E6B4A5021EFAF14");
		
		URLConnection urlConnection = url.openConnection();
		
		urlConnection.connect();
		
		DataInputStream di= new DataInputStream(urlConnection.getInputStream());   //이미 url과 연결된 통로를 만들어놨기때문에 가져와서 쓸수 있다.
		
		FileOutputStream fo = new FileOutputStream("a.jpg");
		
		while(di.read(b,0,1) != -1) {
			fo.write(b,0,1);
		}
		
		System.out.println("완료");
		di.close();
		fo.close();
			
	}
}
