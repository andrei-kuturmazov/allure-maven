package cucumberAutoTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.qameta.allure.Attachment;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;


public class TestInit {

    //@Rule
    //public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();

    @BeforeClass
    public static void before() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        if ("true".equals(System.getProperty("video.enabled"))) {
            Configuration.browserCapabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities.setCapability("videoFrameRate", 24);
        }
    }

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

    @AfterClass
    public static void tearDown() {
        Selenide.close();
    }
}
