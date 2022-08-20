package main;
public class Tea {
	private String teaName;
	 private String teaSize;
	 private int teaPrice;
	 private int itemType;
	 public Tea(String itemName, int price, String itemSize){
		 this.teaName = itemName;
		 this.teaSize = itemSize;
		 this.teaPrice = price;
	 }
	 public String toString() {
		 return "Item name:" + itemName() + "\n" + "Item size: " + getTeaSize() + "\n" + "Item type: " + itemType() + "\n"+ "Item price: " + itemPrice() +"\n";
	 }
	 
	public String itemName() {
		return getTeaName();
	}

	public String itemType() {
		return CoffeeMenuApp.BEVERAGES[2];
	}

	public int itemPrice() {
		return getTeaPrice();
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getTeaSize() {
		return teaSize;
	}
	public void setTeaSize(String teaSize) {
		this.teaSize = teaSize;
	}
	public int getTeaPrice() {
		return teaPrice;
	}
	public void setTeaPrice(int teaPrice) {
		this.teaPrice = teaPrice;
	}

}
