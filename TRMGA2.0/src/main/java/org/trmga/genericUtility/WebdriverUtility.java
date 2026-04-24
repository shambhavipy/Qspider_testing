package org.trmga.genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	
	/**
	 * to maximize the current browser
	 * @param driver
	 */
	public void toMaximize(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
	/**
	 * to wait implicitly
	 * @param driver
	 * @param seconds
	 */
	public void toImplicitlywait(WebDriver driver, int seconds) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	
	/*
	 * public void toWaitExplicitly(WebDriver driver, int time, WebElement element)
	 * {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	 * 
	 * WebElement popup =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(element))); }
	 */
	
	
	/**
	 * to select value type from dropdown
	 * @param element
	 * @param value
	 */
	
	public void toSelectbyValue(WebElement element, String value) {
		
		Select sc = new Select(element);
		sc.selectByValue(value);
		
	}
	
	/**
	 * to select dropdown value by Index
	 * @param element
	 * @param index
	 */
	
	public void toSelectbyIndex(WebElement element, int index) {
		
		Select sc= new Select(element);
		sc.selectByIndex(index);
	}
	 
	/**
	  * to select dropdown value by visible text
	  */
	
	public void toSelectbyVisibleText(WebElement webelement, String text) {
		
		Select sc = new Select(webelement);
		sc.selectByVisibleText(text);
	}
	
	/**
	 * to deselect value from dropdown by index
	 * @param element
	 * @param index
	 */
	public void toDeselectbyIndex(WebElement element, int index) {
		
		Select sc = new Select(element);
		sc.deselectByIndex(index);
	}
	/**
	 * To deselect value from dropdown by value
	 * @param element
	 * @param Value
	 */
	
	public void toDeselectbyValue(WebElement element, String Value) {
		
		Select sc = new Select(element);
		sc.deselectByValue(Value);
	}
	/**
	 * To deselect value from dropdown by visible text
	 * @param element
	 * @param text
	 */
	
	public void toDeselectbyVisibletext(WebElement element, String text) {
		
		Select sc = new Select(element);
		sc.deselectByVisibleText(text);
	}
	/**
	 * To deselect all values from the dropdown
	 * @param element
	 */
	
	public void toDeselectAll(WebElement element) {
		Select sc = new Select(element);
		sc.deselectAll();
	}
	
	public void toMouseHoverbyOffset(WebDriver driver,int X, int Y) {
		
		Actions act = new Actions(driver);
		act.moveByOffset(X, Y).perform();

	}
	
	public void toMouseHoverbyElement(WebDriver driver, WebElement element) {
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	public void toScrollToElement(WebDriver driver, WebElement element) {
		
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();;
		
	}
	
	public void toScrollByAmount(WebDriver driver, int X, int Y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(X, Y);
	}
	
	public void toWaitForElement1(WebDriver driver, WebElement element, int seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public void toWaitForElement(WebDriver driver,WebElement element,int seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		
	//WebDriver driver = new ChromeDriver();
	
	public void driverControl(WebDriver driver,String partialTitle) {
		
		Set<String> allSessionID = driver.getWindowHandles();
		
		for(String string : allSessionID) {
			
			driver.switchTo().window(string);
			String title = driver.getTitle();
			
			if(title.contains(partialTitle)) {
				break;
			}
		}
	}
	
//	WebDriver driver = new ChromeDriver();
//	public void Alert(WebDriver driver) {
//		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.
//		
//		
//	}
		
	
	
}
