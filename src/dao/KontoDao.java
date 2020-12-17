package dao;

import entity.Konto;

public class KontoDao implements Dao<Konto> {
	private Konto [] konta;
	
	public KontoDao() {
		konta = new Konto [0];
	}
	
	@Override
	public void add(Konto konto) {
		Konto [] konta2 = new Konto [konta.length + 1];
		for(int i = 0; i < konta.length; ++i) konta2[i] = konta[i];
		konta2[konta.length] = konto;
		konta = konta2;
	}
	
	@Override
	public Konto[] getAll() {
		return konta;
	}
	
	@Override
	public void update(Konto konto) {
		for(int i = 0; i < konta.length; ++i){
			if(konta[i].getKlient().equals(konto.getKlient())){
				konta[i] = konto;
				break;
			}
		}
	}
	
	@Override
	public void delete(Konto konto) {
		if(konta.length <= 0) return;
		Konto [] konta2 = new Konto[konta.length - 1];
		int i = 0;
		for(; i < konta.length; ++i){
			if(konta[i].getKlient().equals(konto.getKlient())) break;
			else konta2[i] = konta[i];
		}
		for(++i; i < konta.length; ++i){
			konta2[i - 1] = konta[i];
		}
		konta = konta2;
	}
}
