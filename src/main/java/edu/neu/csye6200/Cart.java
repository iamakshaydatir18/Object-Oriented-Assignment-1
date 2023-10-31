package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private double myDeposit = 20;
	private double myTotal = 0;
	private double myChange;
	String time;

	ArrayList<Item> list;

	public Cart(String time) {
		super();
		this.list = new ArrayList<>();
		this.time = time;
	}
	
	public void add(Item item) {
		this.list.add(item);
	}

	public void sillyCheckout(double cash, double price, double total, double change) {

		// To show pass by VALUE
		System.out.println("Cash is - " + cash + " Price is " + price + " total is -" + price + total);
		System.out.println("Your Change is " + Math.abs(this.myDeposit - price));

	}

	@Override
	public String toString() {
		return "Cart [myDeposit=" + myDeposit + ", myTotal=" + myTotal + ", myChange=" + myChange + "]";
	}

	public void calculatTotal(Item item,Cart cart) {

		//Pass by reference 
		cart.myTotal += item.cost;

	}

	public void change() {

		if (myDeposit - myTotal < 0) {

			this.myChange =  Math.abs(myDeposit - myTotal);
			System.out.print("Please add more "+this.myChange+" cash to settle");
		} else if (myDeposit - myTotal > 0) {

			this.myChange = Math.abs(myDeposit - myTotal);
			System.out.println("Your change is- "+this.myChange);
		}
	}

	public double getMyDeposit() {
		return myDeposit;
	}

	public void setMyDeposit(double myDeposit) {
		this.myDeposit = myDeposit;
	}

	public double getMyTotal() {
		return myTotal;
	}

	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}

	public double getMyChange() {
		return myChange;
	}

	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public ArrayList<Item> getList() {
		return list;
	}

	public void setList(ArrayList<Item> list) {
		this.list = list;
	}

}
