package com.b1.wf1;

//import java.util.List;

import com.b1.wf1.FoodItems.Category;
import com.b1.wf1.FoodItems.Taste;
//import com.b1.wf1.FoodItems.Type;

public class Biriyani extends FoodItems implements INonVeg {

	public Biriyani() {
		taste = Taste.SPICY;
		category = Category.MAINCOURSE;
		// type = Type.VEG;
		preparationTime = 20;
		name = "Biriyani";
	}

	@Override
	public void printMainIngredents() {
		System.out.println("1.chicken, 2.RICE");
	}

	@Override
	public void mainIngredient() {
		// TODO Auto-generated method stub
		
	}
}