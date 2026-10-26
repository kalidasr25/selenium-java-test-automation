package gettingStarted;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class SeleniumTest {
    public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        HomePage homePage = loginPage.clickLogin();
        CartPage cartPage = homePage.goToCart();
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.enterFirstName("Kalidas");
        checkoutPage.enterLastName("R");
        checkoutPage.enterPostalCode("600116");
        CheckoutOverviewPage overviewPage = checkoutPage.clickContinue();
        overviewPage.finishCheckout();
        driver.quit();

    }
}
