import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Station {

	//statique 
	private long numero;
	private String nom;
	private String adresse;
	private double latitude;
	private double longitude;
	
	//dynamique
	private String status;
	private int attacheVelo;
	private int attacheVeloDispo;
	private int veloDispo;
	
	//Station proches
	HashMap<Station,Double> proches;
	
	public Station(long num, String nom, String adr, double lat, double longi){
		this.numero = num;
		this.nom = nom;
		this.adresse = adr;
		this.latitude = lat;
		this.longitude = longi;
		this.proches = new HashMap<Station,Double>();
	}

	//statique 
	public long getNumero() {
		return numero;
	}
	public String getNom() {
		return nom;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	

	//dynamique
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAttacheVelo() {
		return attacheVelo;
	}
	public void setAttacheVelo(int attacheVelo) {
		this.attacheVelo = attacheVelo;
	}
	public int getAttacheVeloDispo() {
		return attacheVeloDispo;
	}
	public void setAttacheVeloDispo(int attacheVeloDispo) {
		this.attacheVeloDispo = attacheVeloDispo;
	}
	public int getVeloDispo() {
		return veloDispo;
	}
	public void setVeloDispo(int veloDispo) {
		this.veloDispo = veloDispo;
	}
	
	//Stations
	public Map<Station,Double> getProches(){
		return this.proches;
	}
	
	public void setProcheSuiv(Station s,Double d){
		this.proches.put(s,d);
	}
}
