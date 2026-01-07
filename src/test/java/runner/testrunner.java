package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features/",
        glue = {"seleniumgluecode"},
        snippets = CAMELCASE
)
public class testrunner {



}
