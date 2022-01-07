package main.model;

import java.util.ArrayList;

public class CoffeeShop {
	private String name;
	private ArrayList<MenuItem> menu;
	private ArrayList<MenuItem> orders;

	public CoffeeShop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoffeeShop(String name, ArrayList<MenuItem> menu, ArrayList<MenuItem> orders) {
		super();
		this.name = name;
		this.menu = menu;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<MenuItem> menu) {
		this.menu = menu;
	}

	public ArrayList<MenuItem> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<MenuItem> orders) {
		this.orders = orders;
	}

	/**
	 * 
	 * @param name is the name of the item being ordered
	 * @return Empty String if successfully added, else returns "This item is
	 *         currently unavailable"
	 */
	public String addOrder(String name) {
		for (MenuItem element : this.menu) {
			if (element.getItem().equals(name)) {
				this.orders.add(element);
				return "";
			}
		}
		return "This item is currently unavailable";
	}

	/**
	 * 
	 * @return A string stating the oldest order is ready or if there are no orders
	 *         it will return "All orders have been fulfilled!"
	 */
	public String fulfillOrder() {
		if (this.orders.isEmpty()) {
			return "All orders have been fulfilled!";
		}
		return "The " + this.orders.remove(0).getItem() + " is ready!";
	}

	/**
	 * 
	 * @return An array of current orders, will return an empty array if there are
	 *         no orders
	 */
	public MenuItem[] listOrders() {
		if (this.orders.isEmpty()) {
			return new MenuItem[0];
		}
		return (MenuItem[]) this.orders.toArray();
	}

	/**
	 * 
	 * @return total for all current orders
	 */
	public double dueAmount() {
		double total = 0.00;
		for (MenuItem element : this.orders) {
			total += element.getPrice();
		}
		return total;
	}

	/**
	 * 
	 * @return name of the cheapest item on the menu
	 */
	public String cheapestItem() {
		double cheapest = Double.MAX_VALUE;
		MenuItem placeholder = this.menu.get(0);
		for (MenuItem element : this.menu) {
			if (element.getPrice() <= cheapest) {
				placeholder = element;
				cheapest = element.getPrice();
			}
		}
		return placeholder.getItem();
	}

	/**
	 * 
	 * @return array of names of all drinks on the menu
	 */
	public String[] drinksOnly() {
		ArrayList<String> drinks = new ArrayList<String>();
		for (MenuItem element : this.menu) {
			if (element.getType().toLowerCase().equals("drink")) {
				drinks.add(element.getItem());
			}
		}
		String[] temp = new String[drinks.size()];

		for (int i = 0; i < drinks.size(); i++) {
			temp[i] = drinks.get(i);
		}

		return temp;
	}

	/**
	 * 
	 * @return array of names of all food on the menu
	 */
	public String[] foodOnly() {
		ArrayList<String> food = new ArrayList<String>();
		for (MenuItem element : this.menu) {
			if (element.getType().toLowerCase().equals("food")) {
				food.add(element.getItem());
			}
		}
		String[] temp = new String[food.size()];

		for (int i = 0; i < food.size(); i++) {
			temp[i] = food.get(i);
		}

		return temp;
	}

}
