package co.com.CategoriaLGC.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/categoria.feature",
        glue = {"co.com.CategoriaLGC.stepsdefinitions", "co.com.CategoriaLGC.utils.hooks"},
        snippets = SnippetType.CAMELCASE)
public class CategoriaRunner {
}
