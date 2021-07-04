package com.b1.wf1;

//import com.b1.wf1.FoodItems.Category;
//import com.b1.wf1.FoodItems.Taste;
//import com.b1.wf1.FoodItems.Type;

public class Dosa extends FoodItems implements IVeg {

	public Dosa() {
		taste = Taste.SPICY;
		category = Category.STARTERS;
		// type = Type.VEG;
		preparationTime = 15;
		name = "Dosa";
	}

	@Override
	public void mainIngredient() {
		System.out.println("1.CHETNI, 2.RICE");
	}

	@Override
	public void printMainIngredents() {
		// TODO Auto-generated method stub
		
	}
}