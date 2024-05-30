package com.mmt.test;
import org.testng.annotations.Test;

import com.mmt.generic.BaseUtility.BaseTest;
import com.mmt.generic.ObjectRepository.FlightPage;
import com.mmt.generic.ObjectRepository.HomePage;
import com.mmt.generic.ObjectRepository.HomestayPage;
import com.mmt.generic.ObjectRepository.HotelsPage;
import com.mmt.generic.ObjectRepository.TrainsPage;

public class HomestayTest extends BaseTest {

	@Test
	public void homestay() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getHomestays().click();
		
		HomestayPage hh= new HomestayPage(driver);
		hh.bookhomestay(wlib, driver);
	}
}