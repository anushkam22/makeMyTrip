package com.mmt.generic.ObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mmt.generic.WebDriverUtility.WebDriverUtils;

public class HomestayPage extends BaseClass {

	public HomestayPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(xpath = "//li[text()='3']")
	private WebElement guest;

	@FindBy(xpath = "//div[text()='June']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='5']")
	private WebElement dateout;

	@FindBy(xpath = "//div[text()='June']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='3']")
	private WebElement datein;

	@FindBy(xpath = "//p[text()='Adults']/ancestor::div[@class='rmsGst__row']/descendant::div[@data-testid='gstSlct']")
	private WebElement adults;

	@FindBy(id = "react-autowhatever-1-section-0-item-0")
	private WebElement lochotel;

	@FindBy(id = "fName")
	private WebElement fName;

	@FindBy(id = "lName")
	private WebElement lName;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "mNo")
	private WebElement mNo;

	@FindBy(xpath="//span[@class='checkboxWpr']")
	private WebElement gst;

	@FindBy(xpath = "//a[text()='Pay Now']")
	private WebElement pay;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getmNo() {
		return mNo;
	}

	public WebElement getGst() {
		return gst;
	}

	public WebElement getPay() {
		return pay;
	}

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btn;

	@FindBy(xpath = "//input[@placeholder='Where do you want to stay?']")
	private WebElement to;

	public WebElement getTo() {
		return to;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	@FindBy(xpath = "//div[@class='flexOne appendLeft20']/ancestor::div[@class='flexOne makeFlex']")
	private WebElement hotelname;

	@FindBy(xpath = "//a[text()='BOOK THIS NOW']/ancestor::div[@class='prmRoomDtlCard appendBottom10  ']")
	private WebElement book;

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

	public WebElement getBook() {
		return book;
	}

	public void bookhomestay(WebDriverUtils wlib, WebDriver driver) throws Throwable {
		getCity().click();
		getTo().click();
		getLochotel().click();
		getDatein().click();
		getDateout().click();
		getAdults().click();
		getGuest().click();
		getApply().click();
		getBtn().click();
		getHotelname().click();
		wlib.switchToNewWindowWithUrl(driver,
				"https://www.makemytrip.com/hotels/hotel-details/?hotelId=202310222024334728&_uCurrency=INR&checkin=06032024&checkout=06052024&city=CTDEL&country=IN&homestay=true&lat=28.54839&lng=77.1277&locusId=CTDEL&locusType=city&rank=1&regionNearByExp=3&roomStayQualifier=3e0e&rsc=1e3e0e&searchText=Delhi&mtkeys=5943096096606207150");
		Thread.sleep(20);
		wlib.jsscrolltillele(driver, book);
		getBook().click();
		wlib.switchToNewWindowWithUrl(driver,
				"https://www.makemytrip.com/hotels/hotel-review?_uCurrency=INR&checkin=06032024&checkout=06052024&city=CTDEL&country=IN&homestay=true&hotelId=202310222024334728&lat=28.54839&lng=77.1277&locusId=CTDEL&locusType=city&mtKey=5943096096606207150&mtkeys=5943096096606207150&payMode=PAS&rank=1&regionNearByExp=3&roomCriteria=7783608~%7C~5943096096606207150~%7C~3e0e&roomStayQualifier=3e0e&rsc=1e3e0e&searchText=Delhi&searchType=E&suppDetail=");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		getfName().click();
		getfName().sendKeys("anushka");
		getlName().click();
		getlName().sendKeys("m");
		getEmail().click();
		getEmail().sendKeys("aam@gmail.com");
		getmNo().click();
		getmNo().sendKeys("7066363194");
		js.executeScript("window.scrollBy(0,450)");
		getGst().click();
		getPay().click();
	}

}
