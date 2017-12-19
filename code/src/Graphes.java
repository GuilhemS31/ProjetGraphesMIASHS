import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Graphes {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("../data/ToulouseLight.json"));
		
		ArrayList<Station> mesStations = new ArrayList<Station>();

		for (int i = 0; i < a.size(); i++) {
			JSONObject o = (JSONObject) a.get(i);
			mesStations.add(new Station((String) o.get("number"), (String) o.get("name"), (String) o.get("adress"),
					(double) o.get("latitude"), (double) o.get("longitude")));
		}
	}

}
