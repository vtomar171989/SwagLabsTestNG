package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BasePage {
	
	@Test
	public void productPage() {
		LoginPage login = new LoginPage(driver);
		login.loginPage("username", "password");

		WebElement validPage = driver.findElement(By.xpath("//div[@class='product_label']"));
		System.out.println(validPage.getText());

		Assert.assertEquals(validPage.getText(), "Products");

	}
	@Test
	public void loginFailure() {
		LoginPage login = new LoginPage(driver);
		login.productPage("standarduser", "secretsauce");

		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		System.out.println(errorMessage.getText());

		Assert.assertEquals(errorMessage.getText(), "Epic sadface: Username and password do not match any user in this service");
	}

	
	

}
