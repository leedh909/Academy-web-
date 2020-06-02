package product.controller;

import java.util.List;

import product.model.service.ProductService;
import product.model.vo.Product;

public class ProductController {

	ProductService ps = new ProductService();
	
	
	public List<Product> selectAll(){
		
		return ps.selectAll();
	}
	
	public Product selectOne(String pid) {
		
		return ps.selectOne(pid);
	}

	public int insert(Product in) {

		return ps.insert(in);
	}

	public int update(Product up) {

		return ps.update(up);
	}

	public int delete(String del_pid) {
	
		return ps.delete(del_pid);
	}
	
	
	
	
	
	
	
}
