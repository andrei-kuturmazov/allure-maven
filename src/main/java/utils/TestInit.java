package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestInit {

    @BeforeClass
    public static void before() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
    }

    @AfterClass
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
