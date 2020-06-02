package product.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import product.model.dao.ProductDao;
import product.model.vo.Product;

public class ProductService {

	
	public List<Product> selectAll() {

		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		
		ArrayList<Product> res = dao.selectAll(con);
		close(con);
		return res;
	}

	public Product selectOne(String pid) {
		
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		
		Product res = dao.selectOne(con, pid);
		close(con);
		
		return res;
	}

	public int insert(Product in) {

		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		
		int res = dao.insert(con,in);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

	public int update(Product up) {
		
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		
		int res = dao.update(con, up);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

	public int delete(String del_pid) {

		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		
		int res = dao.delete(con,del_pid);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}
	
	
	
	
	
	
	
}
