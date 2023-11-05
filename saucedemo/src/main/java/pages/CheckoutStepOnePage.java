package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import saucedemo.basePageObject;

public class CheckoutStepOnePage extends basePageObject<CheckoutStepOnePage> {
	
	//this class to help me interact with Checkout step one page actions using elements 
		//I created the needed functions only you can see them below

	private By CheckoutContinueButton = By.xpath("//input[@id='continue']");
	
	private By firstnameFiled = By.xpath("//input[@id='first-name']");
	private By 	lastnameField = By.xpath("//input[@id='last-name']");
	private By zipField= By.xpath("//input[@id='postal-code']");

	protected CheckoutStepOnePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// verify that the screen is open by waiting for element

	public void waitForCheckoutStepOnePage() {
		System.out.println("waiting for Cart page to load");

		waitForVisibilityOf(CheckoutContinueButton, 10);

	}

	// fill firstname, lastname, and Zip code

	public void fillNameAndZip(String firstname, String lastname, String zip) {



		type(firstname, firstnameFiled);
		type(lastname, lastnameField);
		type(zip, zipField);
		
		System.out.println("Filling firstname, lastname and Zip code");
	}

	// Press continue
	public CheckoutStepTwoPage ClickChecoutContinueButton() {

		Click(CheckoutContinueButton);
		System.out.println("Clicking the checkout Button");
		return new CheckoutStepTwoPage(driver);

	}
	
	

}
