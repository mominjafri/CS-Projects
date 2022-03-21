/* Momin Jafri
 * 950716432
 * CS211 -- Taesik Kim
 * Burger211 -- USA
 * This program generates a Menu GUI which displays three burgers along with their toppings and prices. 
 * This is the USA subclass where we set our promotion and menu to set the variables for the American location
 */

import java.text.DecimalFormat;

public class USA extends Burger211 {

	private double discountRate = 0; //set up variables
	private String [] burgerNamePrice = new String[getHowManyBurgers()];
	
	String pro = "";
	
	@Override
	public void Promotion(Double discount, String promote) { //promotion method
		discountRate = discount;
		pro = promote;
		
	}
	
	
	public void Menu(String franchise) {
		DecimalFormat df = new DecimalFormat("#,###,###.00"); //currency format
		
		for(int i = 0; i < getHowManyBurgers(); i++) {
			burgerNamePrice[i] = getBurgerName(i) + " / " + "$" + df.format(getBurgerPrice(i)*(1.0-discountRate));
			if(discountRate > 0.0) {
				burgerNamePrice[i] += " (regular:" + df.format(getBurgerPrice(i)) + ")"; //call burger name
			}
		}
		
		new MenuGUI(franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));
		
		
	}

}
