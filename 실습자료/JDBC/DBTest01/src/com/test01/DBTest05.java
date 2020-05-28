package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest05 {

	//insert
	public void insert() throws Exception {
		
		//1.준비
		Connection con =null;
		PreparedStatement pstm = null;
		
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id="KH";
		String pw ="KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력: ");
		int no=sc.nextInt();
		System.out.print("이름입력: ");
		String name = sc.next();
		System.out.print("별명입력: ");
		String nickname = sc.next();
		
		//PreparedStatement를 이용하면 변수를 ?로 대체할 수 있다.
		String sql="INSERT INTO MYTEST VALUES(?,?,?)";
		
		//2. 드라이버 등록
		Class.forName(driver);
		//3. db연결
		con = DriverManager.getConnection(url,id,pw);
		//4. statement 준비
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);
		pstm.setString(2, name);
		pstm.setString(3, nickname);
		
		//5.query 실행
		int res = pstm.executeUpdate();
		
		//6.결과처리
		if(res>0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
		//7.종료
		pstm.close();
		con.close();
		sc.close();
		
	}
	
	public void delete() throws Exception{
		
		Connection con = null;
		PreparedStatement ptmt = null;
		
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="KH";
		String pw="KH";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제 번호 입력: ");
		int no = sc.nextInt();
		
		String sql ="DELETE FROM MYTEST WHERE MNO=?";
		
		Class.forName(driver);
		
		con = DriverManager.getConnection(url,id,pw);
		ptmt= con.prepareStatement(sql);
		ptmt.setInt(1, no);
		
		int res = ptmt.executeUpdate();
		
		if(res>0) {
			System.out.println("DELETE 성공");
		}else {
			System.out.println("DELETE 실패");
		}
		
		ptmt.close();
		con.close();
		sc.close();
	}
	public void selectAll() throws SQLException, ClassNotFoundException {
		
		Connection con =null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id="KH";
		String pw="KH";
		
		String sql="SELECT * FROM MYTEST";
		
		Class.forName(driver);
		
		con = DriverManager.getConnection(url,id,pw);
		ptmt = con.prepareStatement(sql);
		rs = ptmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+ rs.getString(3));
		}
		
		rs.close();
		ptmt.close();
		con.close();
		
		
		
	}
	
	//강사님 코딩
	public void delete1() throws Exception{
		//1.준비
		Connection con = null;
		PreparedStatement pstm = null;
		int res =0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id="KH";
		String pw="KH";
		String sql ="DELETE FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호: ");
		int no = sc.nextInt();
		
		//2.드라이버등록
		Class.forName(driver);
		//3.db연결
		con = DriverManager.getConnection(url,id,pw);
		//4.쿼리 실행 준비 및 쿼리 실행
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);
		//DELETE FROM MYTEST WHERE MNO=?
		//==>DELETE FROM MYTET WHERE MNO=no
		
		res = pstm.executeUpdate();
		
		//5.실행결과 처리
		if(res>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		//6.db종료
		pstm.close();
		con.close();
		sc.close();
		
		
	}
	public void selectAll1() throws Exception{
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="KH";
		String pw ="KH";
		String sql ="SELECT * FROM MYTEST";
		
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		
		pstm = con.prepareStatement(sql);
		
		rs = pstm.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+ rs.getString(3));
		}
		
		rs.close();
		pstm.close();
		con.close();
	
		
		
		
	}
	public void selectOne() throws Exception{
		
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="KH";
		String pw ="KH";
		String sql ="SELECT * FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호: ");
		int no = sc.nextInt();
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		psmt = con.prepareStatement(sql);
		psmt.setInt(1, no);
		//"SELECT * FROM MYTEST WHERE MNO=?"
		//==>"SELECT * FROM MYTEST WHERE MNO=no";
		
		rs=psmt.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		}
		
		rs.close();
		psmt.close();
		con.close();
		
		
		
		
		
		
		
	}
	
}
