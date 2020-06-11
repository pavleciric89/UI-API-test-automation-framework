package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks extends DriverFactory {

	@Before ("@front-end")
	public void setup() {
		initWebDriver();
	}
	 
	@After("@front-end")
	public void tearDown() {
		tearDownDrivers();
	}
}
