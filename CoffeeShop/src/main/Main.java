package main;

import java.util.ArrayList;

import main.model.CoffeeShop;
import main.model.MenuItem;

public class Main {
	
	public static void main(String args[]) {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		
		menu.add(new MenuItem("Hot Dog","Food",5.99));
		menu.add(new MenuItem("Burrito","Food",6.99));
		menu.add(new MenuItem("Tacos","Food",5.49));
		menu.add(new MenuItem("Pizza","Food",11.99));
		menu.add(new MenuItem("Chicken","Food",9.99));
		menu.add(new MenuItem("Coke","Drink",1.90));
		menu.add(new MenuItem("Tea","Drink",2.60));
		menu.add(new MenuItem("Coffee","Drink",1.99));
		menu.add(new MenuItem("Milk","Drink",1.75));
		menu.add(new MenuItem("Water","Drink",1.20));
		menu.add(new MenuItem("Orange juice","Drink",2.15));
		
		CoffeeShop shop = new CoffeeShop("Gamer CoffeeShop", menu, new ArrayList<MenuItem>());
		
		System.out.println("Welcome to "+shop.getName());
	    
	    //Printing all the Food items in the Menu
	    System.out.println("Foods: ");
	    for(String element: shop.foodOnly()) {
	    	System.out.println(element);
	    }
	    
	    //Printing all the Drinks items in the Menu
	    System.out.println("Drinks: ");
	    for(String element: shop.drinksOnly()) {
	    	System.out.println(element);
	    }
	    
	    //Printing the cheapest item in the Menu
	    System.out.println("Our cheapest item: "+ shop.cheapestItem());
	    
	    //Printing the empty order list of items
	    System.out.println("Current orders: ");
	    for(MenuItem element: shop.listOrders()) {
	    	System.out.println(element);
	    }
	    
	    //Fulfilling an empty order
	    System.out.println(shop.fulfillOrder());
	    
	    //Adding items to the orders queue
	    System.out.println(shop.addOrder("Burger"));
	    System.out.println(shop.addOrder("Coke"));
	    System.out.println(shop.addOrder("Water"));
	    
	    //Printing the order items
	    System.out.println("Current orders: "+shop.getOrders());
	    
	    //Printing the total of the order
	    System.out.printf("Your total: $%.2f",shop.dueAmount()).println();
	    
	    //Fulfilling the orders
	    for(int i = 0; i < shop.getOrders().size(); i++) {
	    	System.out.println(shop.fulfillOrder());
	    }
	}
	
	
}
