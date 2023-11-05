package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import saucedemo.basePageObject;

public class HomePage extends basePageObject<HomePage> {
	
	//this class to help me interact with Home/Items page actions using elements 
		//I created the needed fuctions only you can see them below

	private By menuButton = By.xpath("//button[@id='react-burger-menu-btn']");
	private By BikeLightButton = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	private By CartButton = By.xpath("//div[@id='shopping_cart_container']");
	
	public HomePage(WebDriver driver) {
		super(driver);

	}

	public void waitForHomePage() {
		System.out.println("waiting for home page to load");

		waitForVisibilityOf(BikeLightButton, 10);

	}

	// add bikelight to the cart
	public void pressBikeLightButton() {

		Click(BikeLightButton);
		System.out.println("Clicking the bikelight add to cart button");

	}

// press the cart button to see the cart screen
	public CartPage pressCartButton() {

		Click(CartButton);
		System.out.println("Clicking the cart button");
		return new CartPage(driver);

	}
	
}
	
