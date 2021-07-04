package com.b1.wf1;

import java.util.Objects;

interface IVeg {
}

interface INonVeg {
}

// import java.util.ArrayList;
// import java.util.List;

public abstract class FoodItems {

	enum Taste {
		SPICY, SWEETY, SALTY, SPICY_SALTY
	};

	enum Category {
		MAINCOURSE, STARTERS, JUICES, DESSERT
	};

	// enum Type {
	// VEG,NON_VEG

	// };

	@Override
	public String toString() {
		return "FoodItems[taste=" + taste + " , category=" + category + ", preparationTime=" + preparationTime
				+ " + name=" + name + "]";
	}

	public abstract void printMainIngredents();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		return category == other.category && Objects.equals(name, other.name)
				&& preparationTime == other.preparationTime
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && taste == other.taste;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, name, preparationTime, price, taste);
	}

	String name;
	Category category;
	Taste taste;
	byte price;
	byte preparationTime;

	public abstract void mainIngredient();
}
