package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class TestNGTest{

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    private CheckoutOverviewPage checkoutOverviewPage;
    private CartPage cartPage;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
    }

    @Test
    public void completePurchase(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");

        homePage = loginPage.clickLogin();

        homePage.addToCart();

        cartPage = homePage.goToCart();

        checkoutPage = cartPage.goToCheckout();

        checkoutPage.enterFirstName("Kalidas");
        checkoutPage.enterLastName("Kalidas");
        checkoutPage.enterPostalCode("600116");

        checkoutOverviewPage = checkoutPage.clickContinue();

        checkoutOverviewPage.finishCheckout();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}