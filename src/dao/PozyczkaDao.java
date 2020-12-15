package dao;

import entity.Pozyczka;

import java.util.List;

public class PozyczkaDao implements Dao<Pozyczka> {
	private String fileName;
	
	public PozyczkaDao(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void add(Pozyczka pozyczka) {
	
	}
	
	@Override
	public Pozyczka[] getAll() {
		return new Pozyczka[0];
	}
	
	@Override
	public void update(Pozyczka pozyczka) {
	
	}
	
	@Override
	public void delete(Pozyczka pozyczka) {
	
	}
}
