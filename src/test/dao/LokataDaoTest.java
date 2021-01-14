package test.dao;

import org.junit.Before;
import org.junit.Test;
import test.Dane;

import static org.junit.Assert.*;

public class LokataDaoTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void addZwiekszaTabliceKlientowO1(){
		int length1 = dane.lokataDao.getAll().length;
		dane.lokataDao.add(dane.lokaty[0]);
		int length2 = dane.lokataDao.getAll().length;
		
		assertTrue(length2 == length1 + 1);
	}
	
	@Test
	public void deleteZmniejszaDlugoscTablicyO1(){
		dane.lokataDao.add(dane.lokaty[2]);
		int length1 = dane.lokataDao.getAll().length;
		dane.lokataDao.delete(dane.lokaty[2]);
		int length2 = dane.lokataDao.getAll().length;
		
		assertTrue(length2 == length1 - 1);
	}
}
