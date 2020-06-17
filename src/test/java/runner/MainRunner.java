package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./src/test/java/featureFiles/"},
		glue = {"stepDefs"},
		strict = true,
		dryRun = false,
		plugin = {	"pretty",
				"html:target/Reports/cucumber-pretty",
				"html:target/cucumber-html-report",
				"json:target/cucumber/cucumber.json"
				},
		monochrome = true,
		tags = {}
		)


public class MainRunner {

}
