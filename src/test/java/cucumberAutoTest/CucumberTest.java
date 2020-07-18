package cucumberAutoTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        features = {"./src/test/resources/features/buyItems.feature"},
        glue = {"steps"}
        //snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTest extends TestInit {

}
