package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;  


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/featureFiles"},
		glue = {"stepDefs"},
		strict = true,
		dryRun = false,
		plugin = {"pretty",
				"json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-html-report",
				"junit:target/cucumber-reports/cucumber.xml"},
		monochrome = true
		
		)


public class MainRunner extends AbstractTestNGCucumberTests{

}
