package dao;

import entity.Klient;

public class KlientDao implements Dao<Klient> {
	private Klient [] klienci;
	
	public KlientDao(){
		klienci = new Klient [0];
	}
	
	@Override
	public void add(Klient klient) {
		Klient [] klienci2 = new Klient[klienci.length + 1];
		for(int i = 0; i < klienci.length; ++i) klienci2[i] = klienci[i];
		klienci2[klienci.length] = klient;
		klienci = klienci2;
	}
	
	@Override
	public Klient[] getAll() {
		return klienci;
	}
	
	@Override
	public void update(Klient klient) {
		for(int i = 0; i < klienci.length; ++i){
			if(klienci[i].getPesel().equals(klient.getPesel())){
				klienci[i] = klient;
				break;
			}
		}
	}
	
	@Override
	public void delete(Klient klient) {
		if(klienci.length <= 0) return;
		Klient [] klienci2 = new Klient[klienci.length - 1];
		int i = 0;
		for(; i < klienci.length; ++i){
			if(klienci[i].getPesel().equals(klient.getPesel())) break;
			else klienci2[i] = klienci[i];
		}
		for(++i; i < klienci.length; ++i){
			klienci2[i - 1] = klienci[i];
		}
		klienci = klienci2;
	}
}
