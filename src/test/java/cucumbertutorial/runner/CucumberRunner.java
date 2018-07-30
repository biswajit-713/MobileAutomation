package cucumbertutorial.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {"not @Ignore"},
        features = "classpath:features",
        glue = {"cucumbertutorial.steps"},
        strict = true,
        snippets = SnippetType.UNDERSCORE
)
public class CucumberRunner {

}
