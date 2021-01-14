package test;

import dao.KlientDao;
import dao.KontoDao;
import dao.LokataDao;
import dao.PozyczkaDao;
import entity.Klient;
import entity.Konto;
import entity.Lokata;
import entity.Pozyczka;

import java.time.LocalDateTime;

public class Dane {
	public Klient[] klienci;
	public Konto[] konta;
	public Lokata[] lokaty;
	public Pozyczka[] pozyczki;
	
	public KlientDao klientDao;
	public KontoDao kontoDao;
	public LokataDao lokataDao;
	public PozyczkaDao pozyczkaDao;
	
	public Dane(){
		int length = 4;
		
		klienci = new Klient[length];
		konta = new Konto[length];
		lokaty = new Lokata[length];
		pozyczki = new Pozyczka[length];
		
		klientDao = new KlientDao();
		kontoDao = new KontoDao();
		lokataDao = new LokataDao();
		pozyczkaDao = new PozyczkaDao();
		
		for(int i = 0; i < length; ++i){
			klienci[i] = new Klient("1234523213435", "haslo" + i);
			konta[i] = new Konto(klienci[i], 12323.22, new Pozyczka[0], new Lokata[0]);
			lokaty[i] = new Lokata( 123, 0.035, LocalDateTime.now(), LocalDateTime.now().plusMonths(1));
			pozyczki[i] = new Pozyczka(123, 0.035, 12, LocalDateTime.now(), LocalDateTime.now().plusMonths(1));
		}
	}
}
