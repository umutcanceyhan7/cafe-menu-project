package itemMenuSearchTree;
import binarySearchTree.Node;
import main.CoffeeMenuApp;
public class Item<T> {
	int price; // Price
	String itemName; // Name
	T itemProperty; // Size or Calories
	String itemType; // Type
	Item<T> left, right;
	
	Item(String itemType, String itemName, int price, T itemProperty){
		this.itemType = itemType;
		this.itemName = itemName;
		this.price = price;
		this.itemProperty = itemProperty;
	}
	public String toString() {
		return "Item type: " + this.itemType + "\n" + "Item name: " + this.itemName + "\n" + "Item price: " + this.price + "\n" + "Item property: " + this.itemProperty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public T getItemProperty() {
		return itemProperty;
	}
	public void setItemProperty(T itemProperty) {
		this.itemProperty = itemProperty;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public Item<T> getLeft() {
		return left;
	}
	public void setLeft(Item<T> left) {
		this.left = left;
	}
	public Item<T> getRight() {
		return right;
	}
	public void setRight(Item<T> right) {
		this.right = right;
	}
	
}
