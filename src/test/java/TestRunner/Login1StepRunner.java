package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/src/test/java/Feature/LogIn1.feature", glue = { "StepDefinitions" }, monochrome = true, plugin = { "pretty",
		"html:target/HTMLreports/reports", "json:target/JSONreports/cucumber.json",
		"junit:target/JunitReports/reports.xml" })
public class Login1StepRunner {

}
