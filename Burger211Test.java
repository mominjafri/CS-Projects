/* Momin Jafri
 * 950716432
 * CS211 -- Taesik Kim
 * Burger211Test
 * This program generates a Menu GUI which displays three burgers along with their toppings and prices. 
 * This is the test class where we create objects for Burger211 to run and compile the program
 */

public class Burger211Test {

	public static void main(String[] args) {
		
		Burger211 Redmond = new USA(); //create object 
		Redmond.Promotion(0.1, "10% Off - Redmond City Lights Special");
		Redmond.Menu("Redmond");
		
		Burger211 Dubai = new Emirates();
		Dubai.Promotion(0.4, "40% off - Eid Mubarak"); //set discount
		Dubai.Menu("Dubai");
		
		Burger211 Baltimore = new USA();
		Baltimore.Promotion(0.5, "50% OFF!! RAVENS WIN!!");
		Baltimore.Menu("Baltimore"); //set location
		
		Burger211 AbuDhabi = new Emirates();
		AbuDhabi.Promotion(0.2, "20% off - Happy New Year!");
		AbuDhabi.Menu("Abu Dhabi");
		
		
		
	}

}
