/* Momin Jafri
 * 950716432
 * CS211 -- Taesik Kim
 * Burger211
 * This program generates a Menu GUI which displays three burgers along with their toppings and prices. 
 * This is the main Burger211 class where we initialize all our methods and variables we will implement into our subclasses.
 */

import java.util.ArrayList;

class BurgerInfo{ //initialize variables in this class
	String name;
	double price;
	String topping;
	
}
public abstract class Burger211 {
	
	double discountRate;
	String promote;
	String franchise;
	
	private ArrayList<BurgerInfo> Burger = new ArrayList<>(); //private AL for Burger toppings/prices
	
	Weather temp = new Weather(); //create object for Weather
	
	public void Weather() throws Exception {
		if(temp.getRedmond() > 290.0) { //weather discounts for promotion
			discountRate = 0.1;
		} if(temp.getBaltimore() > 290.0) {
			discountRate = 0.1;
		} if(temp.getDubai() > 300.0) {
			discountRate = 0.1;
		} if(temp.getABD() > 300.0) {
			discountRate = 0.1;
		}
	}
	
	public String getBurgerName(int i) { //method for calling upon Burger names, more methods for calling upon variables
		return Burger.get(i).name; 
		
	}
	
	public double getBurgerPrice(int i) {
		return Burger.get(i).price;
	}
	
	public String getBurgerTopping(int i) {
		return Burger.get(i).topping;
	}
	
	public int getHowManyBurgers() {
		return Burger.size();
	}
	
	abstract void Promotion(Double discountRate, String promote); //initialize for subclass
	abstract void Menu(String franchise);
	
	Burger211(){ //make constructor 
		
		BurgerInfo b1 = new BurgerInfo(); //create object and add these values to Array
		b1.name = "Inheritance Burger";
		b1.price = 3.0;
		b1.topping = "beef patty, tomato, onion, mustard";
		Burger.add(b1);
		
		BurgerInfo b2 = new BurgerInfo();
		b2.name = "Overriding Burger";
		b2.price = 2.0;
		b2.topping = "beef patty, lime, onion, lettuce, tomato";
		Burger.add(b2);
		
		BurgerInfo b3 = new BurgerInfo();
		b3.name = "Polymorphism Burger";
		b3.price = 3.5;
		b3.topping = "chicken, onion, lettuce, bbq sauce";
		Burger.add(b3);
		
	}

}
