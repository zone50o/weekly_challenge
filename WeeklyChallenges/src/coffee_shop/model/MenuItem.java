package coffee_shop.model;

public class MenuItem {
	private String item;
	private String type;
	private Double price;
	
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MenuItem(String item, String type, Double price) {
		super();
		this.item = item;
		this.type = type;
		this.price = price;
	}

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "item= " + item + " type= " + type + " price= $" + String.format("%.2f", price);
	}
	
}
