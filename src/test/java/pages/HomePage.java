package pages;

import extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCart;

    @FindBy(className = "shopping_cart_link")
    private WebElement btnCart;

    public void addToCart(){
        UIElementExtensions.performClick(btnAddToCart);
    }

    public CartPage goToCart() {
        UIElementExtensions.performClick(btnCart);
        return new CartPage(driver);
    }

}
