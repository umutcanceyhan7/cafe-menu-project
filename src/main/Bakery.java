package main;
public class Bakery {
	 private String bakeryName;
	 private int calories;
	 private int price;
	 private int itemType;
	 public Bakery(String itemName,int price, int calories){
		 this.bakeryName = itemName;
		 this.calories = calories;
		 this.price = price;
	 }
	 public String toString() {
		 return "Item name:" + getBakeryName() + "\n" + "Item calory: " + getCalories() + "\n" + "Item type: " + itemType() + "\n"+ "Item price: " + itemPrice() +"\n";
	 }
	 
	public String itemName() {
		return getBakeryName();
	}

	public String itemType() {
		return CoffeeMenuApp.BAKERY;
	}

	public int itemPrice() {
		return getPrice();
	}
	public String getBakeryName() {
		return bakeryName;
	}
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setBakeryPrice(int price) {
		this.price = price;
	}
	
}
