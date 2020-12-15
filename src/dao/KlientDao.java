package dao;

import entity.Klient;

import java.util.List;

public class KlientDao implements Dao<Klient> {
	String fileName;
	
	public KlientDao(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void add(Klient klient) {
	
	}
	
	@Override
	public Klient[] getAll() {
		return null;
	}
	
	@Override
	public void update(Klient klient) {
	
	}
	
	@Override
	public void delete(Klient klient) {
	
	}
}
