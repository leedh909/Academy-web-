package silsub2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
//	public Product(String pName,int price, String brand) {
//		this.pName = pName;
//		this.price = price;
//		this.brand = brand;
//	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public String information() {
		return pName+", "+price+", "+brand;
	}
	
	
	
	
	
	
}
