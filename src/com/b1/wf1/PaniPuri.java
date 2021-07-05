package com.b1.wf1;

import com.b1.wf1.FoodItems.Category;
import com.b1.wf1.FoodItems.Taste;
//import com.b1.wf1.FoodItems.Type;

public class PaniPuri extends FoodItems implements IVeg {

	public PaniPuri() {
		taste = Taste.SPICY;
		category = Category.STARTERS;
		// type = Type.VEG;
		preparationTime = 10;
		name = "PaniPuri";
	}

	@Override
	public void mainIngredient() {
		System.out.println("1.WATER, 2.PURI");
	}
}
