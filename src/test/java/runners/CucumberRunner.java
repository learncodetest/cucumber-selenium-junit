package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
											features = "src/test/resources/features", 
											glue = "tests", 
											monochrome = true,
											plugin={"pretty", "html:target/cucumber-report/","json:target/cucumber-report/cucumber.json"})
public class CucumberRunner {

}