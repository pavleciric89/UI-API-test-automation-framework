package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Inventory_Main_Page;
import pageObjects.Login_Page;

public class DriverFactory {

	public static WebDriver driver;
	public static Login_Page loginPage;
	public static Inventory_Main_Page inventoryMainPage;

	public static void initWebDriver() {
		try {

			String browser = ReadConfigFile.readConfig("browser");
			String webSiteUrl = ReadConfigFile.readConfig("URL");

			switch (browser.toLowerCase()) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver(options);
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				driver = new FirefoxDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			}
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get(webSiteUrl);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}



	public static void tearDownDrivers() {
		if (driver != null) {
			driver.quit();
		}
	}


}
