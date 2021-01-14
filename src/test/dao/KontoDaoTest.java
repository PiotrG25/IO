package test.dao;

import org.junit.Before;
import org.junit.Test;
import test.Dane;

import static org.junit.Assert.*;

public class KontoDaoTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void addZwiekszaTabliceKlientowO1(){
		int length1 = dane.kontoDao.getAll().length;
		dane.kontoDao.add(dane.konta[0]);
		int length2 = dane.kontoDao.getAll().length;
		
		assertTrue(length2 == length1 + 1);
	}
	
	@Test
	public void updateNieZmieniaDlugosciTablicy(){
		dane.kontoDao.add(dane.konta[1]);
		int length1 = dane.kontoDao.getAll().length;
		dane.kontoDao.update(dane.konta[1]);
		int length2 = dane.kontoDao.getAll().length;
		
		assertTrue(length2 == length1);
	}
	
	@Test
	public void deleteZmniejszaDlugoscTablicyO1(){
		dane.kontoDao.add(dane.konta[2]);
		int length1 = dane.kontoDao.getAll().length;
		dane.kontoDao.delete(dane.konta[2]);
		int length2 = dane.kontoDao.getAll().length;
		
		assertTrue(length2 == length1 - 1);
	}
}
