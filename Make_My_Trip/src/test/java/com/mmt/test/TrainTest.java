package com.mmt.test;
import org.testng.annotations.Test;

import com.mmt.generic.BaseUtility.BaseTest;
import com.mmt.generic.ObjectRepository.FlightPage;
import com.mmt.generic.ObjectRepository.HomePage;
import com.mmt.generic.ObjectRepository.TrainsPage;

public class TrainTest extends BaseTest {

	@Test
	public void train() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getTrains().click();
		
		TrainsPage hh= new TrainsPage(driver);
		hh.booktrain(wlib, driver);
	}
}

