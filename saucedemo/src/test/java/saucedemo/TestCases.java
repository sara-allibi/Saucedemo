package saucedemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutStepOnePage;
import pages.CheckoutStepTwoPage;
import pages.HomePage;
import pages.LoginPage;

public class TestCases extends baseClass {

// this classs covers the 2 test cases needed to complete a purchase

	// First Login I considered it as a testcase1, it's a positve test case
	@Test (priority=-1)
	public void positiveLogin() {

		LoginPage loginPage = new LoginPage(driver);

		System.out.println("SuaceDemo Login Test");

		loginPage.openLoginPage();

		loginPage.fillUserNameAndPassword("standard_user", "secret_sauce");

		HomePage home = loginPage.pressLoginButton();
		home.waitForHomePage();

	}
	//second Purchase, it's TC2 also a positive testcase
	@Test (priority=1)
	public void Purchase() {
		
		String expectedThankU="Thank you for your order!";

		System.out.println("SuaceDemo Purchase Test");
		
		HomePage home = new HomePage(driver);
		
	// pressing bike light to add to cart
		home.pressBikeLightButton();

	// pressing cart icon to open cart page
		CartPage cart= home.pressCartButton();
		cart.waitForCartPage();
		
		CheckoutStepOnePage stepOne= cart.ClickChecoutButton();
		stepOne.waitForCheckoutStepOnePage();
		stepOne.fillNameAndZip("Sara", "Bakhit", "123");
		
		CheckoutStepTwoPage stepTwo= stepOne.ClickChecoutContinueButton();
		stepTwo.waitForCheckoutStepTwoPage();
		
		CheckoutCompletePage FinishPage=stepTwo.ClickChecoutContinueButton();
		FinishPage.waitForCheckoutFinishPage();
		
	
		Assert.assertTrue(CheckoutCompletePage.isCorrectText(expectedThankU), "Profile Name is not Expected");
		
	}

}
