package com.b1.wf1;

import java.util.Scanner;

public class Main {
	FoodManager foodManager = new FoodManager();

	public static void main(String[] args) {
		Biriyani biriyani = new Biriyani();
		biriyani.price = (byte) 150;
		biriyani.printMainIngredents();
		Biriyani biriyani1 = new Biriyani();
		biriyani1.price = (byte) 160;
		biriyani.printMainIngredents();

		AppleJuice applejuice = new AppleJuice();
		applejuice.price = 50;
		applejuice.printMainIngredents();
		Dosa dosa = new Dosa();
		dosa.price = 60;
		dosa.printMainIngredents();
		PaniPuri puri = new PaniPuri();
		puri.price = 20;
		puri.printMainIngredents();

		Main mainObj = new Main();

		// FoodManager foodManager = new FoodManager();
		mainObj.foodManager.add(biriyani);
		mainObj.foodManager.add(biriyani1);
		mainObj.foodManager.add(dosa);
		mainObj.foodManager.add(puri);
		mainObj.foodManager.add(applejuice);
		mainObj.foodManager.print();
		/*
		 * System.out.println(mainObj.foodManager.getFoodCount());
		 * mainObj.foodManager.delete(applejuice);
		 * 
		 * mainObj.foodManager.print();
		 * System.out.println(mainObj.foodManager.getFoodCount());
		 * 
		 * mainObj.foodManager.printAllVegItems();
		 * mainObj.foodManager.printAllNonVegItems();
		 */
		mainObj.showMenu();
	}

	public void showMenu() {
		System.out.println("1. To Update Food Items");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			UpdateFoodItem();
			break;
		default:
			System.out.println("ERROR");
			break;
		}

	}

	private void UpdateFoodItem() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Food Item");
		String item = sc.next();
		FoodItems foodItems = foodManager.getFoodItem(item);
		System.out.println(foodItems);

		int parameter = 0;
		while (parameter != 5) {
			System.out.println("Enter 1-Taste 2-Prep Time, 3-name, 4-Category");
			parameter = sc.nextInt();

			switch (parameter) {
			case 1:
				upDateTaste(foodItems);
				break;
			case 2:
				upDateTaste(foodItems);
				break;
			case 3:
				upDateTaste(foodItems);
				break;
			case 4:
				updateCategory(foodItems);
				break;
			}
			System.out.println(foodItems);
		}
	}

	public void upDateTaste(FoodItems foodItem) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" to change taste");
		System.out.println("Enter 1 to change SPICY");
		System.out.println("Enter 2 to change SWEETY");
		System.out.println("Enter 3 to change SALTY");
		System.out.println("Enter 4 to change SPICY_SALTY");
		System.out.print("Enter your choice : ");
		int taste = scanner.nextInt();

		switch (taste) {
		case 1:
			foodItem.taste = FoodItems.Taste.SPICY;
			break;
		case 2:
			foodItem.taste = FoodItems.Taste.SWEETY;
			break;
		case 3:
			foodItem.taste = FoodItems.Taste.SALTY;
			break;
		case 4:
			foodItem.taste = FoodItems.Taste.SPICY_SALTY;
			break;
		default:
			System.out.println("Enter the Right Taste");
			break;
		}
	}

	private void updateCategory(FoodItems foodItems) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" to change Category");
		System.out.println("Enter 1 to change MAINCOURSE");
		System.out.println("Enter 2 to change STARTERS ");
		System.out.println("Enter 3 to change JUICES");
		System.out.println("Enter 4 to change DESSERT");
		System.out.print("Enter your choice :  ");
		int Category = scanner.nextInt();

		switch (Category) {
		case 1:
			foodItems.category = FoodItems.Category.MAINCOURSE;
			break;
		case 2:
			foodItems.category = FoodItems.Category.STARTERS;
			break;
		case 3:
			foodItems.category = FoodItems.Category.JUICES;
			break;
		case 4:
			foodItems.category = FoodItems.Category.DESSERT;
			break;
		default:
			System.out.println("Enter the Right Taste");
			break;

		}

	}
}
