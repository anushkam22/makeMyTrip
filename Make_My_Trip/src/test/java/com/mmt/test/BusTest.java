package com.mmt.test;

import org.testng.annotations.Test;

import com.mmt.generic.BaseUtility.BaseTest;
import com.mmt.generic.ObjectRepository.BusesPage;
import com.mmt.generic.ObjectRepository.HomePage;

public class BusTest extends BaseTest{


	@Test
	public void book() {
		
		HomePage hp= new HomePage(driver);
		hp.getBus().click();
		BusesPage cb = new BusesPage(driver);
		cb.bookbus(driver);
	}

}
