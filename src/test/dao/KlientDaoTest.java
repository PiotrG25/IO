package test.dao;

import entity.Konto;
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
	public void dodajKlientaZwieksza(){
		for(Konto k : dane.konta){
			assertTrue(k.getStanKonta() >= 0);
		}
	}
}
