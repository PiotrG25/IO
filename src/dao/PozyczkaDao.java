package dao;

import entity.Pozyczka;

public class PozyczkaDao implements Dao<Pozyczka> {
	private Pozyczka [] pozyczki;
	
	public PozyczkaDao() {
		pozyczki = new Pozyczka [0];
	}
	
	@Override
	public void add(Pozyczka pozyczka) {
		Pozyczka [] pozyczki2 = new Pozyczka [pozyczki.length + 1];
		for(int i = 0; i < pozyczki.length; ++i) pozyczki2[i] = pozyczki[i];
		pozyczki2[pozyczki.length] = pozyczka;
		pozyczki = pozyczki2;
	}
	
	@Override
	public Pozyczka[] getAll() {
		return pozyczki;
	}
	
	@Override
	public void update(Pozyczka pozyczka) {
		return;
	}
	
	@Override
	public void delete(Pozyczka pozyczka) {
		if(pozyczki.length <= 0) return;
		Pozyczka [] pozyczki2 = new Pozyczka [pozyczki.length - 1];
		int i = 0;
		for(; i < pozyczki.length; ++i){
			if(pozyczki[i].equals(pozyczka)) break;
			else pozyczki2[i] = pozyczki[i];
		}
		for(++i; i < pozyczki.length; ++i){
			pozyczki2[i - 1] = pozyczki[i];
		}
		pozyczki = pozyczki2;
	}
}
