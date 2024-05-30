package com.mmt.test;
import org.testng.annotations.Test;

import com.mmt.generic.BaseUtility.BaseTest;
import com.mmt.generic.ObjectRepository.CabsPage;
import com.mmt.generic.ObjectRepository.HomePage;

public class CabsTest extends BaseTest {

	
	@Test
	public void book() {
		
		HomePage hp= new HomePage(driver);
		hp.getCabs().click();
		CabsPage cb = new CabsPage(driver);
		cb.bookCab(driver);
	}
}
