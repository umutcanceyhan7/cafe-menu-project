package main;
import itemMenuSearchTree.ItemMenuSearchTree;
public class CoffeeMenuApp {
	
	public static final String ITEMS_FILE = "./CENG112_HW4_CafeMenu.txt";
	public static final String[] BEVERAGES = {"Coffee","Frappuccino","Tea"};
	public static final String BAKERY = "Bakery";
	
	public static void main(String[] args) {
		Simulation simulation = new Simulation();
		simulation.run();
		
	}


}
