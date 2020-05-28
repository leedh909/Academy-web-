package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product pro = new Product();
		pro.setpName("실습2");
		pro.setPrice(20000);
		pro.setbrand("KH");
		
		System.out.println(pro.information());
		
		
	}

}
