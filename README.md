# SauceDemo E-commerce Automation Testing

## Project Overview
This project automates an end-to-end e-commerce purchase workflow on the SauceDemo website using Selenium WebDriver and Java. It follows the Page Object Model (POM) design pattern to organize page interactions and improve code reusability.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- IntelliJ IDEA

## Test Scenario
The automation covers the following workflow:

1. Launch the SauceDemo website.
2. Log in using valid credentials.
3. Navigate to the shopping cart.
4. Proceed to checkout.
5. Enter customer details.
6. Continue to the checkout overview.
7. Finish the checkout process.

## Project Structure
```text
seleniumJavaTest/
├── src/
│   ├── main/java/extensions/
│   │   └── UIElementExtensions.java
│   └── test/java/
│       ├── gettingStarted/
│       │   ├── SeleniumTest.java
│       │   └── TestNGTest.java
│       └── pages/
│           ├── LoginPage.java
│           ├── HomePage.java
│           ├── CartPage.java
│           ├── CheckoutPage.java
│           └── CheckoutOverviewPage.java
├── testng.xml
├── pom.xml
└── .gitignore
```

## Prerequisites
- Java JDK installed
- IntelliJ IDEA or another Java IDE
- Maven
- Google Chrome browser

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/kalidasr25/selenium-java-test-automation.git
   ```
2. Open the project in IntelliJ IDEA.
3. Allow Maven to download the required dependencies.
4. Run the TestNG test class or execute the configured TestNG suite.

## Application Under Test
[SauceDemo](https://www.saucedemo.com/)

## Learning Objectives
- Practice Selenium WebDriver automation.
- Implement the Page Object Model.
- Organize UI automation code into reusable page classes.
- Execute automated tests using TestNG and Maven.

## Author
Kalidas R
