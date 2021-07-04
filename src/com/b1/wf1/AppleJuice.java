package com.b1.wf1;

import com.b1.wf1.FoodItems.Category;
import com.b1.wf1.FoodItems.Taste;
//import com.b1.wf1.FoodItems.Type;

public class AppleJuice extends FoodItems implements IVeg {

	public AppleJuice() {
		taste = Taste.SWEETY;
		category = Category.JUICES;
		// type = Type.VEG;
		preparationTime = 5;
		name = "AppleJuice";
	}

	@Override
	public void mainIngredient() {
		System.out.println("1.APPLE, 2.MILK");
	}

	@Override
	public void printMainIngredents() {
		// TODO Auto-generated method stub
		
	}
}