package test.entity;

import entity.Konto;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import test.BankTests;
import test.Dane;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category({EntitiesTests.class, BankTests.class})
public class KontoTest {

	Dane dane;
	
	@Before
	public void setUp(){
		dane = new Dane();
	}
	
	@Test
	public void sprawdzNieUjemnyStanKonta(){
		for(Konto k : dane.konta){
			assertTrue(k.getStanKonta() >= 0);
		}
	}
}
