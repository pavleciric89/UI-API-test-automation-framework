package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;


public class Cart_Page extends DriverFactory {

	public Cart_Page() {
	}

	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public int itemCount() {

		final List<WebElement> cartItems =driver.findElements(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item"));
		return cartItems.size();
	}


	public void checkNumberOfItems(int actual, int expected) {
		try{
			Assert.assertEquals(actual,expected);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void clickCheckout() {
		WebElement checkoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CHECKOUT")));
		checkoutButton.click();
	}

}
