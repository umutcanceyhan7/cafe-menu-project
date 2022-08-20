package main;

import java.util.Scanner;

import itemMenuSearchTree.Item;
import itemMenuSearchTree.ItemMenuSearchTree;

public class Helper {
			public <T> void numberOne(Item root) {
				
				System.out.println("-------Number One: Print the minimum and maximum priced coffee on the menu.");
				ItemMenuSearchTree coffeeTree = new ItemMenuSearchTree();
				// Coffees lined up in ascending order so first item cheapest last item most expensive one.
				coffeeTree = makeSubTree(root,coffeeTree,CoffeeMenuApp.BEVERAGES[0]);
				// First and last item found and printed.
				findAndPrintMinMax(coffeeTree);
				
			}
			public <T> void numberTwo(Item root) {
				
				System.out.println("-------Number Two: Print the minimum and maximum priced tea on the menu.");
				ItemMenuSearchTree teaTree = new ItemMenuSearchTree();
				// Coffees lined up in ascending order so first item cheapest last item most expensive one.
				teaTree = makeSubTree(root,teaTree,CoffeeMenuApp.BEVERAGES[2]);
				// First and last item found and printed.
				findAndPrintMinMax(teaTree);
				
			}
			public <T> void numberThree(Item root) {
				
				System.out.println("-------Number Three: Print the minimum and maximum priced bakery item on the menu. ");
				ItemMenuSearchTree bakeryTree = new ItemMenuSearchTree();
				// Coffees lined up in ascending order so first item cheapest last item most expensive one.
				bakeryTree = makeSubTree(root,bakeryTree,CoffeeMenuApp.BAKERY);
				// First and last item found and printed.
				findAndPrintMinMax(bakeryTree);
				
			}
			public <T> void numberFour(Item root) {
				System.out.println("-------Number Four: Print all items in descending order in terms of the price.");
				inOrderTraverseReverse(root);
			}
			public <T> void numberFive(Item root) {
				System.out.println("-------Number Five: Print all items in ascending order in terms of the price.");
				inOrderTraverse(root);
			}
			public <T> void numberSix(Item root) {
				System.out.println("-------Number Six:  Print all coffees in descending order in terms of the price.");
				traverseCoffeeReverse(root);
			}
			public <T> void numberSeven(Item root) {
				System.out.println("-------Number Seven: Print all frappuccinos in ascending order in terms of the price.");
				inOrderTraverseFrappuccino(root);
			}
			public <T> void numberEight(Item root) {
				System.out.println("-------Number Eight: Print all teas in descending order in terms of the price.");
				inOrderTraverseTeaRecerse(root);
			}
			public <T> void numberNine(Item root) {
				System.out.println("-------Number Nine: Print all items whose prices are less or equal than the amount taken from the console.");
				Scanner scanner = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter price for 9: ");
			    String price = scanner.nextLine();
				showCheaperItems(root,Integer.parseInt(price));
			}
			public <T> void numberTen(Item root) {
				System.out.println("-------Number Ten: Print all items whose prices are greater than the amount taken from the console. ");
				Scanner scanner = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter price for 10: ");
			    String price = scanner.nextLine();
			    showMoreExpensive(root,Integer.parseInt(price));
			}
			public <T> void numberEleven(Item root) {
				System.out.println("-------Number eleven: Print all bakeries whose calorie is less or equal than the amount taken from the console.");
				Scanner scanner = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter calorie for 11: ");
			    String calorie = scanner.nextLine();
			    showLightBakeries(root,Integer.parseInt(calorie));
			}
			public <T> void numberTwelve(Item root) {
				System.out.println("-------Number twelve: Print all bakeries whose calorie is greater than than the amount taken from the console.");
				Scanner scanner = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter calorie for 12: ");
			    String calorie = scanner.nextLine();
			    showHighCalorieBakeries(root,Integer.parseInt(calorie));
			}
			public <T> void numberThirteen(Item root) {
				System.out.println("-------Number thirteen: Print all coffees in descending order in terms of the price, where coffee size is taken from the console. ");
				Scanner scanner = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter size for 13: ");
			    String itemSize = scanner.nextLine();
			    compareCoffeePrices(root,itemSize);
			}
			public <T> void numberFourteen(Item root) {
				System.out.println("-------Number fourteen:Print all teas in descending order in terms of the price, where tea size is taken from the console. ");
				Scanner scanner = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter size for 14: ");
			    String itemSize = scanner.nextLine();
			    compareTeaPrices(root,itemSize);
			}
			
			
			
			// 1,2,3 Numara
			public <T> ItemMenuSearchTree makeSubTree(Item focusItem, ItemMenuSearchTree subTree,String itemType) {
				// Create sub tree
				if(focusItem != null) {
					
					makeSubTree(focusItem.getLeft(),subTree,itemType);
					if(focusItem.getItemType().equals(itemType)) {
						subTree.add(focusItem.getItemType(),focusItem.getItemName(),focusItem.getPrice(),focusItem.getItemProperty());
						
					}
					makeSubTree(focusItem.getRight(),subTree,itemType);
				}
				
				return subTree;
			}		
				// Find values and print them
			public void findAndPrintMinMax(ItemMenuSearchTree subTree) {
				Item tempItem = subTree.getRoot();
				while(tempItem.getRight() != null) {
					tempItem = tempItem.getRight();
				}
				Item theMostExpensiveItem = tempItem;
				Item theCheapestItem = subTree.getRoot();
				System.out.println(theCheapestItem.toString());
				System.out.println(theMostExpensiveItem.toString());
			}
			
