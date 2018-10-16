package Calculator;

import Calculator.utils.Log;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Stas on 13.10.2018.
 */
public class BasePage {
    private WebDriver driver;

    @FindBy(css = "div h3")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@ng-model='first']")
    private WebElement firstInputValue;

    @FindBy(xpath = "//*[@ng-model='operator']")
    private WebElement operator;

    @FindBy(xpath = "//*[@ng-model='second']")
    private WebElement secondInputValue;

    @FindBy(id = "gobutton")
    private WebElement goButton;

    @FindBy(css = "h2.ng-binding")
    private WebElement resultField;

    @FindBy(css = "div > h4")
    private WebElement historyTitle;

    @FindBy(css = "table.table thead tr")
    private WebElement tableTitles;

    @FindBy(xpath = "//*[@ng-repeat='result in memory' and @class='ng-scope']")
    private List<WebElement> tableList;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return pageTitle.getText();
    }

    @Step
    public void typeFirstValue(String value) {
        Log.LOG.info("Typing first value: " + value);
        firstInputValue.sendKeys(value);
    }

    @Step
    public void changeOperatorTo(String elementValue) {
        Log.LOG.info("Setting operator to: " + elementValue);
        Select operatorValue = new Select(operator);
        operatorValue.selectByVisibleText(elementValue);
    }

    @Step
    public void typeSecondValue(String value) {
        Log.LOG.info("Typing second value: " + value);
        secondInputValue.sendKeys(value);
    }

    @Step
    public void clickOnGoButton() {
        Log.LOG.info("Clicking on go button");
        goButton.click();
    }

    @Step
    public String getResultFiledValue() {
        Log.LOG.info("Getting result: " + resultField.getText());
        return resultField.getText();
    }
}


