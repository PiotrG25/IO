package dao;

import entity.Lokata;

public class LokataDao implements Dao<Lokata> {
	private Lokata [] lokaty;
	
	public LokataDao() {
		lokaty = new Lokata [0];
	}
	
	@Override
	public void add(Lokata lokata) {
		Lokata [] lokaty2 = new Lokata [lokaty.length + 1];
		for(int i = 0; i < lokaty.length; ++i) lokaty2[i] = lokaty[i];
		lokaty2[lokaty.length] = lokata;
		lokaty = lokaty2;
	}
	
	@Override
	public Lokata[] getAll() {
		return lokaty;
	}
	
	@Override
	public void update(Lokata lokata) {
		return;
	}
	
	@Override
	public void delete(Lokata lokata) {
		if(lokaty.length <= 0) return;
		Lokata [] lokaty2 = new Lokata [lokaty.length - 1];
		int i = 0;
		for(; i < lokaty.length; ++i){
			if(lokaty[i].equals(lokata)) break;
			else lokaty2[i] = lokaty[i];
		}
		for(++i; i < lokaty.length; ++i){
			lokaty2[i - 1] = lokaty[i];
		}
		lokaty = lokaty2;
	}
}