			// 4 Numara
			public <T> void inOrderTraverseReverse(Item focusItem) {
				
				if(focusItem != null) {
					inOrderTraverseReverse(focusItem.getRight());
					System.out.println(focusItem.toString());
					inOrderTraverseReverse(focusItem.getLeft());
				}
			}
			// 5 Numara
			public <T> void inOrderTraverse(Item focusItem) {
							
				if(focusItem != null) {
					inOrderTraverse(focusItem.getLeft());
					System.out.println(focusItem.toString());
					inOrderTraverse(focusItem.getRight());
				}
			}
			// 6 Numara
			public <T> void traverseCoffeeReverse(Item focusItem) {
		
				if(focusItem != null) {

					traverseCoffeeReverse(focusItem.getRight());
					if(focusItem.getItemType().equals(CoffeeMenuApp.BEVERAGES[0])) {
						System.out.println(focusItem.toString());
				}
					traverseCoffeeReverse(focusItem.getLeft());

				}
			}
			// 7 Numara
			public <T> void inOrderTraverseFrappuccino(Item focusItem) {
			
				if(focusItem != null) {
	
					inOrderTraverseFrappuccino(focusItem.getLeft());
					if(focusItem.getItemType().equals(CoffeeMenuApp.BEVERAGES[1])) {
						System.out.println(focusItem.toString());
					}
					inOrderTraverseFrappuccino(focusItem.getRight());
	
				}
		}
			// 8 Numara
			public <T> void inOrderTraverseTeaRecerse(Item focusItem) {
			
				if(focusItem != null) {
	
					inOrderTraverseTeaRecerse(focusItem.getRight());
					if(focusItem.getItemType().equals(CoffeeMenuApp.BEVERAGES[2])) {
						System.out.println(focusItem.toString());
					}
					inOrderTraverseTeaRecerse(focusItem.getLeft());
	
				}
		}		
			// 9 Numara
			public <T> void showCheaperItems(Item focusItem, int price) {
			
				if(focusItem != null) {
	
					showCheaperItems(focusItem.getRight(),price);
					
					if(price >= focusItem.getPrice()) {
						System.out.println(focusItem.toString());
					}
					showCheaperItems(focusItem.getLeft(),price);
	
				}
		}
			// 10 Numara
			public <T> void showMoreExpensive(Item focusItem, int price) {
					
					if(focusItem != null) {

						showMoreExpensive(focusItem.getRight(),price);
						
						if(price < focusItem.getPrice()) {
							System.out.println(focusItem.toString());
						}
						showMoreExpensive(focusItem.getLeft(),price);

					}
				}
			// 11 Numara
			public <T> void showLightBakeries(Item<Integer> focusItem, int calorie) {
					
				if(focusItem != null) {

					showLightBakeries(focusItem.getRight(),calorie);
						
					if(focusItem.getItemType().equals(CoffeeMenuApp.BAKERY)) {
						if(focusItem.getItemProperty() <= calorie)
						
						System.out.println(focusItem.toString());
					}
					showLightBakeries(focusItem.getLeft(),calorie);
					}
				}
			// 12 Numara
			public <T> void showHighCalorieBakeries(Item<Integer> focusItem, int calorie) {				
				if(focusItem != null) {

					showHighCalorieBakeries(focusItem.getRight(),calorie);
								
					if(focusItem.getItemType().equals(CoffeeMenuApp.BAKERY)) {
						if(focusItem.getItemProperty() > calorie ) {
							System.out.println(focusItem.toString());
						}
					}
					showHighCalorieBakeries(focusItem.getLeft(),calorie);
				}
			}
			// 13 Numara Checked
			// DESCENDING START WITH RIGHT SUBTREE
			public <T> void compareCoffeePrices(Item<String> focusItem, String itemSize) {				
				if(focusItem != null) {
				  compareCoffeePrices(focusItem.getRight(),itemSize);						
							if(focusItem.getItemType().equals(CoffeeMenuApp.BEVERAGES[0]) && focusItem.getItemProperty().equals(itemSize)) {
									System.out.println(focusItem.toString());
							}
							compareCoffeePrices(focusItem.getLeft(),itemSize);
					}
			}		
			// 14 Numara Checked
			// DESCENDING START WITH RIGHT SUBTREE
			public <T> void compareTeaPrices(Item<String> focusItem, String itemSize) {				
					if(focusItem != null) {
							compareTeaPrices(focusItem.getRight(),itemSize);						
								if(focusItem.getItemType().equals(CoffeeMenuApp.BEVERAGES[2]) && focusItem.getItemProperty().equals(itemSize)) {
										System.out.println(focusItem.toString());
								}
								compareTeaPrices(focusItem.getLeft(),itemSize);
					
					}
				}
}
	

