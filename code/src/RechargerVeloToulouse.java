import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class RechargerVeloToulouse {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		Graphes monGraphe = new Graphes();
		monGraphe.recupStation();
		monGraphe.lierStations();
		System.out.println(monGraphe.afficherGraphe());
		//lel
	}
}
