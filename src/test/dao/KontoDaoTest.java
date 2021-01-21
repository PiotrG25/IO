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
public class KontoDaoTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void testAdd(){
		int length1 = dane.kontoDao.getAll().length;
		dane.kontoDao.add(dane.konta[0]);
		int length2 = dane.kontoDao.getAll().length;
		System.out.print(length2);

		assertEquals(length2, length1 + 1);
		assertEquals(dane.konta[0], dane.kontoDao.getAll()[0]);
	}
	
	@Test
	public void testUpdate(){
		dane.kontoDao.add(dane.konta[1]);
		int length1 = dane.kontoDao.getAll().length;
		dane.kontoDao.update(dane.konta[1]);
		int length2 = dane.kontoDao.getAll().length;

		assertEquals(dane.konta[1], dane.kontoDao.getAll()[0]);
		assertEquals(length2, length1);
	}
	
	@Test
	public void testDelete(){
		dane.kontoDao.add(dane.konta[2]);
		int length1 = dane.kontoDao.getAll().length;
		dane.kontoDao.delete(dane.konta[2]);
		int length2 = dane.kontoDao.getAll().length;
		
		assertTrue(length2 == length1 - 1);
	}
}
