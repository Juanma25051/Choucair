package co.com.choucair.certification.PruebaTecnica.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/utest.feature",
        tags = "@Feature1",
        glue = "co.com.choucair.certification.PruebaTecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
