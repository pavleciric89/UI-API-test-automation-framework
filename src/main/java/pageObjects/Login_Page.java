package pageObjects;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.DriverFactory;


public class Login_Page extends DriverFactory {

	public Login_Page() {
	}
	WebElement textInputUserName = driver.findElement(By.xpath("//input[@id='user-name']"));
	WebElement textInputPass = driver.findElement(By.xpath("//input[@id='password']"));
	WebElement btnLogin = driver.findElement(By.xpath("//input[@class='btn_action']"));


	public void sendLoginCredentials(String username, String password) {
		textInputUserName.sendKeys(username); 
		textInputPass.sendKeys(password);
	}

	public void clickLoginButton() throws Exception {
		btnLogin.click();
	}

	public void visibilityOfInvalidCredentialsMsg(){
		WebElement btnError = driver.findElement(By.xpath("//button[@class='error-button']"));
		assertTrue(btnError.isDisplayed());
	}
	public void accessToInventoryPage() {
		String CurrentUrl = driver.getCurrentUrl();
		try{
			Assert.assertEquals(CurrentUrl, "https://www.saucedemo.com/inventory.html");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
