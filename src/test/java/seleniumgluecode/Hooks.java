package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {


    private static ChromeDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();

    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}
