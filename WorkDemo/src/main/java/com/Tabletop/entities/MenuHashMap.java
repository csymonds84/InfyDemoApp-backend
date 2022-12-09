package com.Tabletop.entities;

import java.util.HashMap;

public class MenuHashMap 
{
	// hash map to hold the name of the menu item(key) and cost of the item(value)
	final HashMap<String, Double> menuMap = new HashMap<String, Double>()
	{
		private static final long serialVersionUID = 1L;
	{
		put("BreakfastBurger", 16.00);
		put("Fries", 5.00);
		put("ChoppedSalad", 12.00);
		put("ChickenSandwhich", 16.00);
		put("SpicyChickenSandwhich", 17.00);
		put("SmokehouseBurger", 17.00);
		put("GrilledMushroomSwissBurger", 16.00);
		put("MacNCheese", 5.00);
		put("HouseBurger", 15.00);
		put("RoastedGarlicBrusselSprouts", 5.00);
	}};

	
	public HashMap<String, Double> getMenuMap() {
		return menuMap;
	}


	@Override
	public String toString() {
		return "Menu [menuMap=" + menuMap + "]";
	}



	
	


}
