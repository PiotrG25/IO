package entity;

import java.time.LocalDateTime;

public class Pozyczka {
	double kwota, oprocentowanie, rata;
	LocalDateTime poczatek, koniec;
	
	public Pozyczka(double kwota, double oprocentowanie, double rata, LocalDateTime poczatek, LocalDateTime koniec) {
		this.kwota = kwota;
		this.oprocentowanie = oprocentowanie;
		this.rata = rata;
		this.poczatek = poczatek;
		this.koniec = koniec;
	}
	
	public double getKwota() {
		return kwota;
	}
	public void setKwota(double kwota) {
		this.kwota = kwota;
	}
	
	public double getOprocentowanie() {
		return oprocentowanie;
	}
	public void setOprocentowanie(double oprocentowanie) {
		this.oprocentowanie = oprocentowanie;
	}
	
	public double getRata() {
		return rata;
	}
	public void setRata(double rata) {
		this.rata = rata;
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
