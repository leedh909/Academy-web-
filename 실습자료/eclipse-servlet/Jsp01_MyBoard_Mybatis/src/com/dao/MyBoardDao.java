package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.MyBoardDto;

public class MyBoardDao extends SqlMapConfig {
	
	private String namespace="com.myboard.";
	
	
	public List<MyBoardDto> selectall() {
		
		List<MyBoardDto> res = new ArrayList<MyBoardDto>();
		
		SqlSession session = null;
		
		session = getSqlSessionFactory().openSession(true);   //true는 오토커밋을 true 하겠다는 의미이다.
		
		res = session.selectList(namespace+"selectAll"); //com.myboard.selectAll 로 실행하는 것이다.
		
		session.close();
		
		return res;
	}
	
	public MyBoardDto selectone(int myno) {
		
		SqlSession session = null;
		MyBoardDto res = null;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectOne(namespace+"selectOne",myno);
		}catch(Exception e) {
			
			System.out.println(e);
		}finally {

			session.close();
		}
		return res;
	}
	
	public int insert(MyBoardDto dto) {
		
		
		return 0;
	}
	
	public int delete(int myno) {
		
		
		return 0;
	}
	
	
	public int update(MyBoardDto dto) {
		
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
