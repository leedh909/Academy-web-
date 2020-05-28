package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		
		//InetAddress클래스는 IP주소를 표현하고 class
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr);
		
		System.out.println("localhost: "+ addr.getHostAddress());
		System.out.println("host name: "+ addr.getHostName());
		
		
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com");  //해당하는 이름의 Ip 주소를 가져올 수 있다.
		
		for(int i=0;i<naver.length;i++) {
			System.out.println(naver[i].getHostName());
			System.out.println(naver[i].getHostAddress());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
