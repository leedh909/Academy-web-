package com.test01;

//첫번째 방법은 JDBCTemplate을 상속받아서 사용한다.
//import common.JDBCTemplate;
//두번째 방법은 import static 으로 하는 방법이있다.

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static common.JDBCTemplate.*;

public class DBTest06 /*extends JDBCTemplate*/{

	public void selectAll() {

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST";
		
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
		}
	}

	public void delete() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res =0;
		
		String sql ="DELETE FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호: ");
		int no = sc.nextInt();
		
		
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			res= pstm.executeUpdate();
			if(res>0) {
				System.out.println("DELETE 성공");
			}else {
				System.out.println("DELETE 실패");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
			sc.close();
		}
	
		
		
	}
		
	public void insert() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("MNO 입력 : ");
		int no = sc.nextInt();
		System.out.print("MNAME 입력: ");
		String name = sc.next();
		System.out.print("NICKNAME 입력: ");
		String nickname = sc.next();
		
		String sql ="INSERT INTO MYTEST VALUES(?,?,?)";
		
		
		try {
			con = getConnection();
			pstm= con.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickname);
			
			res = pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("INSERT 성공");
			}else {
				System.out.println("INSERT 실패");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
			sc.close();
		}
		
	}
	
	public void selectOne() {
		
		Connection con =null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 MNO 입력: ");
		int no = sc.nextInt();
		
		String sql ="SELECT * FROM MYTEST WHERE MNO=?";
		
		con=getConnection();
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		
	}
	
	
	//강사님 코딩
	public void insert1() {
		
		Connection con = null;
		PreparedStatement pstm = null;
		int res =0;
		
		String sql="INSERT INTO MYTEST VALUES(?,?,?)";

		Scanner sc = new Scanner(System.in);
		System.out.print("no: ");
		int no = sc.nextInt();
		System.out.print("name: ");
		String name = sc.next();
		System.out.print("nickname: ");
		String nickName =sc.next();
		
		
		try {
			con= getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickName);
			
			res = pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("성공");
				selectAll();
				//commit 되는 순서에 의해서 데이터가 바로 들어가지 않고
				//이전에 있던 값까지만 selectAll() 된다.
			}else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
			sc.close();
		}

		
	}
	public void selectOne1() {
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql="SELECT * FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("no: ");
		int mno= sc.nextInt();
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
			sc.close();
		}

	}
	
}
