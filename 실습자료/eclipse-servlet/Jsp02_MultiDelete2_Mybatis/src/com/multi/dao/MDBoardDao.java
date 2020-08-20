package com.multi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.multi.dto.MDBoardDto;

public class MDBoardDao extends SqlMapConfig{

	private String namespace = "com.my.multi.";
	
	//게시판 목록
	public List<MDBoardDto> selectAll(){
		
		List<MDBoardDto> res = new ArrayList<MDBoardDto>();
		
		SqlSession session = null;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectList(namespace+"selectAll");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}
	
	public int insert(MDBoardDto dto){
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.insert(namespace+"insert",dto);
			
			if(res>0) {
				session.commit();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return res;
	}
	
	//글 선택
	public MDBoardDto selectOne(int seq) {
		
		//1.Mapper 파일 생성
		// - resultMap을 활용하여 select한 결과값 리턴받기
		// - parameter는 seq
		// - sql문의 id는 'selectOne'
		
		//2.Dao에서 해당 Mapper파일의 쿼리문을 실행한 후
		// 결과값을 리턴
		
		SqlSession session = null;
		MDBoardDto res = null;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectOne(namespace+"selectOne",seq);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
		}
		 
		return res;
	}
	
	//글 수정
	public int update(MDBoardDto dto) {
		
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.update(namespace+"update",dto);
			
			if(res>0) {
				session.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}
	
	//글 삭제
	public int delete(int seq) {
		
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.delete(namespace+"delete",seq);
			
			if(res>0) {
				session.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}


	//다중 삭제(한번에 처리)
	public int multiDelete(String[] seq) {
		
		int count = 0;
		
		Map<String, String[]> map = new HashMap<String,String[]>();
		map.put("seq", seq);
		
		SqlSession session = null;
		
		try {
			session=getSqlSessionFactory().openSession();
			count = session.delete(namespace+"muldel",map);
			if(count>0) {
				session.commit();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		return count;
	}

}



















