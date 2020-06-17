package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class Checkout_Step_One extends DriverFactory {

	public Checkout_Step_One() { 
	}
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
 
	public void enterFirstName(String firstName) {
		WebElement firstNameEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first-name']")));
		firstNameEl.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		WebElement lastNameEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='last-name']")));
		lastNameEl.sendKeys(lastName);
	}
	public void enterZipCode(String zipCode) {
		WebElement zipCodeEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='postal-code']")));
		zipCodeEl.sendKeys(zipCode);
	}
	public void clickContinueButton() {
		WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn_primary cart_button']")));
		continueButton.click();
	}
}
