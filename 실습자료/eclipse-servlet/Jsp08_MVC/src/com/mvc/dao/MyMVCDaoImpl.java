package com.mvc.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mvc.dto.MyMVCDto;

public class MyMVCDaoImpl implements MyMVCDao{

	@Override
	public List<MyMVCDto> selectAll() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyMVCDto> res = new ArrayList<MyMVCDto>();
		
		try {
			pstm = con.prepareStatement(selectAllSql);
			System.out.println("03. query 준비: "+selectAllSql);
			
			rs = pstm.executeQuery();
			System.out.println("04. query 실행 및 리턴");
			while(rs.next()) {
				
				MyMVCDto tmp = new MyMVCDto();
				tmp.setSeq(rs.getInt(1));
				tmp.setWriter(rs.getString(2));
				tmp.setTitle(rs.getString(3));
				tmp.setContent(rs.getString(4));
				tmp.setRegdate(rs.getDate(5));
				
				res.add(tmp);
			}
		} catch (SQLException e) {
			System.out.println("03/04 단계 오류");
			e.printStackTrace();
			
		}finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05. db 종료 \n");
		}
	
		return res;
	}

	@Override
	public MyMVCDto selectOne(int seq) {
		return null;
	}

	@Override
	public boolean insert(MyMVCDto dto) {
		return false;
	}

	@Override
	public boolean update(MyMVCDto dto) {
		return false;
	}

	@Override
	public boolean delete(int seq) {
		return false;
	}

	
	
	
	
}
