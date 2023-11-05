package saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePageObject<T> {
	// this class allow me to create all the needed functions that helps me to talk with the html design
	
	protected static WebDriver driver;
	protected WebDriverWait wait;
	
	//opening the webdriver
	protected  basePageObject(WebDriver driver) {
		this.driver = driver;
		wait= new WebDriverWait(driver,Duration.ofSeconds(40));
		
	}
	//getting the wanted webdriver url
	@SuppressWarnings("unchecked")
	protected T getPageUrl(String url) {
		driver.get(url);
		return (T)this;
		
	}
	//getting the element by it's element ID
	protected void type(String text, By element) {
		find(element).sendKeys(text);
		
	}
	//executing a click action on specific element ID
	protected void Click(By element) {
		find(element).click();
		
	}
	//Returning a found webelement ID
	private static WebElement find(By element) {
		return driver.findElement(element);
		
	}
	//checking if the new webpage is open by checking an element visibility, if not wait for few seconds then check again
	protected void waitForVisibilityOf(By locator, Integer...timeOutInSeconds) {
		int attempts=0;
		while(attempts<2) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator), (timeOutInSeconds.length>0 ? timeOutInSeconds[0]: null));
				break;
			}catch(StaleElementReferenceException e){
				
				
			}
			attempts++;
			
		}
		
		
	}
	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
		timeOutInSeconds= timeOutInSeconds !=null? timeOutInSeconds:30;
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOutInSeconds));
		
		wait.until(condition);
	}
	// getting an element text
	protected static String getText(By element) {
		return find(element).getText();
		
	}
	
	
	
	
	

}
