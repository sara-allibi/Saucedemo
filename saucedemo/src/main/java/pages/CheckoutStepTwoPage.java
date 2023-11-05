package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import saucedemo.basePageObject;

public class CheckoutStepTwoPage extends basePageObject<CheckoutStepTwoPage> {
	
	//this class to help me interact with Checkout step two page actions using elements 
	//I created the needed functions only you can see them below
	
	private By CheckoutFinishButton = By.xpath("//button[@id='finish']");
	
	

	protected CheckoutStepTwoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void waitForCheckoutStepTwoPage() {
		System.out.println("waiting for Payment page to load");

		waitForVisibilityOf(CheckoutFinishButton, 10);

	}
	
	public CheckoutCompletePage ClickChecoutContinueButton() {

		Click(CheckoutFinishButton);
		System.out.println("Clicking the finish/compele Button");
		return new CheckoutCompletePage(driver);

	}

}
