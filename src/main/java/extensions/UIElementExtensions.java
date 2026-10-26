package extensions;

import org.openqa.selenium.WebElement;

public class UIElementExtensions    {

    public static void performEnterText(WebElement locator, String value){
        locator.click();
        locator.clear();
        locator.sendKeys(value);
    }

    public static void performClick(WebElement locator){
        locator.click();
    }
}
