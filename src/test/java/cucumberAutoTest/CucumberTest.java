package cucumberAutoTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.TestInit;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        features = {"./src/test/resources/features/buyItems.feature"},
        glue = {"steps", "hooks"}
)
public class CucumberTest extends TestInit {
}
