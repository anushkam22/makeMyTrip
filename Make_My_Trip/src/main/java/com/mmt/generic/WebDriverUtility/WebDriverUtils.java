package com.mmt.generic.WebDriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	public void waitforPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void js( WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

	public void waitForVisibilityOfElement(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void selectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public void selectByText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByValue(text);
	}

	public void selectByIndex(WebElement ele, int i) {
		Select s = new Select(ele);
		s.selectByIndex(i);
	}

	public void moveToElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		;
	}

	public void contextClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		;
	}

	public void contextClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
		;
	}

	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		;
	}

	public void dragAndDrop(WebDriver driver, WebElement drag, WebElement drop) {
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		;
	}

	public void switchToFrame(WebDriver driver, int no) {
		driver.switchTo().frame(no);
	}

	public void switchToFrame(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}

	public void switchToFrame(WebDriver driver, WebElement value) {
		driver.switchTo().frame(value);
	}

	public void switchToNewWindowWithUrl(WebDriver driver, String url) {

		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);
			String actStr = driver.getCurrentUrl();
			if (actStr.contains(url)) {
				break;
			}
		}
	}

	public void switchToNewWindowWithTitle(WebDriver driver, String title) {

		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);
			String actStr = driver.getTitle();
			if (actStr.contains(title)) {
				break;
			}
		}
	}
	
	public void jsscrolltillele(WebDriver driver,WebElement ele) {
		
		Rectangle rec = ele.getRect();
		int x = rec.getX();
		int y = rec.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		
	}}