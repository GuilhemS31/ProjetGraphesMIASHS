import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Graphes {
	
	static ArrayList<Station> mesStations ;

	public Graphes(){
		mesStations = new ArrayList<Station>();
	}
	
	
	public static void recupStation() throws FileNotFoundException, IOException, ParseException{
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("../data/ToulouseLight.json"));
	
		for (int i = 0; i < a.size(); i++) {
			JSONObject o = (JSONObject) a.get(i);
			mesStations.add(new Station((String) o.get("number"), (String) o.get("name"), (String) o.get("adress"),
					(double) o.get("latitude"), (double) o.get("longitude")));
		}
		
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		recupStation();
		lierStations(mesStations);

	}

	public static double distFrom(double lat1, double lng1, double lat2, double lng2) {
	    double earthRadius = 6371000; //meters
	    double dLat = Math.toRadians(lat2-lat1);
	    double dLng = Math.toRadians(lng2-lng1);
	    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
	               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
	               Math.sin(dLng/2) * Math.sin(dLng/2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    float dist = (float) (earthRadius * c);

	    return dist;
	  }
	
	public static void lierStations(ArrayList<Station> mesStations2) {
		double plusCourt = 99999;
		double dist = 0;
		Station plusProche = null;
		for(Station currentStation : mesStations2){
			plusCourt = 99999;
			for(Station currentStation2 : mesStations2){
				if(currentStation2 != currentStation){
					dist = distFrom(currentStation.getLatitude(), currentStation.getLongitude(), currentStation2.getLatitude(), currentStation2.getLongitude());
					if(dist<2){
						currentStation.getProches().add(currentStation2);
					}
					if(dist<plusCourt){
						plusCourt=dist;
						plusProche=currentStation2;
					}
				}
			}
			if(currentStation.getProches().size()==0){
				currentStation.getProches().add(plusProche);
			}
		}
	}

}
