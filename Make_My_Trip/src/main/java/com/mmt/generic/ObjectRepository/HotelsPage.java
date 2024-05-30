package com.mmt.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.mmt.generic.WebDriverUtility.WebDriverUtils;

public class HotelsPage extends BaseClass{

	public HotelsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="city")
	private WebElement city;

	@FindBy(xpath = "//li[text()='3']")
	private WebElement guest;
	
	@FindBy(xpath = "//div[text()='June']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='5']")
	private WebElement dateout;

	@FindBy(xpath = "//div[text()='June']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='3']")
	private WebElement datein;
	
	@FindBy(xpath = "//p[text()='Adults']/ancestor::div[@class='rmsGst__row']/descendant::div[@data-testid='gstSlct']")
	private WebElement adults;
	
	

	@FindBy(id="react-autowhatever-1-section-0-item-0")
	private WebElement lochotel;
	
	@FindBy(id="₹ 3000 - ₹ 6500")
	private WebElement price;

	@FindBy(xpath="//button[text()='Apply']")
	private WebElement apply;

	@FindBy(xpath="//button[text()='Search']")
	private WebElement btn;

	@FindBy(xpath="//button[text()='BOOK THIS NOW']/ancestor::div[@class='appendTop16 makeFlex hrtlCenter']")
	private WebElement book;
	
	@FindBy(xpath="//a[@class='prmRoomDtlCard__link']/following-sibling::div[@class='bookNowBtn ']")
	private WebElement book1;
	
	public WebElement getBook() {
		return book;
	}

	public WebElement getBook1() {
		return book1;
	}

	public void setBook1(WebElement book1) {
		this.book1 = book1;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	@FindBy(xpath="//span[text()='Country Inn and Suites by Radisson, Sahibabad']/ancestor::div[@class='makeFlex flexOne padding16 relative lftCol']")
	private WebElement hotelname;

	@FindBy(xpath="//span[text()='Breakfast Included']/ancestor::span[@data-testid='checkboxFilter']")
	private WebElement e;
	
	

	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getGuest() {
		return guest;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getLochotel() {
		return lochotel;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getE() {
		return e;
	}
	
	public void bookhotel(WebDriverUtils wlib, WebDriver driver)
	{
		
		getCity().click();
		getLochotel().click();
		getDatein().click();
		getDateout().click();
		getAdults().click();
		getGuest().click();
		getApply().click();
		getBtn().click();
		getE().click();
		//getPrice().click();
		getHotelname().click();
		wlib.switchToNewWindowWithUrl(driver, "https://www.makemytrip.com/hotels/hotel-details/?hotelId=201004011443288188&_uCurrency=INR&checkin=06032024&checkout=06052024&city=CTGHZ&country=IN&filterData=FREE_BREAKFAST_AVAIL%7CBREAKFAST_AVAIL&lat=28.65421&lng=77.3437&locusId=CTDEL&locusType=city&rank=1&regionNearByExp=3&roomStayQualifier=3e0e&rsc=1e3e0e&searchText=Delhi&mtkeys=-606963901321052953");
		wlib.waitforPageToLoad(driver);
		wlib.js(driver, book1);
		getBook1().click();
	}

	
}
