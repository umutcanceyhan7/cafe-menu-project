package main;

import itemMenuSearchTree.ItemMenuSearchTree;

public class Simulation {
	public void run() {
		ItemMenuSearchTree itemMenu = FileIO.readFile();
		Helper helper = new Helper();
		System.out.println("------------------------------- WELCOME TO MY CAFE -------------------------------");
		helper.numberOne(itemMenu.getRoot());
		helper.numberTwo(itemMenu.getRoot());
		helper.numberThree(itemMenu.getRoot());
		helper.numberFour(itemMenu.getRoot());
		helper.numberFive(itemMenu.getRoot());
		helper.numberSix(itemMenu.getRoot());
		helper.numberSeven(itemMenu.getRoot());
		helper.numberEight(itemMenu.getRoot());
		helper.numberNine(itemMenu.getRoot());
		helper.numberTen(itemMenu.getRoot());
		helper.numberEleven(itemMenu.getRoot());
		helper.numberTwelve(itemMenu.getRoot());
		helper.numberThirteen(itemMenu.getRoot());
		helper.numberFourteen(itemMenu.getRoot());
	}
}
