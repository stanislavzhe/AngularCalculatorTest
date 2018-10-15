package Calculator.data;

import org.testng.annotations.DataProvider;

/**
 * Created by Stas on 15.10.2018.
 */
public class ValuesForCalculateDataProvider {
    @DataProvider
    public static Object[][] valuesForCalculate() {
        return new Object[][]{
                {"1", "+", "1", "2"},
                {"1", "+", "2", "3"},
                {"1", "-", "1", "0"},
                {"2", "*", "3", "6"},
                {"6", "/", "2", "3"},
                {"12", "%", "10", "2"}};
    }
}
