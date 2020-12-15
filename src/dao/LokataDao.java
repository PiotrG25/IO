package dao;

import entity.Lokata;

import java.util.List;

public class LokataDao implements Dao<Lokata> {
	private String fileName;
	
	public LokataDao(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void add(Lokata lokata) {
	
	}
	
	@Override
	public Lokata[] getAll() {
		return null;
	}
	
	@Override
	public void update(Lokata lokata) {
	
	}
	
	@Override
	public void delete(Lokata lokata) {
	
	}
}
