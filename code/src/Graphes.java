public class Graphes {
	
	//JSON de test
	String maTasse = "{couleur: Rouge}";
	JSONObject tasse = new JSONObject(maTasse);
	System.out.println(tasse.getString(couleur)); //Rouge
}
