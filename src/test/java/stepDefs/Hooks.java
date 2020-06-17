package stepDefs;

import ApiUtils.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import utils.DriverFactory;
 
public class Hooks extends DriverFactory {

	RestAssuredExtension apiMethods = new RestAssuredExtension();
	
	@Before ("@front-end")
	public void setup() {
		initWebDriver();
	}
	 
	@After("@front-end")
	public void tearDown() {
		tearDownDrivers();
	}

	@Before("@back-end")
	public void TestSetup() {
		RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
	}
}
