package com.mvc.biz;

import java.util.List;

import com.mvc.dao.MyMVCDao;
import com.mvc.dao.MyMVCDaoImpl;
import com.mvc.dto.MyMVCDto;

public class MyMVCBizImpl implements MyMVCBiz{

	private MyMVCDao dao = new MyMVCDaoImpl();
	
	@Override
	public List<MyMVCDto> selectAll() {
		return dao.selectAll();
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
