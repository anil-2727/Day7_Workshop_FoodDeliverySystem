package com.b1.wf1;


//import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class FoodManager {

	Set<FoodItems>foodList = new HashSet<>();

	public void add(FoodItems foodItems) {
		foodList.add(foodItems);
	}

	void print() {
		for (FoodItems element : foodList) {
			System.out.println(element);
		}
	}

	public void delete(FoodItems foodItems) {
		foodList.remove(foodItems);
	}

	public int getFoodCount() {
		return foodList.size();
	}

	 public FoodItems getFoodItem(String name) {
		Iterator iterator = foodList.iterator();
		  if (iterator.hasNext()) {
			  for (int i = 0; i < foodList.size(); i++) {
	                if (iterator.hasNext()) {
	                    FoodItems foodItems = (FoodItems) iterator.next();
	                    if (foodItems.name.equalsIgnoreCase(name)) {
	                        return foodItems;
	                    }
	                }
	            }
	        }
	        return null;
	 }

	public void printAllVegItems() {
		System.out.println("printing all the veg items");
		for (FoodItems elements : foodList) {
			if (elements instanceof IVeg) {
				System.out.println(elements);
			}

		}
	}

	public void printAllNonVegItems() {
		System.out.println("printing all the non items");
		for (FoodItems elements : foodList) {
			if (elements instanceof INonVeg) {
				System.out.println(elements);
			}
		}
	}
}
