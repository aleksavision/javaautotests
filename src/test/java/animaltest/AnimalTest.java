package animaltest;

import Universe.Pluton;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertEquals;

public class AnimalTest {

    @BeforeClass
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("---incognito");
        options.addArguments("---disable-gpu");
        options.addArguments("---enable-automation");
        options.addArguments("---headless");
        options.addArguments("---window-size=1920,1080");
        options.addArguments("---no-sandbox");
        options.addArguments("---disable-extensions");
        options.addArguments("---dns-prefetch-disable");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);

        Configuration.browserCapabilities = options;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        Configuration.headless = true;

        open("google.com");
    }


    @Test
    public void testSomethingFirst() {
    Pluton pluton = new Pluton(500);
    assertEquals("For Test Box", pluton.boxBox("For Test Box"));
    }

    @Test
    public void testSomethingSecond() {
        Pluton pluton = new Pluton(500);
        assertEquals("For Test Box", pluton.boxBox("For Test Box"));
    }

    @After
    public void tearDown() {
        // closeWebDriver() не закрывает браузер, если closeBrowser установлен в false
        closeWebDriver();
    }


}
