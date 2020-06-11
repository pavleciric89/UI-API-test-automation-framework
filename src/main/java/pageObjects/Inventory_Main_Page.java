package pageObjects;


import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class Inventory_Main_Page extends DriverFactory {

	public Inventory_Main_Page(){
	}


	WebDriverWait wait = new WebDriverWait(driver, 10);
	


	public void clickAddButton() throws Exception {
		WebElement btnAddToCart1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[3]//div[3]//button[contains(@class, 'btn_primary btn_inventory')]")));
		btnAddToCart1.click();
	}

	public void visibilityOfRedBadgeCounter() {
		WebElement redBadgeCounter = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		try {assertTrue(redBadgeCounter.isDisplayed());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectItems(int n) {
		for(int i=1; i <= n; i++) {
			String xpath = String.format(".//div['%s']//div[3]//button[contains(@class, 'btn_primary btn_inventory')]", n);
			WebElement buttonAdd = driver.findElement(By.xpath(xpath));
			buttonAdd.click();
		} 
	}

	public void clickOnCart() {
		WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@class='shopping_cart_link fa-layers fa-fw']"))) ;
		cart.click();
	}
	public void addItemInCartByName(String ItemName) {
		String xpath = String.format("//div[contains(., '%s')]/parent::a/parent::div/following-sibling::div/button", ItemName);
		WebElement itemElement = driver.findElement(By.xpath(xpath));
		itemElement.click();
	}
}

