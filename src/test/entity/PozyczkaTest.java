package test.entity;
import entity.Pozyczka;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import test.BankTests;
import test.Dane;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category({EntitiesTests.class, BankTests.class})
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
	
}
