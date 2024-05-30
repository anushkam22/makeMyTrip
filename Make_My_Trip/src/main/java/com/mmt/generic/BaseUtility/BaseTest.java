package com.mmt.generic.BaseUtility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.mmt.generic.DBUtility.DataBaseUtils;
import com.mmt.generic.FileUtility.ExcelUtils;
import com.mmt.generic.FileUtility.PropertyFile;
import com.mmt.generic.ObjectRepository.HomePage;
import com.mmt.generic.WebDriverUtility.JavaUtils;
import com.mmt.generic.WebDriverUtility.WebDriverUtils;





public class BaseTest {


	public WebDriver driver = null;
	public PropertyFile flib = new PropertyFile();
	public ExcelUtils elib = new ExcelUtils();
	public JavaUtils jlib = new JavaUtils();
	public WebDriverUtils wlib = new WebDriverUtils();
	public DataBaseUtils dlib = new DataBaseUtils();
	public static WebDriver sdriver = null;

//	@BeforeSuite(groups = "ST")
//	public void configBS() throws Throwable {
//		dlib.getConnection(null, null, null);
//
//	}

	@BeforeClass(alwaysRun= true)
	public void launchBrowser() throws Throwable {

		String browser = flib.getDataFromPropertyFile("browser");
		String url = flib.getDataFromPropertyFile("url");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		sdriver = driver;
		wlib.maximizeWindow(driver);
		wlib.waitforPageToLoad(driver);
		driver.get(url);
	}

	@BeforeMethod(alwaysRun= true)
	public void loginIntoSS() throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.login(wlib, driver);
		}

//	@AfterMethod(alwaysRun= true)
//	public void logoutSS() {
//		HomePage hp = new HomePage(driver);
//		hp.myacc(wlib, driver);
//		hp.logout();
//
//	}
//
//	@AfterClass(alwaysRun= true)
//	public void closeBrowser() {
//		driver.quit();
//	}

	@AfterSuite(alwaysRun= true)
	public void ConfigAs() throws Throwable {
		//dlib.closeConnection();
		//report.flush();
	}
}
