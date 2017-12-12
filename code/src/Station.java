
public class Station {

	//statique 
	private String numero;
	private String nom;
	private double latitude;
	private double longitude;
	private boolean banking;
	private boolean bonus;
	
	//dynamique
	private String status;
	private int attacheVelo;
	private int attacheVeloDispo;
	private int veloDispo;
	
	

	//statique 
	public String getNumero() {
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
	public boolean isBanking() {
		return banking;
	}
	public boolean isBonus() {
		return bonus;
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
	
}
