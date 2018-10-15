package Calculator;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

/**
 * Created by Stas on 13.10.2018.
 */
public class BaseTest {
    public WebDriver driver;
    public static int timeOut = 15;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        ChromeDriverManager.chromedriver().setup(); //instead of setProperty
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
    }


    @AfterMethod(alwaysRun = true)
    public void closeDown() {
//        driver.close();
    }
}
