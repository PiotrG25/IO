package test.entity;

import entity.Pozyczka;
import org.junit.Before;
import org.junit.Test;
import test.Dane;

import static org.junit.Assert.*;

public class PozyczkaTest {
	
	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void poczatekWczesniejszyNizKoniec(){
		for(Pozyczka p : dane.pozyczki){
			assertTrue(p.getPoczatek().isBefore(p.getKoniec()));
		}
	}
	
	@Test
	public void
}
