package product.model.vo;

public class Product {

	private String pid;
	private String pName;
	private int price;
	private String desc;
	
	//생성자(기본,매개변수)
	public Product() { super(); }
	public Product(String pid, String pName, int price, String desc) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.price = price;
		this.desc = desc;
	}

	//getter & setter
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	//toString
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", price=" + price + ", desc=" + desc + "]";
	}
	
	
	
	
	
	
}
