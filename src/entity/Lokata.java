package entity;

import java.time.LocalDateTime;

public class Lokata {
	private double kwota, oprocetowanie;
	private LocalDateTime poczatek, koniec;
	
	public Lokata(double kwota, double oprocetowanie, LocalDateTime poczatek, LocalDateTime koniec) {
		this.kwota = kwota;
		this.oprocetowanie = oprocetowanie;
		this.poczatek = poczatek;
		this.koniec = koniec;
	}
	
	public double getKwota() {
		return kwota;
	}
	public void setKwota(double kwota) {
		this.kwota = kwota;
	}
	
	public double getOprocetowanie() {
		return oprocetowanie;
	}
	public void setOprocetowanie(double oprocetowanie) {
		this.oprocetowanie = oprocetowanie;
	}
	
	public LocalDateTime getPoczatek() {
		return poczatek;
	}
	public void setPoczatek(LocalDateTime poczatek) {
		this.poczatek = poczatek;
	}
	
	public LocalDateTime getKoniec() {
		return koniec;
	}
	public void setKoniec(LocalDateTime koniec) {
		this.koniec = koniec;
	}
}
