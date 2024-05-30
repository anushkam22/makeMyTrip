package com.mmt.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mmt.generic.WebDriverUtility.WebDriverUtils;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Flights']/ancestor::span[@data-cy='item-wrapper']")
	private WebElement flight;

	@FindBy(xpath = "//span[text()='Hotels']/ancestor::span[@data-cy='item-wrapper']")
	private WebElement hotel;

	@FindBy(xpath = "//span[text()='Homestays & Villas']/ancestor::span[@data-cy='item-wrapper']")
	private WebElement homestays;

	@FindBy(xpath = "//span[text()='Trains']/ancestor::span[@data-cy='item-wrapper']")
	private WebElement trains;

	@FindBy(xpath = "//span[text()='Buses']/ancestor::span[@data-cy='item-wrapper']")
	private WebElement bus;

	@FindBy(xpath = "//span[text()='Cabs']/ancestor::span[@data-cy='item-wrapper']")
	private WebElement cabs;

	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement close;

	@FindBy(id = "webklipper-publisher-widget-container-notification-close-div")
	private WebElement cross;

	public WebElement getCross() {
		return cross;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getFlight() {
		return flight;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getHomestays() {
		return homestays;
	}

	public WebElement getTrains() {
		return trains;
	}

	public WebElement getBus() {
		return bus;
	}

	public WebElement getCabs() {
		return cabs;
	}

	public void login(WebDriverUtils wlib, WebDriver driver) {
//		driver.switchTo().frame("notification-frame-~25143a650");
//		// 
//		wlib.switchToNewWindowWithUrl(driver, "https://www.makemytrip.com/forex/?intid=CRM_Forex_Cashbackoffer_17May");
		wlib.waitForVisibilityOfElement(driver, close);
		wlib.jsscrolltillele(driver, close);
		getClose().click();
		driver.switchTo().frame("notification-frame-1730531b3");
		wlib.waitForVisibilityOfElement(driver, cross);
	wlib.js(driver, cross);
		getCross().click();
		
		//getFlight().click();
	}

}
