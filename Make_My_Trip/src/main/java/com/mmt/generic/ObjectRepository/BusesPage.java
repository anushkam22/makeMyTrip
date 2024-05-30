package com.mmt.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusesPage extends BaseClass {

	public BusesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="fromCity")
	private WebElement from;

	
	@FindBy(xpath = "//input[@title='From']")
	private WebElement fromText;

	
	@FindBy(id="react-autowhatever-1-section-0-item-0")
	private WebElement fromloc;

	
	@FindBy(id="toCity")
	private WebElement to;

	
	@FindBy(xpath="//input[@title='To']")
	private WebElement toText;

	
	@FindBy(id="react-autowhatever-1-section-0-item-3")
	private WebElement tocity;

	@FindBy(id = "travelDate")
	private WebElement dep;

	@FindBy(xpath="//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='3']")
	private WebElement date;

	@FindBy(xpath="//button[text()='Search']")
	private WebElement search;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getFromText() {
		return fromText;
	}

	public WebElement getFromloc() {
		return fromloc;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getTotext() {
		return toText;
	}

	public WebElement getToloc() {
		return tocity;
	}

	public WebElement getDep() {
		return dep;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//span[text()='Dzire, Etios']/ancestor::div[@class='makeFlex']")
	private WebElement car;

	@FindBy(xpath = "//p[text()='Prime ']/ancestor::div[@class='width460 packageCard makeRelative']/descendant::span[text()='BOOK']")
	private WebElement book;
	
	

	public WebElement getToText() {
		return toText;
	}

	public WebElement getTocity() {
		return tocity;
	}

	public WebElement getCar() {
		return car;
	}

	public WebElement getBook() {
		return book;
	}

	public void bookbus(WebDriver driver) {
		getFrom().click();
		getFromText().click();
		getFromloc().click();
		//getTo().click();

		getTotext().click();
		getToloc().click();
		//getDep().click();
		getDate().click();
		getSearch().click();
//		getCar().click();
//		getBook().click();
	}
}
