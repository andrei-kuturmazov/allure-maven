package cucumberAutoTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        features = {"./src/test/resources/features/buyItems.feature"},
        glue = {"steps"}
)
public class CucumberTest extends TestInit {

}
