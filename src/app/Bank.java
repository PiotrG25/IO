package app;

import dao.KlientDao;
import dao.KontoDao;
import dao.LokataDao;
import dao.PozyczkaDao;
import entity.Klient;
import entity.Konto;
import entity.Lokata;
import entity.Pozyczka;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Bank {
	private static Klient klient;
	
	private static KlientDao klientDao;
	private static KontoDao kontoDao;
	private static LokataDao lokataDao;
	private static PozyczkaDao pozyczkaDao;
	
	public static void main(String[] args) {
		klient = null;
		
		klientDao = new KlientDao("klient.txt");
		kontoDao = new KontoDao("konto.txt");
		lokataDao = new LokataDao("lokata.txt");
		pozyczkaDao = new PozyczkaDao("pozyczka.txt");
		
		
		// todo
		Scanner sc = new Scanner(System.in);
		String menu = "";
		
	}
	
	private static void wezPozyczke(double kwota, double oprocentowanie, double rata){
		if(klient != null){
			Konto konto = null;
			for (Konto k : kontoDao.getAll()) {
				if (k.getKlient().equals(klient)) {
					konto = k;
					break;
				}
			}
			
			if(konto != null){
				LocalDateTime poczatek = LocalDateTime.now();
				LocalDateTime koniec = LocalDateTime.now().plusMonths(12);
				
				Pozyczka pozyczka = new Pozyczka(kwota, oprocentowanie, rata, poczatek, koniec);
				pozyczkaDao.add(pozyczka);
				
				Pozyczka [] nowePozyczki = new Pozyczka[konto.getPozyczki().length + 1];
				for(int i = 0; i < konto.getPozyczki().length; ++i) nowePozyczki[i] = konto.getPozyczki()[i];
				nowePozyczki[konto.getPozyczki().length] = pozyczka;
				
				konto.setPozyczki(nowePozyczki);
				konto.setStanKonta(konto.getStanKonta() + kwota);
				kontoDao.update(konto);
				
				System.out.println("Pozyczka zostala przyznana");
			}else System.out.println("Nie znaleziono konta");
		}else System.out.println("Klient musi byc zalogowany");
	}
	
	private static void zalozLokate(double kwota, double oprocentowanie){
		if(klient != null) {
			Konto konto = null;
			for (Konto k : kontoDao.getAll()) {
				if (k.getKlient().equals(klient)) {
					konto = k;
					break;
				}
			}
			
			if(konto != null){
				if(kwota <= konto.getStanKonta()){
					LocalDateTime poczatek = LocalDateTime.now();
					LocalDateTime koniec = LocalDateTime.now().plusMonths(1);
					
					Lokata lokata = new Lokata(kwota, oprocentowanie, poczatek, koniec);
					lokataDao.add(lokata);
					
					Lokata [] noweLokaty = new Lokata [konto.getLokaty().length + 1];
					for(int i = 0; i < konto.getLokaty().length; ++i) noweLokaty[i] = konto.getLokaty()[i];
					noweLokaty[konto.getLokaty().length] = lokata;
					
					konto.setStanKonta(konto.getStanKonta() - kwota);
					konto.setLokaty(noweLokaty);
					kontoDao.update(konto);
					
					System.out.println("Lokata zostala dodana");
				}else System.out.println("Nie wystarczajacy stan konta");
			}else System.out.println("Nie znaleziono konta");
		}else System.out.println("Klient musi byc zalogowany");
	}
	
	private static void sprawdzStanKonta(){
		if(klient != null){
			Konto [] konta = kontoDao.getAll();
			for(int i = 0; i < konta.length; ++i){
				if(konta[i].getKlient().equals(klient)){
					System.out.println(konta[i].getStanKonta());
					break;
				}
			}
		}else{
			System.out.println("Klient musi byc zalogowany");
		}
	}
	
	private static void zalozKonto(String pesel, String haslo){
		Klient [] klienci = klientDao.getAll();
		for(int i = 0; i < klienci.length; ++i){
			if(klienci[i].getPesel().equals(pesel)){
				System.out.println("Istnieje juz klient o takim numerze pesel");
				break;
			}
		}
		klient = new Klient(pesel, haslo);
		klientDao.add(klient);
		
		Konto konto = new Konto(klient);
		kontoDao.add(konto);
		
		System.out.println("Zalozono nowe konto");
	}
	
	private static void zaloguj(String pesel, String haslo){
		Klient [] klienci = klientDao.getAll();
		for(int i = 0; i < klienci.length; ++i){
			if(klienci[i].getPesel().equals(pesel) && klienci[i].getHaslo().equals(haslo)){
				klient = klienci[i];
				System.out.println("Klient został zalogowany");
				break;
			}
		}
		
		System.out.println("Klient nie zostal zalogowany");
	}
}
