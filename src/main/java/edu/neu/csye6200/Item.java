package edu.neu.csye6200;

import java.util.ArrayList;

public class Item {

	int Id;
	String name;
	int cost;

	public Item(int id, String name, int cost) {
		super();
		Id = id;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [Id=" + Id + ", name=" + name + ", cost=" + cost + "]";
	}

	public static void demo() {

		
		Cart c1 = new Cart(String.valueOf(new java.util.Date()));
		System.out.println("Time is " + c1.time);
		System.out.println("************** Custemor one Item are ******************");
	
		//Items for person one
		Item one =new Item(01, "Sugar", 4);
		System.out.println(one.toString());
		c1.add(one);
		c1.sillyCheckout(c1.getMyDeposit(),one.cost,c1.getMyTotal(),c1.getMyChange());
		System.out.println();
		
		Item two = new Item(13, "Bread", 2);
		System.out.println(two.toString());
		c1.add(two);
		c1.sillyCheckout(c1.getMyDeposit(),two.cost,c1.getMyTotal(),c1.getMyChange());
		System.out.println();
		
		Item three = new Item(13, "eggs", 2);
		System.out.println(three.toString());
		c1.add(three);
		c1.sillyCheckout(c1.getMyDeposit(),three.cost,c1.getMyTotal(),c1.getMyChange());
		System.out.println();
		
		for(Item a : c1.list) {
			c1.calculatTotal(a, c1);
		}
		
		System.out.println("Your Total is - "+c1.getMyTotal());
		System.out.println();
		
		c1.change();
		
		System.out.println();
		System.out.println();

		Cart c2 = new Cart(String.valueOf(new java.util.Date()));
		System.out.println("Time is " + c2.time);
		System.out.println("************** Custemor two Item are ******************");
	
		//Items for person one
		Item four =new Item(9, "Paneer", 8);
		System.out.println(four.toString());
		c2.add(four);
		c2.sillyCheckout(c2.getMyDeposit(),four.cost,c2.getMyTotal(),c2.getMyChange());
		System.out.println();
		
		Item five = new Item(17, "Salad", 6);
		System.out.println(five.toString());
		c2.add(five);
		c2.sillyCheckout(c2.getMyDeposit(),five.cost,c2.getMyTotal(),c2.getMyChange());
		System.out.println();
		
		Item six = new Item(04, "Milk", 12);
		System.out.println(six.toString());
		c2.add(six);
		c2.sillyCheckout(c2.getMyDeposit(),six.cost,c2.getMyTotal(),c2.getMyChange());
		System.out.println();
		
		for(Item a : c2.list) {
			c2.calculatTotal(a, c2);
		}
		
		System.out.println("Your Total is - "+c2.getMyTotal());
		System.out.println();
		
		c2.change();
		
	
		System.out.println();

	} 

}
