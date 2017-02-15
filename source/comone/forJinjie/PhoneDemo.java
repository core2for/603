package comone.forJinjie;

class Phone {
	private String brand;
	private int price;
	private String color;

	//getXxx()和setXxx()方法
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone();

		System.out.println(p.getBrand() + "0------" + p.getPrice() + "----" + p.getColor());

		//给成员变量赋值
		p.setBrand("三星");
		p.setPrice(2000);
		p.setColor("白色");
		System.out.println(p.getBrand() + "0------" + p.getPrice() + "----" + p.getColor());

	}
}