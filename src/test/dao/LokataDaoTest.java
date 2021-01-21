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
public class LokataDaoTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void testAdd(){
		int length1 = dane.lokataDao.getAll().length;
		dane.lokataDao.add(dane.lokaty[0]);
		int length2 = dane.lokataDao.getAll().length;

		assertEquals(length2, length1 + 1);
		assertEquals(dane.lokaty[0], dane.lokataDao.getAll()[0]);
	}
	
	@Test
	public void testDelete(){
		dane.lokataDao.add(dane.lokaty[2]);
		int length1 = dane.lokataDao.getAll().length;
		dane.lokataDao.delete(dane.lokaty[2]);
		int length2 = dane.lokataDao.getAll().length;
		
		assertTrue(length2 == length1 - 1);
	}
}
