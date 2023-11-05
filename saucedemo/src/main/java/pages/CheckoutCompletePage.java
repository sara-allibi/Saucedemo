package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import saucedemo.basePageObject;

public class CheckoutCompletePage extends basePageObject<CheckoutCompletePage> {
	
	private By CheckoutBackHomeButton = By.xpath("//button[@id='back-to-products']");
	private static By expectedThankU = By.xpath("//div[@id='checkout_complete_container']/h2");// add the right thank u path
	
	

	
	protected CheckoutCompletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void waitForCheckoutFinishPage() {
		

		waitForVisibilityOf(CheckoutBackHomeButton, 10);
		System.out.println("Purchase Completed");

	}
	
	public static boolean isCorrectText(String correntText) {
		if(getText(expectedThankU).equals(correntText)) {
			return true;
		}
		return false;
		
	}
	
	
	// adding verification for thank you text
	
	//Assert.assertTrue(pageName.isCorrectText(expectedThankU), "Profile Name is not Expected");
	

 
	
	
}
