package com.mmt.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPage extends BaseClass{

	public FlightPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id="fromCity")
	private WebElement from;
	
	@FindBy(id = "react-autowhatever-1-section-0-item-0")
	private WebElement fromloc;
	
	@FindBy(id="toCity")
	private WebElement to;
	
	@FindBy(id="react-autowhatever-1-section-0-item-1")
	private WebElement toloc;
	
	@FindBy(xpath="//span[text()='Departure']")
	private WebElement depart;
	
	@FindBy(xpath="//div[text()='September 2024']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='3']")
	private WebElement date;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;
	
	
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement fromtext;
	
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement totext;
	
	@FindBy(xpath="//button[text()='Refresh']")
	private WebElement refresh;
	
	@FindBy(xpath="//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]")
	private WebElement e;
	
	public WebElement getRefresh() {
		return refresh;
	}


	public WebElement getE() {
		return e;
	}


	public WebElement getFromtext() {
		return fromtext;
	}


	public WebElement getTotext() {
		return totext;
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


	public void bookflight() throws Throwable {
		getFrom().click();
		getFromtext().click();;
		getFromloc().click();
		getTo().click();
		getTotext().click();
		getToloc().click();
		getDepart().click();
		for(int i=0;i<=2;i++)
		{
			e.click();
			Thread.sleep(2000);
		}
		getDate().click();
		getSearch().click();
		getRefresh().click();
		
	}
	

}
