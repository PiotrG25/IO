package test.dao;

import org.junit.Before;
import org.junit.Test;
import test.Dane;

import static org.junit.Assert.*;

public class KlientDaoTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void addZwiekszaTabliceKlientowO1(){
		int length1 = dane.klientDao.getAll().length;
		dane.klientDao.add(dane.klienci[0]);
		int length2 = dane.klientDao.getAll().length;
		
		assertTrue(length2 == length1 + 1);
	}
	
	@Test
	public void updateNieZmieniaDlugosciTablicy(){
		dane.klientDao.add(dane.klienci[1]);
		int length1 = dane.klientDao.getAll().length;
		dane.klientDao.update(dane.klienci[1]);
		int length2 = dane.klientDao.getAll().length;
		
		assertTrue(length2 == length1);
	}
	
	@Test
	public void deleteZmniejszaDlugoscTablicyO1(){
		dane.klientDao.add(dane.klienci[2]);
		int length1 = dane.klientDao.getAll().length;
		dane.klientDao.delete(dane.klienci[2]);
		int length2 = dane.klientDao.getAll().length;
		
		assertTrue(length2 == length1 - 1);
	}
}
