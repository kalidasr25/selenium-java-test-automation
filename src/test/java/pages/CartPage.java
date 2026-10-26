package pages;

import extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    private WebElement btnCheckout;

    public CheckoutPage goToCheckout() {
        UIElementExtensions.performClick(btnCheckout);
        return new CheckoutPage(driver);
    }
}