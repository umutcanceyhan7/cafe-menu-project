package main;
public class Coffee implements IItem {
	 private String coffeeName;
	 private String coffeeSize;
	 private int coffeePrice;
	 private int itemType;
	 public Coffee(String itemName, int price,String itemSize){
		 this.coffeeName = itemName;
		 this.coffeeSize = itemSize;
		 this.coffeePrice = price;
	 }
	 public String toString() {
		 return "Item name:" + coffeeName + "\n" + "Item size: " + coffeeSize + "\n" + "Item type: " + itemType() + "\n"+ "Item price: " + itemPrice() +"\n";
	 }
	 
	public String itemName() {
		return getCoffeeName();
	}

	public String itemType() {
		return CoffeeMenuApp.BEVERAGES[0];
	}

	public int itemPrice() {
		return getCoffeePrice();
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public String getCoffeeSize() {
		return coffeeSize;
	}
	public void setCoffeeSize(String coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
}
