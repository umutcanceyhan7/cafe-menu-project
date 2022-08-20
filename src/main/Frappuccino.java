package main;

public class Frappuccino implements IItem {
 private String frappuccinoName;
 private String frappuccinoSize;
 private int frappuccinoPrice;
 private int itemType;
 public Frappuccino(String itemName,int price,String itemSize){
	 this.frappuccinoName = itemName;
	 this.frappuccinoSize = itemSize;
	 this.frappuccinoPrice = price;
 }
 public String toString() {
	 return "Item name:" + itemName() + "\n" + "Item size: " + getFrappuccinoSize() + "\n" + "Item type: " + itemType() + "\n"+ "Item price: " + itemPrice() +"\n";
 }
 
public String itemName() {
	return getFrappuccinoName();
}

public String itemType() {
	return CoffeeMenuApp.BEVERAGES[1];
}

public int itemPrice() {
	return getFrappuccinoPrice();
}

public int getFrappuccinoPrice() {
	return frappuccinoPrice;
}

public void setFrappuccinoPrice(int frappuccinoPrice) {
	this.frappuccinoPrice = frappuccinoPrice;
}

public String getFrappuccinoName() {
	return frappuccinoName;
}

public void setFrappuccinoName(String frappuccinoName) {
	this.frappuccinoName = frappuccinoName;
}

public String getFrappuccinoSize() {
	return frappuccinoSize;
}

public void setFrappuccinoSize(String frappuccinoSize) {
	this.frappuccinoSize = frappuccinoSize;
}
 
}
