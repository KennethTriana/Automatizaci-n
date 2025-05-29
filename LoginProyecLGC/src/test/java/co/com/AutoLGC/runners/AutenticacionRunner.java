package co.com.AutoLGC.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion_login.feature",
        glue = {"co.com.AutoLGC.stepsdefinitions", "co.com.AutoLGC.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class AutenticacionRunner {
}