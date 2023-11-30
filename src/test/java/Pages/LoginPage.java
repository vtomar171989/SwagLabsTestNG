package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement LoginButton;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginPage(String userNameVal, String passwordVal) {

		userName.sendKeys("standard_user");

		Password.sendKeys("secret_sauce");

		LoginButton.click();

	}
	
	public void productPage(String userNameVal, String passwordVal) {
		
		userName.sendKeys("users");

		Password.sendKeys("secrets");

		LoginButton.click();

		
		
		
		
	}

	

	

}
