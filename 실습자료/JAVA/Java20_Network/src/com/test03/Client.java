package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable{
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Client());
		
		t1.start();
		
	}

	@Override
	public void run() {
		
		//TCP방법
		
		try {
			Socket clientSocket = null;
			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdIn = null;
			
			System.out.println("server에 접속합니다......");
			
			
			clientSocket = new Socket("localhost",8877);
			
			out = new PrintWriter(clientSocket.getOutputStream(),true); // 서버에게 데이터를 보내는 친구
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); //서버의 데이터를 입력받는 친구
			
			stdIn = new BufferedReader(new InputStreamReader(System.in)); //키보드로 입력받을 친구
			
			String inputLine;
			while((inputLine=stdIn.readLine())!= null) {
				out.println(inputLine);
				System.out.println("server로부터 다시 받은 메시지: "+ in.readLine());
				
			}
			
			
			stdIn.close();
			in.close();
			out.close();
			clientSocket.close();
					
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
