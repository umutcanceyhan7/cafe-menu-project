package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import itemMenuSearchTree.ItemMenuSearchTree;

public class FileIO {
	public static <T> ItemMenuSearchTree readFile() { 
	
		ItemMenuSearchTree itemMenu = new ItemMenuSearchTree();
		
		File file = new File(CoffeeMenuApp.ITEMS_FILE);
		Scanner  sc;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] values = line.split(",");
				// Creating item
				// COFFEE
				if(values[0].equals(CoffeeMenuApp.BEVERAGES[0])) {
					Coffee tempItem = new Coffee(values[1],Integer.parseInt(values[2]),values[3]);
					itemMenu.add(tempItem.itemType(), tempItem.itemName(), tempItem.itemPrice(), tempItem.getCoffeeSize());
				}
				// FRAPPUCCINO
				else if(values[0].equals(CoffeeMenuApp.BEVERAGES[1])) {
					Frappuccino tempItem = new Frappuccino(values[1],Integer.parseInt(values[2]),values[3]);
					itemMenu.add(tempItem.itemType(), tempItem.itemName(), tempItem.itemPrice(), tempItem.getFrappuccinoSize());
				}
				// TEA
				else if(values[0].equals(CoffeeMenuApp.BEVERAGES[2])) {
					Tea tempItem = new Tea(values[1],Integer.parseInt(values[2]),values[3]);
					itemMenu.add(tempItem.itemType(), tempItem.itemName(), tempItem.itemPrice(), tempItem.getTeaSize());
				}
				// BAKERY
				else {
					Bakery tempItem = new Bakery(values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]));
					itemMenu.add(tempItem.itemType(), tempItem.itemName(), tempItem.itemPrice(), tempItem.getCalories());
				}
				
				
			}
			// BIGGER LOOP ENDS.
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return itemMenu;
			}
	}