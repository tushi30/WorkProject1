package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBase {

    public static WebDriver driver;

    @Before
    public void Before() {

        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();



    }
    @After
    public void After() {
        driver.close();
    }
}
