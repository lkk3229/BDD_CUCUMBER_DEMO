package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//lavkumar.k//IdeaProjects//SeleniumCucumber//Features//OrangeHRM.Feature",
                 glue= "stepDefinitions")
public class TestRunner {
}
