package com.mmt.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mmt.generic.WebDriverUtility.WebDriverUtils;

public class TrainsPage extends BaseClass {

	public TrainsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "webklipper-publisher-widget-container-notification-close-div")
	private WebElement cross;

	@FindBy(id = "fromCity")
	private WebElement from;

	@FindBy(id = "react-autowhatever-1-section-0-item-1")
	private WebElement fromloc;

	@FindBy(id = "toCity")
	private WebElement to;

	@FindBy(id = "react-autowhatever-1-section-0-item-0")
	private WebElement toloc;

	@FindBy(id = "travelDate")
	private WebElement depart;

	@FindBy(xpath = "//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='6']")
	private WebElement date;

	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;

	@FindBy(xpath = "//span[text()='Pay & Book Now']")
	private WebElement paynow;

	
	public WebElement getPaynow() {
		return paynow;
	}

	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromtext;

	@FindBy(xpath = "//input[@type='text']/ancestor::div[@data-cy='RailSearchWidget_339']")
	private WebElement totext;

	@FindBy(id="train_options_06-06-2024_1")
	private WebElement train;
	@FindBy(xpath="//div[text()='OK, GO AHEAD']")
	private WebElement text;
	

	public WebElement getTrain() {
		return train;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getCross() {
		return cross;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getFromloc() {
		return fromloc;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getToloc() {
		return toloc;
	}

	public WebElement getDepart() {
		return depart;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFromtext() {
		return fromtext;
	}

	public WebElement getTotext() {
		return totext;
	}

	public void booktrain(WebDriverUtils wlib, WebDriver driver) throws Throwable {
		getFrom().click();
		getFromtext().click();;
		getFromloc().click();
//		getTo().click();
//		wlib.waitForVisibilityOfElement(driver, totext);
		getTotext().click();
		getToloc().click();

		//getToloc().click();
		getDepart().click();
		getDate().click();
		getSearch().click();
		getTrain().click();
		getText().click();

	}

}
