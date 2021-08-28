package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//This line will force this to RUN using cucumber
@CucumberOptions (
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = true  //"TRUE"it will not Trigger our driver, and we are using this just to get step_definition classes
                        //"FALSE" will run our test the steps will be executed
)

public class CukesRunner {


}
