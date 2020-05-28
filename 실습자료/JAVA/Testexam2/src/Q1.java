import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Q1 {
	
//	TCP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 네트워크 프로그램을 구현하고 구동하였으나 서버와 연결이 되지 않았다 예상 실행결과가 정확히 도출될 수 있도록 문제점이 있는 코드를 찾아 [원인](5점)에 파악된 문제점을 기술하고, 해결 방안을 구상하여 [조치내용](5점)에 해결방법을 작성하여 보고서를 완성하시오. (10점)
//
//	'- 서버 IP : 192.168.20.34, 포트번호 : 3000
//
//	[클라이언트용 프로그래밍 코드]
		
		public void fileUpload() {

			int port = 3000;

			String serverIP;

			try {

			serverIP = InetAddress.getLocalHost().getHostAddress();

			// 2. 소켓 객체 생성 : 생성과 동시에 서버에 연결 요청됨

			Socket socket = new Socket(serverIP, port);

			// 연결 실패는 null 리턴됨

			//이하 코드 중간 생략.....

			}catch(Exception e) {
				e.printStackTrace();
			}
		}

//	[서버용 프로그래밍 코드]

			public class ServerManager {

			public ServerManager() {}

			public void serverStart() {

			// 1. port 번호 지정

			int port = 3000;

			// 2. 서버용 소켓 객체 생성

			ServerSocket server;

			try {

			server = new ServerSocket(port);

			// 3. 클라이언트가 연결을 요청할 때까지 기다림

			while (true) {

			// 4. 연결을 요청한 클라이언트의 요청 수락함 : 해당 클라이언트 정보를 저장

			Socket client = server.accept();

			// 중간 생략....

			}}}
		
		
	}
}
