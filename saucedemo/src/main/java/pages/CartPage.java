package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import saucedemo.basePageObject;

public class CartPage extends basePageObject<CartPage> {
	
	//this class to help me interact with Cart page actions using elements 
		//I created the needed fuctions only you can see them below
	
	private By CartCheckoutButton = By.xpath("//button[@id='checkout']");

	protected CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// verfy that the screen is open by waiting for element
	
	public void waitForCartPage() {
		System.out.println("waiting for Cart page to load");

		waitForVisibilityOf(CartCheckoutButton, 10);

	}
	//Press checkout
	public CheckoutStepOnePage ClickChecoutButton() {

		
		Click(CartCheckoutButton);
		System.out.println("Clicking the checkout Button");
		return new CheckoutStepOnePage(driver);

	}

}
