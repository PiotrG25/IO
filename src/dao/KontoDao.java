package dao;

import entity.Konto;

import java.util.List;

public class KontoDao implements Dao<Konto> {
	private String fileName;
	
	public KontoDao(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void add(Konto konto) {
	
	}
	
	@Override
	public Konto[] getAll() {
		return null;
	}
	
	@Override
	public void update(Konto konto) {
	
	}
	
	@Override
	public void delete(Konto konto) {
	
	}
}
