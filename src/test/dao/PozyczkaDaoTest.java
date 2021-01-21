package test.dao;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import test.Dane;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category({DaoTests.class})
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

		assertEquals(length2, length1 + 1);
		assertEquals(dane.pozyczki[0], dane.pozyczkaDao.getAll()[0]);
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
