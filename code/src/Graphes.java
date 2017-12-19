import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Graphes {


	
	    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

	        JSONParser parser = new JSONParser();

	        JSONArray a = (JSONArray) parser.parse(new FileReader("../data/Toulouse.json"));
	        for (Object o : a)
	        {
	        	//System.out.println(o);
	        	System.out.println(JSONValue.toJSONString(o));
	          //JSONObject person = (JSONObject) o;

	          
	        }
	    }
	
}
