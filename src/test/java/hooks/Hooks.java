package hooks;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;

import java.io.IOException;

public class Hooks {
    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            takeScreenshotOnFailure();
        }
    }

    @Attachment(type = "image/png")
    private byte[] takeScreenshotOnFailure() throws IOException {
        return Files.toByteArray(Screenshots.takeScreenShotAsFile());
    }
}
