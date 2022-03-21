/* Momin Jafri
 * 950716432
 * CS211 -- Taesik Kim
 * Burger211 -- Weather
 * This program generates a Menu GUI which displays three burgers along with their toppings and prices. 
 * This is the Weather class where we generate temperature data based on the city and return the exact temp.
 * Depending on the temperature, there could be a promotion (implemented in Burger211 main class)
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


class Weather {
	
	private static String RedmondURL = "https://api.openweathermap.org/data/2.5/weather?q=Redmond&appid=39811dd56bf90f321cbde30072f57d19";
	private static String BaltimoreURL = "https://api.openweathermap.org/data/2.5/weather?q=Baltimore&appid=39811dd56bf90f321cbde30072f57d19";
	private static String DubaiURL = "https://api.openweathermap.org/data/2.5/weather?q=Dubai&appid=39811dd56bf90f321cbde30072f57d19";
	private static String AbuDhabiURL = "https://api.openweathermap.org/data/2.5/weather?q=ABD&appid=39811dd56bf90f321cbde30072f57d19";
	
	
	public static String getURL(String city) { //experimental method -- couldnt get it to work
		return "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=39811dd56bf90f321cbde30072f57d19";
	}
	
	
	public static double getRedmond()throws Exception {  //one of four methods for each city
		  StringBuilder builder = new StringBuilder();
			 
		   try {
		     URL url = new URL(RedmondURL);  
		     BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); //reads URL

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
		   
		   JSONObject temp = (JSONObject)jsonObject.get("main");
		   double temperature = (double)temp.get("temp"); //how it reads the temperature in URL
		   
		 return temperature;
	}
	
	public static double getBaltimore()throws Exception {
		  StringBuilder builder = new StringBuilder();
			 
		   try {
		     URL url = new URL(BaltimoreURL);  
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
		   
		   JSONObject temp = (JSONObject)jsonObject.get("main");
		   double temperature = (double)temp.get("temp");
		   
		 return temperature;
	}
	
	public static double getDubai()throws Exception {
		  StringBuilder builder = new StringBuilder();
			 
		   try {
		     URL url = new URL(DubaiURL);  
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
		   
		   JSONObject temp = (JSONObject)jsonObject.get("main");
		   double temperature = (double)temp.get("temp");
		   
		 return temperature;
	}
	
	public static double getABD()throws Exception {
		  StringBuilder builder = new StringBuilder();
			 
		   try {
		     URL url = new URL(AbuDhabiURL);  
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
		   
		   JSONObject temp = (JSONObject)jsonObject.get("main");
		   double temperature = (double)temp.get("temp");
		   
		 return temperature;
	}
	
	

		
}

