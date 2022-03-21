/* Momin Jafri
 * 950716432
 * CS211 -- Taesik Kim
 * Burger211 -- Emirates
 * This program generates a Menu GUI which displays three burgers along with their toppings and prices. 
 * This is the Emirates subclass where we have a method for exchanging currencies and an overriden method to change the toppings
 * Structured similarly to USA
 */

import java.text.DecimalFormat;

class Emirates extends Burger211{
	
	private double exchangeRate; //set up variables
	private double discountRate = 0;
	private String [] burgerNamePrice =  new String[getHowManyBurgers()];
	private String pro = "";
	
	@Override
	public double getBurgerPrice(int i) { //exchange rate method -- USD to AED
		ExchangeRate conversion = new ExchangeRate();
		try {
			exchangeRate = super.getBurgerPrice(i) * conversion.dirhams();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exchangeRate;
		
	}
	
	@Override
	public String getBurgerTopping(int i) { //override US toppings
		if(i == 1) {
			return "chicken, lettuce, onion, bbq";
		} else if(i == 2){
			return "beef, turkey bacon, onion, bbq";
		} else {
			return "beef, lettuce, tomato, onion, special sauce";
		}
	}
	
	@Override
	public void Promotion(Double discount, String promote) {
		discountRate = discount;
		pro = promote;
	}
	
	public void Menu(String franchise) { //make our own menu for UAE
		DecimalFormat df = new DecimalFormat("#,###,###");
		
		for(int i = 0; i < getHowManyBurgers(); i++) {
			burgerNamePrice[i] = getBurgerName(i) + " / " + "د.إ" + df.format(getBurgerPrice(i)*(1.0-discountRate));
			if(discountRate > 0.0) {
				burgerNamePrice[i] += " (regular:" + df.format(getBurgerPrice(i)) + ")";
			}
		}
		
		new MenuGUI(franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));
		
		
	}
	


	

}
