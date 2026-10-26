package pages;

import extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    private WebElement txtFirstName;

    @FindBy(id = "last-name")
    private WebElement txtLastName;

    @FindBy(id = "postal-code")
    private WebElement txtPostalCode;

    @FindBy(id = "continue")
    private WebElement btnContinue;

    public void enterFirstName(String firstName) {
        UIElementExtensions.performEnterText(txtFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        UIElementExtensions.performEnterText(txtLastName, lastName);
    }

    public void enterPostalCode(String postalCode) {
        UIElementExtensions.performEnterText(txtPostalCode, postalCode);
    }

    public CheckoutOverviewPage clickContinue() {
        UIElementExtensions.performClick(btnContinue);
        return new CheckoutOverviewPage(driver);
    }
}