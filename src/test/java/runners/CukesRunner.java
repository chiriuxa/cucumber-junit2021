package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)      //This line will force this to RUN using cucumber
@CucumberOptions (
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "@yourLogo2"
)

public class CukesRunner {


}
