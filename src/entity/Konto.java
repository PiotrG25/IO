package entity;

public class Konto {
	private Klient klient;
	private double stanKonta;
	private Pozyczka[] pozyczki;
	private Lokata[] lokaty;
	
	public Konto(Klient klient) {
		this.klient = klient;
	}
	
	public Konto(Klient klient, double stanKonta, Pozyczka[] pozyczki, Lokata[] lokaty) {
		this.klient = klient;
		this.stanKonta = stanKonta;
		this.pozyczki = pozyczki;
		this.lokaty = lokaty;
	}
	
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	
	public double getStanKonta() {
		return stanKonta;
	}
	public void setStanKonta(double stanKonta) {
		this.stanKonta = stanKonta;
	}
	
	public Pozyczka[] getPozyczki() {
		return pozyczki;
	}
	public void setPozyczki(Pozyczka[] pozyczki) {
		this.pozyczki = pozyczki;
	}
	
	public Lokata[] getLokaty() {
		return lokaty;
	}
	public void setLokaty(Lokata[] lokaty) {
		this.lokaty = lokaty;
	}
}
