package product.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import product.model.vo.Product;
import static common.JDBCTemplate.*;

public class ProductDao {

	private Properties prop;
	
	public ProductDao(){
		try {
			prop = new Properties();
			prop.load(new FileReader("query.properties"));
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	public ArrayList<Product> selectAll(Connection con) {

		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		ArrayList<Product> list = null;
		String sql = prop.getProperty("selectAll");
		
		try {
			pstm= con.prepareStatement(sql);
			rs = pstm.executeQuery();
			list = new ArrayList<Product>();
			
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getString(1));
				p.setpName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setDesc(rs.getString(4));
			
				list.add(p);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
		}
		
		return list;
	}
	public Product selectOne(Connection con, String pid) {
		
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		Product tmp = null;
		String sql = prop.getProperty("selectOne");
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, pid);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				tmp = new Product();
				tmp.setPid(rs.getString(1));
				tmp.setpName(rs.getString(2));
				tmp.setPrice(rs.getInt(3));
				tmp.setDesc(rs.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
		}
		
		
		return tmp;
	}
	public int insert(Connection con, Product in) {

		PreparedStatement pstm = null;
		String sql = prop.getProperty("insert");

		int res = 0;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, in.getPid());
			pstm.setString(2, in.getpName());
			pstm.setInt(3, in.getPrice());
			pstm.setString(4, in.getDesc());
			
			res = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			
		}
		
		return res;
	}
	public int update(Connection con, Product up) {

		PreparedStatement pstm = null;
		String sql = prop.getProperty("update");
		int res = 0;
		
		try {
			pstm= con.prepareStatement(sql);
			pstm.setString(1, up.getpName());
			pstm.setInt(2, up.getPrice());
			pstm.setString(3, up.getDesc());
			pstm.setString(4, up.getPid());
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		
		return res;
	}
	public int delete(Connection con, String del_pid) {

		PreparedStatement pstm = null;
		String sql = prop.getProperty("delete");
		
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, del_pid);
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		
		return res;
	}
	
	
	
}
