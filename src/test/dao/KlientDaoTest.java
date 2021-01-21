package test.dao;

import entity.Klient;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import test.Dane;
import test.EndUserTests;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
@Category({DaoTests.class, EndUserTests.class})
public class KlientDaoTest {
	private String pesel;
	private String haslo;
	private Klient klient;
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}

	public KlientDaoTest(String pesel, String haslo){
		this.pesel = pesel;
		this.haslo = haslo;
	}
	@Parameterized.Parameters
	public static Collection pass() {
		return Arrays.asList(new Object[][] {
				{ "jeden", "haslo" },
				{ "pesel", "haslo2" },
				{ "haslo", "login" },
				{ "haslo", "login44" },

		});
	}

	@Test
	public void testAdd(){
		int length1 = dane.klientDao.getAll().length;
		Klient klient = new Klient(this.haslo, this.pesel);
		dane.klientDao.add(klient);
		int length2 = dane.klientDao.getAll().length;
		
		assertEquals(length2, length1 + 1);
		assertEquals(klient, dane.klientDao.getAll()[0]);
	}
	
	@Test
	public void testUpdate(){
		Klient klient = new Klient(this.haslo, this.pesel);

		dane.klientDao.add(klient);
		int length1 = dane.klientDao.getAll().length;
		dane.klientDao.update(klient);
		int length2 = dane.klientDao.getAll().length;

		assertEquals(klient, dane.klientDao.getAll()[0]);
		assertEquals(length2, length1);
	}
	
	@Test
	public void testDelete(){
		dane.klientDao.add(dane.klienci[2]);
		int length1 = dane.klientDao.getAll().length;
		dane.klientDao.delete(dane.klienci[2]);
		int length2 = dane.klientDao.getAll().length;

		assertEquals(length2, length1 - 1);
	}
}
