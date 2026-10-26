package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extensions.UIElementExtensions;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement txtUserName;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String usernameValue) {
        UIElementExtensions.performEnterText(txtUserName, usernameValue);
    }

    public void enterPassword(String passwordValue) {
        UIElementExtensions.performEnterText(txtPassword, passwordValue);
    }

    public HomePage clickLogin() {
        UIElementExtensions.performClick(btnLogin);
        return new HomePage(driver);
    }
}
