package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import saucedemo.basePageObject;

public class LoginPage extends basePageObject<LoginPage> {
	
	//this class to help me interact with login page actions using elements 
	//I created the needed fuctions only you can see them below
	
	private static final String url="https://www.saucedemo.com/";
	
	private By emailField= By.xpath("//input[@id='user-name']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='login-button']");
	
	public LoginPage(WebDriver driver) {
		super (driver);
		
	}
	
	public void openLoginPage() {
		getPageUrl(url);
	}
	
	public void fillUserNameAndPassword(String email, String password) {
		
		System.out.println("Filling user name and password");
		
		type(email, emailField);
		type(password,passwordField);
	}
	
	public HomePage pressLoginButton() {
		
		System.out.println("Clicking the Login button");
		
		Click(loginButton);
		return new HomePage(driver);
	}
	
}