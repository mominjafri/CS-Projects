/* Momin Jafri
 * 950716432
 * CS211 -- Taesik Kim
 * Burger211 -- Exchange Rate
 * This program generates a Menu GUI which displays three burgers along with their toppings and prices. 
 * This is the Exchange Rate class where we return the exchange rate to USD in the "main" method.
 * This class is implemented into an object in the Emirates subclass.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.net.URL;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ExchangeRate{
	
	public static double dirs;
	
	private static String exchangeRateURL = "https://v6.exchangerate-api.com/v6/206f2fb762faf6860beafb31/latest/USD";
	 
	 public static double dirhams() throws Exception {
		   StringBuilder builder = new StringBuilder();
			 
		   try {
		     URL url = new URL(exchangeRateURL);  
		     BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

		     String str = "";
		     while (null != (str = br.readLine())) {
		      builder.append(str + "\n");
		     }
		   } catch (Exception ex) {
		     ex.printStackTrace();
		 }
		   
		   JSONParser jsonParser = new JSONParser(); 
		   Object obj = jsonParser.parse(builder.toString());
		   JSONObject jsonObject = (JSONObject)obj;
		   
		   JSONObject conversionRate = (JSONObject)jsonObject.get("conversion_rates");
		   dirs = (double)conversionRate.get("AED");
		   
		 return dirs;
		 
	 }
	

	

}
