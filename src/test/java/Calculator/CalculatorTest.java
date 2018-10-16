package Calculator;

import Calculator.data.ValuesForCalculateDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Stas on 13.10.2018.
 */
public class CalculatorTest extends BaseTest {

    @Test(dataProvider = "valuesForCalculate", dataProviderClass = ValuesForCalculateDataProvider.class)
    public void NewTest(String firstValue, String operator, String secondValue, String expectedResult) {
        BasePage basePage = new BasePage(driver);
        basePage.typeFirstValue(firstValue);
        basePage.changeOperatorTo(operator);
        basePage.typeSecondValue(secondValue);
        basePage.clickOnGoButton();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.not(ExpectedConditions.
                textToBePresentInElement(By.cssSelector("h2.ng-binding"), ".")));
        String actualResult = basePage.getResultFiledValue();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
