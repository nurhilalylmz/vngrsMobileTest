package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/test/java/Feature/TestCases.feature"},
            format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
            glue = {"src/test/java/Steps/"})
    public class testRunner {

    }

