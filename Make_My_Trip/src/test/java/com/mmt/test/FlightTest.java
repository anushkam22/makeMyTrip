package com.mmt.test;
import org.testng.annotations.Test;

import com.mmt.generic.BaseUtility.BaseTest;
import com.mmt.generic.ObjectRepository.FlightPage;
import com.mmt.generic.ObjectRepository.HomePage;

public class FlightTest extends BaseTest {

	@Test
	public void flight() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getFlight().click();
		
		FlightPage fp= new FlightPage(driver);
		fp.bookflight();
	}
}
