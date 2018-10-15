package Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Stas on 13.10.2018.
 */
public class CalculatorTest extends BaseTest{

    @Test
    public void NewTest() throws InterruptedException {
        BasePage basePage = new BasePage(driver);
        basePage.typeFirstValue("123");
        basePage.changeOperatoTo("-");
        basePage.typeSecondValue("321");
        basePage.clickOnGoButton();

        WebDriverWait wait = new WebDriverWait(driver, 10);

//        WebElement element = wait.until(ExpectedConditions.
//                not(ExpectedConditions.titleContains(".")));

        Thread.sleep(5000);
        System.out.println(basePage.getResultFiledValue());

    }
}
