package test.dao;

import org.junit.Before;
import org.junit.Test;
import test.Dane;

import static org.junit.Assert.*;

public class PozyczkaDaoTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void addZwiekszaTabliceKlientowO1(){
		int length1 = dane.pozyczkaDao.getAll().length;
		dane.pozyczkaDao.add(dane.pozyczki[0]);
		int length2 = dane.pozyczkaDao.getAll().length;
		
		assertTrue(length2 == length1 + 1);
	}
	
	@Test
	public void deleteZmniejszaDlugoscTablicyO1(){
		dane.pozyczkaDao.add(dane.pozyczki[2]);
		int length1 = dane.pozyczkaDao.getAll().length;
		dane.pozyczkaDao.delete(dane.pozyczki[2]);
		int length2 = dane.pozyczkaDao.getAll().length;
		
		assertTrue(length2 == length1 - 1);
	}
}
