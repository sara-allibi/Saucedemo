package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseClass {
	// this class defines the needed to do things before the tests and after the tests
	 protected WebDriver driver;

	    @BeforeTest
	    protected void startBrowser() {
	    	//defining the property of chrome for this test
	    	System.setProperty("webdriver.chrome.driver", "/Users/sara_allibi/Downloads/chromedriver-mac-arm64/chromedriver");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(co);
			
			//open suace website
			System.out.println("Browser Opend");
	    }

	    @AfterTest
	    protected void closeBrowser() {
	    	//quit after executing the tests
	    	System.out.println("Browser Closed");
	        driver.quit();
	    }

	

}
