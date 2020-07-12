package cucumberAutoTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        features = {"./src/test/resources/features/buyItems.feature"},
        glue = {"steps"},
        snippets = SnippetType.CAMELCASE
)
public class CucumberTest extends TestInit {
}
