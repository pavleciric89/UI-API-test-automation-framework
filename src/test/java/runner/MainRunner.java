package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./src/test/java/featureFiles/"},
		glue = {"stepDefs"},
		plugin = {},
		monochrome = true,
		tags = {}
		)


public class MainRunner {

}
