package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber-features",
        plugin = {"pretty",
                "html:target/cucumber/cucumber.html",
                "json:target/cucumber/cucumber.json",
                "usage:target/cucumber/usage.jsox",
                "junit:target/cucumber/junit.xml"
       },
       tags = "not @ignore")
public class RunCucumberTest {
}
