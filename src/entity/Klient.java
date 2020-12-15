package entity;

public class Klient {
	private String pesel, haslo;
	
	public Klient(String pesel, String haslo) {
		this.pesel = pesel;
		this.haslo = haslo;
	}
	
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	public String getHaslo() {
		return haslo;
	}
}
