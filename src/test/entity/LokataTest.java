package test.entity;

import entity.Lokata;
import org.junit.Before;
import org.junit.Test;
import test.Dane;

import static org.junit.Assert.*;

public class LokataTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void poczatekWczesniejszyNizKoniec(){
		for(Lokata l : dane.lokaty){
			assertTrue(l.getPoczatek().isBefore(l.getKoniec()));
		}
	}
}
